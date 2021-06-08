public class HashTableChaining {
    private Entry[] entries;
    private int size;
    private float loadFactor;

    public HashTableChaining(int capacity, float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }

    private class Entry{
       private Object key, value;
       private Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int hash(Object key){
        if(key == null) throw new IllegalArgumentException();
        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    public Object put(Object key, Object value){
        int h = hash(key);
        for (Entry entry = entries[h]; entry != null; entry= entry.next){
            if(entry.key.equals(key)){
                Object temp = entry.value;
                entry.value = value;
                return temp;
            }
        }
        entries[h] = new Entry(key,value,entries[h]);
        ++size;
        return null;
    }

    public Object get(Object key){
        int h = hash(key);
        for(Entry entry = entries[h]; entry != null; entry = entry.next){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

    public Object remove(Object key){
        int h = hash(key);
        for (Entry entry = entries[h]; entry != null; entry=entry.next){
            if(entries[h].key.equals(key)){
                Object temp = entries[h].value;
                entries[h] = entries[h].next;
                return temp;
            }
            if(entry.next.key.equals(key)){
                Object temp = entry.next.value;

            }
        }
        return null;
    }
}
