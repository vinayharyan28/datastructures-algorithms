package queue;

import java.nio.file.attribute.UserPrincipalLookupService;

public class LikedQueue {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty(){
        return head == null & tail == null;
    }

    public static void add(int data){
        Node newNode = new Node(data);
        if (tail == null){
            tail = head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front = head.data;
        if (head == tail){
            tail = null;
        }
        head = head.next;
        return front;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
    }

    public static void printQueue(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        printQueue();
    }
}
