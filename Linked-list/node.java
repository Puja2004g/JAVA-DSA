package DSA.linked_list;

public class node {
    public String data;
    public node next;
    node head;
    private int size = 0;

    node() {};

    public node(String data) {
        this.data = data;
        this.next = null;
    }

    void insertFirst(String data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void insertEnd(String data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        node secondLast = head;
        node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    int getSize() {
        return size;
    }
}
