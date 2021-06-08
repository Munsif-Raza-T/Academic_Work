import java.util.Arrays;

public class ArrayQueue {
    private Object[] queue;
    private int size;

    public ArrayQueue(int capacity){
        queue = new Object[capacity];
        size = 0;
    }

    public void add(Object obj){
        if(size == queue.length) resize();
        queue[size++] = obj;
    }

    public Object first(){
        if(size == 0) throw new IllegalStateException("Queue is empty!");
        return queue[0];
    }

    public Object remove(){
        if(size == 0) throw new IllegalStateException("Queue is empty!");
        --size;
        Object temp = queue[0];
        System.arraycopy(queue,1,queue,0,size);
        return temp;
    }

    public int size(){
        return size;
    }

    private void resize(){
        Object[] temp = queue;
        queue = new Object[2*temp.length];
        System.arraycopy(temp,0,queue,0,size);
    }

    public void reverse(){
        Object[] temp = new Object[size];
        int reverse = size-1;
        for(int i = 0; i < size; i++){
            temp[i] = queue[reverse];
            reverse--;
        }

        queue = temp;
    }

    public String toString(){
        String string = "[";
        for(int i = 0; i < queue.length; i++){
            string += queue[i]+",";
        }

        return string+"]";
    }

    public boolean equals(ArrayQueue arrayQueue){
        if(arrayQueue.size != size()) return false;
        for(int i = 0; i < queue.length; i++){
            if(!arrayQueue.queue[i].equals(queue[i])) return false;
        }

        return true;
    }

    public ArrayStack toStack(){
        ArrayStack arrayStack = new ArrayStack(size);
        arrayStack.setStack(queue);
        return arrayStack;
    }

    public LinkedQueue toLinkedQueue(){
        LinkedQueue linkedQueue = new LinkedQueue();
        for(int i = 0; i < queue.length; i++){
            linkedQueue.add(queue[i]);
        }
        return linkedQueue;
    }

    public Object removeBottomElement(){
        Object object = queue[size-1];
        queue[--size] = null;
        return object;
    }

    public ArrayQueue clone(){
        ArrayQueue arrayQueue = new ArrayQueue(size);
        arrayQueue.queue = this.queue;
        return arrayQueue;
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.add("Munsif");
        queue.add("Raza");
        queue.add("Thebo");

        queue.reverse();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
