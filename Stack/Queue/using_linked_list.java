package DSA.queue_package;
import DSA.linked_list.node;

class queue_list{
    node head = null;
    node tail =null;

    boolean isEmpty(){
        return head==null && tail==null;
    }

    void add(String data){
        node newNode = new node(data);
        if(tail == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    String remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return "-1";
        }
        String front = head.data;
        if(head == tail){
            tail = null;
        }
        head = head.next;

        return front;
    }

    String peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return "-1";
        }

        return head.data;
    }
}

public class queue_using_linked_list {
    public static void main(String[] args) {
        queue_list q = new queue_list();
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("d");
        q.add("e");

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
