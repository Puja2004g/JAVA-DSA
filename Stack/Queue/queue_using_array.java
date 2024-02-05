package DSA.queue_package;

class queue{
    int arr[];
    int size;
    int rear = -1;

    queue(int size){
        arr = new int[size];
        this.size = size;
    }

    boolean isEmpty(){
        return rear==-1;
    }
//  O(1)
    void add(int data){
        if(rear  == size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

//    O(n)
    int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }

//    O(n)
    int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return arr[0];
    }
}
public class queue_using_arrays {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
