package DSA.stack_package;

import java.util.ArrayList;

class stack_arraylist{
    ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty(){
        return list.size() == 0;
    }

    void push(int data){
        list.add(data);
    }

    int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    int peek(){
        if (isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
}
public class stack_using_arraylist {
    public static void main(String[] args) {
            stack_arraylist st = new stack_arraylist();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);

            while(!st.isEmpty()){
                System.out.println(st.peek());
                st.pop();
            }
    }
}
