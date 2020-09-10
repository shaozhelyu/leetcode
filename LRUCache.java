import java.util.*;

public class LRUCache {
    public HashMap<Integer,Integer> cache;
    public int cap;
    public List<Integer> q;
    public LRUCache(int capacity) {
        cap = capacity;
        cache = new HashMap<>();
        q = new ArrayList<>();
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            q.remove(key);
            q.add(key);
            return cache.get(key);
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(cap<cache.size()){
            q.add(cap);
            cap = cap+1;
        }else{
            int k = q.get(0);
            q.remove(k);
            cache.remove(k);
        }
//        q.c
//        cache.replace(key,value);
        cache.put(key,value);
    }
}
