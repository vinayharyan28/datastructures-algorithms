package com.vinay.stack;

public class StackClass1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }


    public static Node head;
    public static boolean isEmpty(){
        return head == null;
    }
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        System.out.println(peek());
        System.out.println(pop());
        System.out.println(peek());
        System.out.println(isEmpty());
    }
}
