package DSA.queue_package;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue_using_collection_framework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> que = new ArrayDeque<>();

//        for linked list queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

//      for array deque
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);


        while(!que.isEmpty()){
            System.out.println(que.peek());
            que.remove();
        }
    }
}
