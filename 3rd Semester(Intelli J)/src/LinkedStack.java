import java.util.EmptyStackException;

public class LinkedStack {
    private int size;
    private Node1 top;

static class Node1{
    Object data;
    Node1 next;

    public Node1(Object data) {
        this.data = data;
    }
}
    public LinkedStack(){

    }

    public void setTop(Node1 top){
    this.top=top;
    }

    public Node1 getTop() {
        return top;
    }

    public void push(Object data){
        Node1 head = new Node1(data);
        head.next = top;
        top = head;
        size++;
    }

    public Object pop(){
        if(isEmpty()){
        throw new EmptyStackException();
        }
        Object temp = top.data;
        top = top.next;
        --size;
        return temp;
    }

    public Object peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean equals(LinkedStack linkedStack){
    if(this.size != linkedStack.size){
        return false;
    }
    for(Node1 i = top; i!=null; i=i.next){
        if(i.data != linkedStack.top.data)
            return false;
        linkedStack.top=linkedStack.top.next;
        }

    return true;
    }

    public String toString(){
    String temp= "";
    for (Node1 i = this.top; i != null; i =i.next){
        temp = temp+" "+i.data;
    }
    return temp;
    }

    public Object bottomElement(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
    Object temp = "";
        for (Node1 i = top; i!=null; i=i.next){
            if(i.next==null)
                temp=i.data;
        }
        return temp;
    }

    public Object removeBottomElement(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object temp = "";
        for (Node1 i = top; i!=null; i=i.next){
            if(i.next.next==null) {
                temp = i.next.data;
                i.next = null;
                --size;
                break;
            }
        }
        return temp;
    }

    public Object secondElement(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        if (size == 1 ){
            throw new IllegalStateException("Stack has only one element");
        }
    return top.next.data;
    }

    public Object removeSecondElement(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        if (size == 1 ){
            throw new IllegalStateException("Stack has only one element");
        }
    Object temp = top.next.data;
    top.next = top.next.next;
    --size;
    return temp;
    }

    public ArrayStack toArrayStack(){
    ArrayStack arrayStack = new ArrayStack(size);
    arrayStack.setSize(size);
    Object[] temp = new Object[size];
    int counter=size-1;

        for (Node1 i = top; i!=null; i=i.next){
            temp[counter--]=i.data;
        }
        arrayStack.setStack(temp);
        return arrayStack;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int getSize(){
        return size;
    }

    public void incSize(){
    ++size;
    }


    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push("Munsif");
        stack.push("Raza");
        stack.push("Thebo");
        LinkedStack stack1 = new LinkedStack();
        stack1.push("Munsif");
        stack1.push("Raza");
        ArrayStack arrayStack = stack.toArrayStack();
        System.out.println(arrayStack.toString());
    }

}
