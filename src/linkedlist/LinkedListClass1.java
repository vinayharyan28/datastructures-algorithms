package linkedlist;

public class LinkedListClass1 {
    private int size;
    LinkedListClass1(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;

    // add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst(){
        if (head == null){
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if (head == null){
            return;
        }

        size--;
        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void printList(){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursion(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListClass1 linkedListClass1 = new LinkedListClass1();
        linkedListClass1.addFirst("v");
        linkedListClass1.addFirst("i");
        linkedListClass1.addFirst("n");
        linkedListClass1.printList();
        linkedListClass1.addLast("i");
//        linkedListClass1.deleteFirst();
//        linkedListClass1.deleteLast();
        linkedListClass1.printList();
//        linkedListClass1.reverseIterate();
        linkedListClass1.head = linkedListClass1.reverseRecursion(linkedListClass1.head);
        linkedListClass1.printList();
        System.out.println(linkedListClass1.getSize());
    }
}
