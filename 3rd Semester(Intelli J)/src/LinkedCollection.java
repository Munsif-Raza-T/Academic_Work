public class LinkedCollection extends AbstractCollection {
    public static class Node{
        Object object;
        Node prev,next;
        public Node(){
            prev=next=this;
        }

        public Node(Object object, Node prev, Node next) {
            this.object = object;
            this.prev = prev;
            this.next = next;
        }

    }

    private Node head = new Node();
    private int size;

    public boolean add(Object object){
        head.prev = head.prev.next = new Node(object,head.prev,head);
        ++size;
        return true;
    }

    public Iterator iterator(){
        return new Iterator() {
            private Node cursor = head.next;
            private boolean okToRemove = false;
            @Override
            public boolean hasNext() {
                return cursor!=head;
            }

            @Override
            public Object next() {
                if (cursor == head) throw new RuntimeException();
                okToRemove = true;
                Object object = cursor.object;
                cursor = cursor.next;
                return object;
            }

            @Override
            public void remove() {
                if (!okToRemove) throw new IllegalStateException();
                cursor.prev = cursor.prev.prev;
                cursor.prev.next = cursor;
                --size;
                okToRemove = false;

            }
        };

    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        LinkedCollection collection = new LinkedCollection();
        collection.add("Munsif");
        collection.add("Raza");
        System.out.println(collection);
        collection.remove("Raza");
        System.out.println(collection);
        System.out.println(collection.contains("Munsif"));
    }
}
