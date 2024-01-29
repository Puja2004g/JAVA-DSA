package DSA.stack_package;

import java.util.Stack;
public class stack_reverse {
    public static void reverse(Stack<Integer> st ){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);
        stack_push_at_bottom.pushAtBottom(top, st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverse(st);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
