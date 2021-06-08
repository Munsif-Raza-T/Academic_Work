public abstract class AbstractCollection {

    protected AbstractCollection(){}

    public abstract boolean add(Object object);

    public abstract Iterator iterator();

    public boolean contains(Object data){
        Iterator iterator = iterator();
        if(data == null)
            while (iterator.hasNext()){
                if(iterator.next() == null )
                    return true;
            }
        else
            while (iterator.hasNext()){
                if(iterator.next().equals(data))
                    return true;
            }
        return false;
    }

    public boolean remove(Object data){
        Iterator iterator = iterator();
        if(data == null)
            while (iterator.hasNext()){
                if(iterator.next() == null ){
                    iterator.remove();
                    return true;
                }
            }
        else
            while (iterator.hasNext()){
                if(iterator.next().equals(data)){
                    iterator.remove();
                    return true;
                }
            }
        return false;
    }

    public void clear(){
        for(Iterator iterator = iterator(); iterator.hasNext();){
            iterator.next();
            iterator.remove();
        }
    }

    public int size(){
        return size();
    }

    public boolean isEmpty(){
        return (size()==0);
    }

    public String toString(){
        if(isEmpty()) return "[]";
        Iterator iterator = iterator();
        StringBuffer buffer = new StringBuffer("["+ iterator.next());
        while (iterator.hasNext()){
            buffer.append(","+iterator.next());
        }
        return buffer+"]";
    }


}
