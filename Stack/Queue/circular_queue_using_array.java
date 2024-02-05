package DSA.queue_package;

class circular_queue{
    int arr[];
    int size;
    int rear = -1;
    int front =-1;

    circular_queue(int size){
        arr = new int[size];
        this.size = size;
    }

    boolean isEmpty(){
        return rear==-1 && front == -1;
    }

    boolean isFull(){
        return (rear+1)%size == front;
    }

//    O(1)
    void add(int data){
        if(isFull()){
            System.out.println("Queue id full");
            return;
        }

        if(front == -1){
            front=0;
        }

        rear = (rear+1) % size;
        arr[rear]=data;
    }

//    O(1)
    int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int result = arr[front];
//      for single element
        if(rear == front){
            rear = front = -1;
        }
        else {
            front = (front+1)%size;
        }
        return result;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }

        return arr[front];
    }
}
public class circular_queue_using_array {
    public static void main(String[] args) {
        circular_queue q = new circular_queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        q.add(6);
        q.remove();
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
