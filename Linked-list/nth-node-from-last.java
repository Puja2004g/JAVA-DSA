package DSA.linked_list;

class find_node{
    node removeNthFromEnd(node head, int n){
        if(head.next==null){
            return  null;
        }
        node curr = head;
        int size=0;
        while (curr != null){
            curr=curr.next;
            size++;
        }
        int indexToFind = size-n;

        if(indexToFind == 0){
            return head.next;
        }
        node prev = head;
        int i=1;
        while (i<indexToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}

public class find_nth_node_from_last {
    public static void main(String[] args) {
        node list = new node();
        list.insertFirst("a");
        list.insertFirst("b");
        list.insertFirst("c");
        list.insertFirst("d");
        list.insertFirst("e");
        list.printList();

        find_node new_node = new find_node();
        node find = new_node.removeNthFromEnd(list.head, 2);
        list.printList();
    }
}
