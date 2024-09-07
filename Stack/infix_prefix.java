import java.util.Stack;

public class infix_prefix {
    static int priority(char op) {
        if (op == '^') {
            return 3;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '+' || op == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    static String reverse(String str, int n) {
        String rs = "";
        for (int j = n - 1; j >= 0; j--) {
            rs += str.charAt(j);
        }

        rs = rs.replace('(', '#');
        rs = rs.replace(')', '(');
        rs = rs.replace('#', ')');
        return rs;
    }

    static String infixToPrefix(String s) {
        String prefix = "";
        int i = 0;
        int n = s.length();
        Stack<Character> st = new Stack<>();

        s = reverse(s, n);
        System.out.println(s);

        while (i < n) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                prefix += s.charAt(i);
            }
            else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    prefix += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else {
                if (s.charAt(i) == '^') {
                    while (!st.isEmpty() && priority(s.charAt(i)) <= priority(st.peek())) {
                        prefix += st.peek();
                        st.pop();
                    }
                }
                else {
                    while (!st.isEmpty() && priority(s.charAt(i)) < priority(st.peek())) {
                        prefix += st.peek();
                        st.pop();
                    }
                }
                st.push(s.charAt(i));
            }
            i++;
        }

        while (!st.isEmpty()) {
            prefix += st.peek();
            st.pop();
        }

        prefix = reverse(prefix, prefix.length());

        return prefix;
    }

    public static void main(String[] args) {
        String str = "f+d-c*(b+a)";
        System.out.println(infixToPrefix(str));
    }
}
