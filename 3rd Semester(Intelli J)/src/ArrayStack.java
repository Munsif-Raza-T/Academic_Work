import java.util.EmptyStackException;

public class ArrayStack {
    private Object[] stack;
    int size;

    public ArrayStack(int capacity){
        stack = new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int getSize(){
        return size;
    }

    public void push(Object obj){
        if(size == stack.length) resize();
        stack[size++] = obj;
    }

    public Object pop(){
        Object temp = stack[size-1];
        stack[size-1]=null;
        --size;
        return temp;

    }

    public Object peek(){
        return stack[size-1];
    }

    public String toString(){
        String temp="[";
        for(int i=size-1; i>=0; i--){
            temp =temp+" "+stack[i];
        }
        return temp+"]";
    }

    public boolean equals(ArrayStack stack1){
        if(stack1.size != this.size)
            return false;
        for(int i= stack1.size; i>0; i--){
            if(stack1.stack[i] != this.stack[i])
                return false;
        }
        return true;

    }

    public Object bottomElement() {
        if(isEmpty()) throw new EmptyStackException();
        return this.stack[0];
    }

    public Object removeBottomElement(){
        if(isEmpty()) throw new EmptyStackException();
        Object temp = stack[0];
        System.arraycopy(stack,1,stack,0,size);
        stack[size-1]=null;
        --size;
        return temp;
    }

    public Object secondElement(){
        return stack[size-2];
    }

    public Object removeSecondElement(){
        Object temp = stack[size-2];
        stack[size-2] = stack[size-1];
        stack[size-1] = null;
        --size;
        return temp;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getStack() {
        return stack;
    }

    public LinkedStack toLinkedStack(){
        LinkedStack linkedStack = new LinkedStack();
        for(int i=0; i<size; i++){
            linkedStack.push(stack[i]);
        }
        return linkedStack;
    }

    public void resize(){
        Object[] temp = stack;
        stack = new Object[2*temp.length];
        System.arraycopy(temp,0,stack,0,size);
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push("Munsif");
        stack.push("Raza");
        ArrayStack stack1 = new ArrayStack(9);
        stack1.push("Munsif");
        stack1.push("Raza");
        stack1.push("Thebo");
        System.out.println(stack);
        System.out.println(stack.removeBottomElement());
        System.out.println(stack);

    }


}
