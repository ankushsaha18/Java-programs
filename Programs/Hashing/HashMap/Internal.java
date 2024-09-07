package Hashing.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Internal<K,V> {
    private class Node{
        K key;
        V value;
        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    private int n; // n nodes
    private int N; // size of array
    private LinkedList<Node>[] arr;

    @SuppressWarnings("unchecked")
    public Internal(){
        this.N = 4;
        this.arr = new LinkedList[N];
        for (int i = 0 ; i < 4 ; i++){
            arr[i] = new LinkedList<>();
        }
    }

    // to know array index
    private int hash(K key){
        int bi = key.hashCode();
        bi = Math.abs(bi);
        return bi%N;
    }

    // To check if already present
    private int searchInLL(K key,int bi){
        LinkedList<Node> ll = arr[bi];
        for(int i = 0 ; i < ll.size() ; i++){
            if(ll.get(i).key == key){
                return i;
            }
        }
        return -1;
    }

    // rehash
    private void rehash(){
        LinkedList<Node>[] old = arr;
        arr = new LinkedList[N*2];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = new LinkedList<>();
        }
        for(int i = 0 ; i < old.length ; i++){
            arr[i] = old[i];
        }
    }

    // put function
    public void put(K key,V value){
        int bi = hash(key);
        int di = searchInLL(key,bi);
        if(di == -1){
            arr[bi].add(new Node(key,value));
            n++;
        }else{
            arr[bi].get(di).value = value;
        }
        double lambda = n/N;
        if(lambda > 2.0){
            rehash();
        }
    }

    // get function
    public V get(K key){
        int bi = hash(key);
        int di = searchInLL(key,bi);
        if(di == -1){
            return null;
        }
        return arr[bi].get(di).value;
    }

    // contains function
    public boolean contains(K key){
        int bi = hash(key);
        int di = searchInLL(key,bi);
        if(di == -1){
            return false;
        }
        return true;
    }

    // remove function
    public V remove(K key){
        int bi = hash(key);
        int di = searchInLL(key,bi);
        if(di != -1){
            V ans = arr[bi].get(di).value;
            arr[bi].remove(di);
            n--;
            return ans;
        }
        return null;
    }

    // check Empty
    public boolean isEmpty(){
        return n == 0;
    }

    // key set
    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            LinkedList<Node> ll = arr[i];
            for(int j = 0 ; j < ll.size() ; j++){
                keys.add(ll.get(j).key);
            }
        }
        return keys;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i = 0 ; i < arr.length ; i++){
            LinkedList<Node> ll = arr[i];
            for(int j = 0 ; j < ll.size() ; j++){
                sb.append(ll.get(j).key + "=" + ll.get(j).value + " ,");
            }
        }
        return sb.subSequence(0,sb.length()-2).toString() + "}";
    }
}
