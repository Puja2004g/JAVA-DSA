package DSA.stack_package;
import DSA.linked_list.node;
class stack{
    node head;
    boolean isEmpty(){
        return head==null;
    }

    void push(String data){
        node newNode = new node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    String pop(){
        if(isEmpty()){
            return "-1";
        }
        String top = head.data;
        head = head.next;
        return top;
    }

    String peek(){
        if(isEmpty()){
            return "-1";
        }

        return head.data;
    }
}
public class stack_using_linked_list {
    public static void main(String[] args) {
        stack st = new stack();
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
