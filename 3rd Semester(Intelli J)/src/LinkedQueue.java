public class LinkedQueue {

    private Node head = new Node(null);
    private int size;

    public void add(Object data){
        head.prev = head.prev.next = new Node(data, head.prev, head);
        ++size;
    }

    public Object first(){
        return head.next.data;
    }

    public Object remove(){
        if(isEmpty()) throw  new IllegalStateException("Queue is empty!");
        Object firstElement = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return firstElement;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void reverse(){
        LinkedQueue temp = new LinkedQueue();
        for(Node i = head.prev; i.data != null; i = i.prev){
            temp.add(i.data);
        }
        this.head.next = temp.head.next;
        this.head.prev = temp.head.prev;
    }

 /*   public void reverse(){
        Node previous = null;
        Node next = null;
        Node current = head;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }*/

    public String toString(){
        String string = "[" ;
        for(Node i = head.next; i != head; i=i.next){
            string += i.data+",";
        }
        return string+"]";
    }

    public boolean equals(LinkedQueue linkedQueue){
        if(linkedQueue.size != size) return false;
        for(Node i = head.next ,  j = linkedQueue.head.next; i != head; i=i.next, j=j.next ){
            if(!i.data.equals(j.data)) return false;
        }
        return true;
    }

    public LinkedStack toStack(){
        LinkedStack linkedStack = new LinkedStack();
        for(Node i = head.next; i != head; i=i.next){
            linkedStack.push(i.data);
        }
        return linkedStack;
    }

    public Object removeBottomElement(){
        Object object = "";
        for(Node i = head.next; i != head; i = i.next){
            if( i.next.next.data.equals(null) ){
                object = i.next.data;
                i.next = head;
                --size;
            }
        }

        return object;
    }

    public LinkedQueue clone(){
        LinkedQueue linkedQueue = new LinkedQueue();
        for(Node i = head.next; i != head; i = i.next){
            linkedQueue.add(i.data);
        }

        return linkedQueue;
    }

    private static class Node{
        Object data;
        Node prev = this , next = this;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }




    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.add("Munsif");
        queue.add("Raza");
        queue.add("Thebo");

        queue.reverse();
        System.out.println(queue.remove());

    }
}
