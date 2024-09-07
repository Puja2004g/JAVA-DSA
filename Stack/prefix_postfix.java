import java.util.Stack;

public class prefix_postfix {
    static String prefixToPostfix(String s){
        Stack<String> st = new Stack<>();
        int i=s.length()-1;

        while(i>=0){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i)<='z') || (s.charAt(i) >='0' && s.charAt(i)<='9')){
                st.push("" + s.charAt(i));
            }
            else{
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();

                String temp = t1 + t2 + s.charAt(i);
                st.push(temp);
            }
            i--;
        }

        return st.peek();
    }
    public static void main(String[] args) {
        String str = "/-ab*+def";
        System.out.println(prefixToPostfix(str));
    }
}
