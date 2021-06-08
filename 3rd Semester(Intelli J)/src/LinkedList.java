class LinkedList{
    private Node start;
    private int size;
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data=data;this.next=next;
        }
    }
    //Traversing a linked list
    public void printList(){
        for (Node p = start; p!=null; p=p.next){
            System.out.println(p.data);
        }
    }
    //Inserting element in a linked list
    public Node insert(int x){
        Node p = start;
        if(start == null || start.data > x){
        start = new Node(x, start);
        ++size;
        return start;
        }
        while(p.next != null){
            if(p.next.data>x) break;
            p=p.next;
            }
        p.next = new Node(x, p.next);
        ++size;
        return start;
    }

    //deleting an element from a linked list
    public Node delete(int x){
        if(start == null || start.data > x){
            //x is not in the list
             return start;
        }
        if(start.data==x){
            //x is the first element in the list
             start = start.next;
             --size;
             return start;
        }
        for(Node p=start; p.next!=null; p = p.next){
            if(p.next.data>x) break;
            if(p.next.data == x){
                p.next=p.next.next;
                --size;
                break;
            }
        }
        return start;
    }

    // size
    public int size(){
        return size;
    }

    // search Index
    public int search(int x){
        int index = 0;
        if(start == null || start.data > x)
            return -1;
        for(Node p=start; p.next!=null; p = p.next) {
            if (p.next.data > x) break;
            if(p.next.data == x )
                return ++index;
            ++index;
        }
        return -1;
    }

    // Sum of elements
    public int sum(){
        int sum = 0;
        if(start == null) return 0;
        for(Node p=start; p !=null; p = p.next){
            sum += p.data;
        }
        return sum;
    }

    // Delete Last element
    public void deleteLast(){
        if(start == null)
            return;
        for(Node p=start; p !=null ; p = p.next){
            if(p.next.next == null)
                p.next = null;
        }
    }

    // copy of LinkedList
    public LinkedList copy(){

        LinkedList copy = new LinkedList();
        for(Node p=start; p != null; p = p.next){
            copy.insert(p.data);
        }

        return copy;
    }

    // Sub LinkedList
    public LinkedList subList(int i, int j){
        LinkedList subList = new LinkedList();
        int index = 0;
        for(Node p=start; p.next!=null; p = p.next){
            if(index >= i && index <= j){
                subList.insert(p.data);
            }
            ++index;
        }

        return subList;
    }

    // Append LinkedLists
    public void append(LinkedList linkedList){
        for(Node p=start; p !=null; p = p.next) {
            if (p.next == null) {
                p.next = linkedList.start;
                break;
            }
        }
    }

    // Merging of LinkedLists
    public LinkedList merge(LinkedList linkedList){
        LinkedList mergedList = new LinkedList();
        for(Node p=start; p != null; p = p.next){
            mergedList.insert(p.data);
        }
        for(Node p=linkedList.start; p != null; p = p.next){
            mergedList.insert(p.data);
        }

        return mergedList;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(33);
        list.insert(55);
        list.insert(23);
        list.insert(56);
        list.insert(99);
       // list.printList();
        LinkedList list1 = new LinkedList();
        list1.insert(44);
        list1.insert(22);
        list1.insert(41);
        list1.insert(67);
        list1.insert(88);
        list1.insert(34);
       // System.out.println(list.sum());
        list.printList();
        System.out.println("------------------------------------");
        list=list.merge(list1);
        list.printList();
        LinkedList list2 = list.copy();
      //  list2.printList();
       // list2.printList();
       // list.append(list1);
        //list.printList();



    }
}
