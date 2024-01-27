package DSA.linked_list;

class reverse_node{

    void reverseListIterative(node list){
        if(list.head == null || list.head.next == null){
            return;
        }
        node prevNode = new node();
        node currNode = new node();
        prevNode = list.head;
        currNode = list.head.next;
        while(currNode!=null){
            node nextNode = currNode.next;
            currNode.next=prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }
        list.head.next=null;
        list.head = prevNode;
    }

    node reverseListRecursive(node head) {
        if (head == null || head.next == null) {
            return head;
        }

        node restReversed = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return restReversed;
    }
}
public class reverse_linked_list {
    public static void main(String[] args) {
        node newList = new node();
        newList.insertFirst("hello");
        newList.insertEnd("this");
        newList.insertEnd("is");
        newList.insertEnd("reversing");
        newList.insertEnd("linked");
        newList.insertEnd("list");
        newList.printList();
        reverse_node rev = new reverse_node();
        rev.reverseListIterative(newList);
        newList.printList();

        newList.head = rev.reverseListRecursive(newList.head);
        newList.printList();
    }
}
