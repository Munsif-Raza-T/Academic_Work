public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public static void showLinkedList(Node head){
        System.out.print("[");
        while (head != null){
            System.out.print(head.data+",");
            head = head.next;
        }
        System.out.println("]");
    }

    public static int countItems(Node head){
        int count = 0;
        for (Node i = head; i != null; i=i.next){
            count++;
        }
        return count;
    }

    public static int sumOfItems(Node head){
        int sum = 0;
        for (Node i = head; i != null; i=i.next){
            sum+=(int)i.data;
        }
        return sum;
    }

    public static Node insertInBeginning(Node head, Object data){
        Node newElement = new Node(data);
        newElement.next = head;
        head = newElement;
        return head;
    }

    public static Node insertInLast(Node head, Object data){
        Node newElement = new Node(data);
        for (Node i = head; i != null; i=i.next){
            if(i.next==null){
                i.next=newElement;
                break;
            }
        }
        return head;
    }

    public static Node insertAtPosition(Node head, Object atPlace, Object newData){
        Node newElement = new Node(newData);
        for (Node i = head; i != null; i=i.next){
            if(i.next.data == atPlace){
                newElement.next = i.next;
                i.next = newElement;
                break;
            }
        }

        return head;
    }

    public static Node remove(Node head, Object dataToRemove){
        for (Node i = head; i != null; i=i.next){
            if(i.next.data == dataToRemove){
                i.next = i.next.next;
                break;
            }
        }

        return head;
    }

    public static Node removeFirst(Node head){
        head = head.next;
        return head;
    }

    public static Node removeLast(Node head){
        for (Node i = head; i != null; i=i.next){
            if(i.next.next==null){
                i.next = null;
                break;
            }
        }
        return head;
    }





    public static void main(String[] args) {
        Node head = new Node(56);
        head.next= new Node(55);
        head.next.next = new Node(53);
        head.next.next.next = new Node(110);
        showLinkedList(head);
        head=insertInBeginning(head, 59);
        showLinkedList(head);
        head = insertInLast(head, 99);
        showLinkedList(head);
        head = insertAtPosition(head, 110, 100);
        showLinkedList(head);
        head = remove(head, 110);
        head = remove(head, 100);
        showLinkedList(head);
        head = removeFirst(head);
        showLinkedList(head);
        head = removeLast(head);
        showLinkedList(head);

    }
}
