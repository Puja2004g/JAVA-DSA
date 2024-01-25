package DSA.linked_list;

public class single_linked_list {
    public static void main(String[] args) {
        node list = new node();
        list.insertFirst("a");
        list.insertFirst("is");
        list.printList();
        System.out.println(list.getSize());

        list.insertEnd("Linked List");
        list.printList();
        System.out.println(list.getSize());

        list.insertFirst("This");
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }

}
