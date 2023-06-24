package com.vinay.queue;

public class CircularQueue {
    static int size = 5;
    static int arr[] = new int[size];
    static int rear = -1;
    static int front = -1;

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFull(){
        return (rear+1) % size == front;
    }

    public static void add(int data){
        if(isFull()){
            System.out.println("full com.vinay.queue");
            return;
        }
        if (front == -1){
            front = 0;
        }
        rear = (rear+1) % size;
        arr[rear] = data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty com.vinay.queue");
            return -1;
        }

        int result = arr[front];
        if (rear == front){
            rear = front = -1;
        }else {
            front = (front + 1) % size;
        }

        return result;
    }

    public static int peek(){
        return arr[front];
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        while (!isEmpty()){
            System.out.print(peek() + " ");
            remove();
        }

    }
}
