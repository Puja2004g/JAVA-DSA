package DSA.linked_list;

class swap_pairs{
    node swapPairs(node head){
        if(head==null || head.next==null){
            return  head;
        }
        node prevNode = head;
        node currNode = head.next;
        while(currNode!=null){
            node nextNode = currNode.next;
            String temp = prevNode.data;
            prevNode.data = currNode.data;
            currNode.data = temp;

            if(nextNode==null || nextNode.next==null){
                return head;
            }
            prevNode=nextNode;
            currNode= nextNode.next;
        }
        return head;
    }
}
public class swap_in_pairs {
    public static void main(String[] args) {
        node list = new node();
        list.insertFirst("a");
        list.insertFirst("b");
        list.insertFirst("c");
        list.insertFirst("d");
        list.insertFirst("e");
        list.insertEnd("f");
        list.insertEnd("g");
        list.insertEnd("h");
        list.printList();

        swap_pairs newList = new swap_pairs();
        node newPair = newList.swapPairs(list.head);
        list.printList();

    }
}
