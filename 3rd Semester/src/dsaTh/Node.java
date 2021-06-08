package dsaTh;

public class Node {
	
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
	

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public void show(Node start) {
		for(Node i=start; i!=null; i=i.next) {
			System.out.println(i.data);
		}
	}
	
	public int sum(Node start) {
		int sum=0;
		for(Node i=start; i!=null; i=i.next) {
			sum+=i.data;
		}
		return sum;
	}
	
	
	public Node swap(Node start, int j, int k) {
		Node temp = new Node(0);
		Node temp2 = new Node(0);
		for(Node i=start; i!=null; i=i.next) {
			if(j<k) {
			if(i.data==j) {
				temp = i;
			}
			if(i.data==k) {
				temp2 
			}
			}
		}
	}
	
	public Node conCat(Node list1, Node list2) {
		for(Node i=list1; i!=null; i=i.next) {
		}
	}


	public static void main(String[] args) {
		
		Node start = new Node(22);
		Node p=start.next= new Node(33);
		p=p.next=new Node(44);
		p=p.next=new Node(55);
		p=p.next=new Node(66);
		p=p.next=new Node(77);
		p=p.next=new Node(88);
		
		
	}

}
