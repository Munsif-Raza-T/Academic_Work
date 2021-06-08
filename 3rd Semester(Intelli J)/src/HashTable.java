public class HashTable {
    private Entry[] entries;
    private Entry NIL = new Entry(null,null);
    private int size;
    private int used;
    private float loadFactor;

    public HashTable(int capacity, float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }

    public HashTable(int capacity){
        this(capacity,0.75f);
    }

    HashTable(){
        this(10);
    }

    private class Entry{
        Object key,value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(Object key){
        if(key == null) throw new IllegalArgumentException();
        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    public Object get(Object key){
        int h = hash(key);
        for (int i = 0; i<entries.length; i++){
            int j = probing(h,i);
            Entry entry = entries[j];
            if(entry == null) break;
            if(entry == NIL) continue;
            if (entry.key.equals(key)) return entry.value;
        }

        return null;
    }

    public void put(Object key, Object value){
        if(used > loadFactor*entries.length) rehash();
        int h = hash(key);
        for (int i = 0; i<entries.length; i++){
            int j = probing(h,i);
            Entry entry = entries[j];
            if(entry == null){
                entries[j] = new Entry(key,value);
                ++size;
                ++used;
            }
            if(entry == NIL) continue;
            if(entry.key.equals(key)){
                Object oldVal= entry.value;
                entries[j].value = value;
                return;
            }
        }
    }

    private void rehash(){
        Entry[] oldEntries = entries;
        entries = new Entry[2*oldEntries.length+1];
        for (int i = 0; i<oldEntries.length; i++){
            Entry entry = oldEntries[i];
            if(entry == null || entry == NIL) continue;
            int h = hash(entry.key);
            for (int j = 0; j<entries.length; j++){
                int k = probing(h,i);
                if(entries[k] == null){
                    entries[k] = entry;
                    break;
                }
            }
            used = size;
        }
    }

    public Object remove(Object key){
        if (size == 0) return null;
        int h = hash(key);
        for (int i = 0; i<entries.length; i++){
            int j = probing(h,i);
            Entry entry = entries[j];
            if(entry == null) break;
            if (entry.key.equals(key)){
                Object object = entries[j].value;
                entries[j] = NIL;
                --size;
                return object;
            }
        }

        return null;
    }

    public int size(){
        return size;
    }

    private int probing(int h, int i){
        return h+i%entries.length;
    }
}
