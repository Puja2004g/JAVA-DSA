import java.util.Stack;

public class infix_postfix {
    static int priority(char op) {
        if (op == '^') {
            return 3;
        }
        else if (op == '*' || op == '/') {
            return 2;
        }
        else if (op == '+' || op == '-') {
            return 1;
        }
        else {
            return -1;
        }
    }

    static String infixToPostfix(String infix) {
        String postfix = "";
        Stack<Character> st = new Stack<>();
        int i = 0;
        int n = infix.length();
        while (i < n) {
            if ((infix.charAt(i) >= 'A' && infix.charAt(i) <= 'Z') || (infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z')
                    || (infix.charAt(i) >= '0' && infix.charAt(i) <= '9')) {
                postfix += infix.charAt(i);
            }
            else if (infix.charAt(i) == '(') {
                st.push(infix.charAt(i));
            }
            else if (infix.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix += st.peek();
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }
            else {
                while (!st.isEmpty() && priority(infix.charAt(i)) <= priority((char) (st.peek()))) {
                    postfix += st.peek();
                    st.pop();
                }
                st.push(infix.charAt(i));
            }
            i++;
        }
        while (!st.isEmpty()) {
            postfix += st.peek();
            st.pop();
        }
        return postfix;

    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)";
        System.out.println(infixToPostfix(str));
    }
}