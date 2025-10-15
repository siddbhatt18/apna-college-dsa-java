import java.util.*;
public class ImplementHashMap {
    public static class HashMap<K, V> {
        private class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[]; // N
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }
        private int searchInLinkedList(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i < ll.size(); i++) {
                Node curr = ll.get(i);
                if(curr.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> old[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for(int i = 0; i< buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            n = 0;
            for(int i = 0; i < old.length; i++) {
                LinkedList<Node> ll = old[i];
                for(Node curr : ll) {
                    put(curr.key, curr.value);
                }
            }
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1) {
                Node curr = buckets[bi].get(di);
                curr.value = value;
            }
            else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if(lambda > 2.0) {
                rehash();
            }
        }
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1) {
                return true;
            }
            else {
                return false;
            }
        }
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1) {
                Node curr = buckets[bi].get(di);
                return curr.value;
            }
            else {
                return null;
            }
        }
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1) {
                Node curr = buckets[bi].remove(di);
                n--;
                return curr.value;
            }
            else {
                return null;
            }
        }
        public boolean isEmpty() {
            if(n == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node curr : ll) {
                    keys.add(curr.key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Russia", 50);
        hm.put("Nepal", 25);
        ArrayList<String> keys = hm.keySet();
        for(String k : keys) {
            System.out.println(k + "=" + hm.get(k));
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("China"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.isEmpty());
    }
}