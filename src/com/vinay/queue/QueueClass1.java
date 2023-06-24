package com.vinay.queue;

public class QueueClass1 {
    static int[] arr;
    static int size;
    static int rear = -1;

    QueueClass1(int n){
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    // add
    public static void enqueue(int data){
        if (rear == size-1){
            System.out.println("full com.vinay.queue");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // dequeue
    public static int remove(){
        if (isEmpty()){
            return -1;
        }

        int front = arr[0];
        for (int i=0; i<=rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    //peek
    public static int peek(){
        return arr[0];
    }


    public static void main(String[] args) {
        new QueueClass1(5);
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);


        while (!isEmpty()){
            System.out.print(peek() + " ");
            remove();
        }
    }
}
