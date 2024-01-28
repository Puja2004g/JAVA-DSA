package DSA.stack_package;

import java.util.Stack;

public class stack_using_collection_framework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
