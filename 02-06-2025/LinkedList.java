public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertBeg(40);
        list.insertBeg(30);
        list.insertBeg(20);
        list.insertBeg(10);  

        list.insertEnd(50);  
        list.insertpos(25, 2); 

        Node head = list.getHead();
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insertBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertpos(int data, int pos) {
        Node newNode = new Node(data);
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (pos >= 0 && pos <= length) {
            if (pos == 0)
                insertBeg(data);
            else if (pos == length)
                insertEnd(data);
            else {
                temp = head;
                for (int i = 1; i < pos; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        } else {
            System.out.println("The position is invalid.");
        }
    }

    Node getHead() {
        return head;
    }
}
