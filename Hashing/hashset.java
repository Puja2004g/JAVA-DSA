package DSA.hashing;
import java.util.HashSet;
import java.util.Iterator;

//insertion, deletion, searching - O(1)
public class hashset {
//    unordered set
    public static void main(String[] args) {
//      create
        HashSet<Integer> set = new HashSet<>();

//        insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1); //will not add into set as 1 already exists

        System.out.println(set);

//        search
        if(set.contains(7)){
            System.out.println("Set contains");
        }
        if(!set.contains(7)){
            System.out.println("Set doesn't contains");
        }

//        remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set doesn't contains");
        }

//        size
        int size = set.size();
        System.out.println(size);

//        iterator
        Iterator it = set.iterator();
//        hasnext, next
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
