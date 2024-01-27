package DSA.linked_list;

class checkPallindrome{
    reverse_node rev = new reverse_node();
    node findMiddle(node head){
        node hare = head;
        node turtle = head;

        while(hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    boolean isPallindrome(node head){
        if(head==null || head.next.next==null){
            return true;
        }
        node middle = findMiddle(head);
        node firstHalfStart = head;
        node secondHalfStart = rev.reverseListRecursive(middle.next);

        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart= secondHalfStart.next;
        }

        return true;
    }
}
public class pallindrome_linked_list {
    public static void main(String[] args) {
        node list = new node();
        list.insertFirst("a");
        list.insertFirst("b");
        list.insertFirst("c");
        list.insertFirst("b");
        list.insertFirst("e");
        list.printList();

        checkPallindrome check = new checkPallindrome();
        boolean bool = check.isPallindrome(list.head);
        System.out.println(bool);
    }
}
