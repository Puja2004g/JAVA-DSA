package DSA.hashing;
// best case = O(1)
//worst case = O(n)
import java.util.ArrayList;
import java.util.LinkedList;

class HashmapCode{
       static class Hashmap<K,V>{ //generics/template code
           private class node{
               K key;
               V value;

               public node(K key, V value){
                   this.key = key;
                   this.value = value;
               }
           }

           private int n; //no. of nodes
           private int N; //no. of buckets

           private LinkedList<node> buckets[]; //buckets array
            @SuppressWarnings("unchecked")
           public Hashmap(){
               this.N = 4;
               this.buckets = new LinkedList[4];
               for(int i=0;i<4;i++){
                   this.buckets[i] = new LinkedList<>();
               }
           }

           private int hashFunction(K key){
                //hashcode is a function which provides any random no. which can be positive and negetive
                int bi = key.hashCode();
                //make index positive and between 0 to N-1
                return Math.abs(bi) % N;
           }

           private int searchInLinkedList(K key, int bi){
                LinkedList<node> ll = buckets[bi];
                for(int i=0;i<ll.size();i++){
                    if(ll.get(i).key == key){
                        return i;
                    }
                }
                return -1;
           }
           @SuppressWarnings("unchecked")
           private void rehash(){
                LinkedList<node> oldBucket[] = buckets;
                buckets = new LinkedList[N*2];

                for(int i=0;i<N*2;i++){
                    buckets[i] = new LinkedList<>();
                }

                for(int i=0;i<oldBucket.length;i++){
                    LinkedList<node> ll = oldBucket[i];
                    for(int j=0;j<ll.size();j++){
                        node nodeValue = ll.get(j);
                        put(nodeValue.key, nodeValue.value);
                    }
                }
           }

           public void put(K key, V value){
                int bi = hashFunction(key);
                int di = searchInLinkedList(key, bi);

                if(di == -1){ //key doesn't exist
                    buckets[bi].add(new node(key, value));
                    n++;
                }
                else{ //key exist
                    node data = buckets[bi].get(di);
                    data.value = value;
                }
                double lambda = (double) n/N;
                if(lambda > 2.0){
                    //rehashing
                    rehash();
                }
           }

           public boolean containsKey(K key){
               int bi = hashFunction(key);
               int di = searchInLinkedList(key, bi);

               if(di==-1){ //key doesn't exist
                   return false;
               }
               else{ //key exists
                  return true;
               }
           }

           public V removeKey(K key){
               int bi = hashFunction(key);
               int di = searchInLinkedList(key, bi);

               if(di==-1){ //key doesn't exist
                   return null;
               }
               else{ //key exists
                   node data = buckets[bi].remove(di);
                   n--;
                   return data.value;
               }
           }

           public V get(K key){
                int bi = hashFunction(key);
                int di = searchInLinkedList(key, bi);

                if(di==-1){ //key doesn't exist
                    return null;
                }
                else{ //key exists
                    node data = buckets[bi].get(di);
                    return data.value;
                }
           }

           public ArrayList<K> keySet(){
                ArrayList<K> keys = new ArrayList<>();
                for(int i=0;i<buckets.length;i++){
                    LinkedList<node> ll = buckets[i];
                    for (int j=0;j<ll.size();j++){
                        node val = ll.get(j);
                        keys.add(val.key);
                    }
                }
                return keys;
           }

           public boolean isEmpty(){
                return n==0;
           }


       }
}
public class hashmap_internal_implementation {
    public static void main(String[] args) {
        HashmapCode.Hashmap<String, Integer> map = new HashmapCode.Hashmap<>();
        map.put("India", 100);
        map.put("Korea", 50);
        map.put("China", 200);
//        map.put("Nepal", 70);

        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}
