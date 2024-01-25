package DSA.linked_list;
import java.util.*;
public class single_linked_list_using_linkedListclass {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.add(0,"The");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println(list);
    }
}
