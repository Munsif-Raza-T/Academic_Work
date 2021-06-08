public class ArrayCollection extends AbstractCollection {
    private final int INITAL_LENGTH = 15;
    private Object[] collection = new Object[INITAL_LENGTH];
    private int size;

    public boolean add(Object object){
        if(size == collection.length) resize();
        collection[size++] = object;
        return true;
    }


    public Iterator iterator(){
        return new Iterator() {
            private int i = 0;
            private boolean okToRemove = false;
            @Override
            public boolean hasNext() {
                return (i<size);
            }

            @Override
            public Object next() {
                if(i==size) throw new RuntimeException();
                okToRemove = true;
                return collection[i++];
            }

            @Override
            public void remove() {
                if (!okToRemove) throw new IllegalStateException();
                collection[--i] = collection[--size];
                collection[size] = null;
                okToRemove = false;
            }
        };


    }

    private void resize(){
        Object[] temp = collection;
        collection = new Object[2*temp.length];
        System.arraycopy(temp,0,collection,0,size);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        ArrayCollection collection = new ArrayCollection();
        collection.add("Munsif");
        collection.add("Raza");
        System.out.println(collection);
        collection.remove("Raza");
        System.out.println(collection);
        System.out.println(collection.contains("Munsif"));
    }
}
