package DSA.linked_list;

class double_node{
    int data;
    double_node next;
    double_node prev;
    double_node head;
    private int size=0;

    double_node(){}
    double_node(int data){
        this.data = data;
        this.next = null;
        this.prev=null;
    }

    void insertFirst(int data){
        double_node list = new double_node(data);
        if(head==null){
            head=list;
            return;
        }

        list.next=head;
        head.prev=list;
        head = list;
    }

    void insertEnd(int data){
        double_node list = new double_node(data);
        if(head==null){
            head=list;
            return;
        }

    }

    void printList(){
        double_node temp = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    void  printPrevList(){
        double_node temp = head;
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

}
public class double_linked_list {
    public static void main(String[] args) {
        double_node newList = new double_node();
        newList.insertFirst(2);
        newList.insertFirst(5);
        newList.printList();
        newList.printPrevList();
    }
}
