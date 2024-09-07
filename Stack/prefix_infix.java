import java.util.Stack;

public class prefix_infix {
    static String prefixToInfix(String s){
        Stack<String> st = new Stack<>();
        int i=s.length()-1;

        while (i>=0) {
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i) <= '9')){
                st.push(""+s.charAt(i));
            }
            else{
                String t1 = st.peek();
                st.pop();

                String t2 = st.peek();
                st.pop();

                String temp = '(' + t1 +s.charAt(i) + t2 +')';
                st.push(temp);
            }
            i--;
        }


        return st.peek();
    }
    public static void main(String[] args) {
        String str = "*+pq-mn";
        System.out.println(prefixToInfix(str));
    }
}
