import java.util.Stack;

public class postfix_infix {
    static void postfixToInfix(String s){
        Stack<String> st = new Stack<>();
        int i=0, n=s.length();

        while(i<n){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i)<='z') || (s.charAt(i) >='0' && s.charAt(i)<='9')){
                st.push("" + s.charAt(i));
            }
            else{
                String t1 = st.peek();
                st.pop();
                String t2= st.peek();
                st.pop();

                String temp = '(' + t2 + s.charAt(i) + t1 +')';
                st.push(temp);
            }
            i++;
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        String str = "ab-de+f*/";
        postfixToInfix(str);
    }
}
