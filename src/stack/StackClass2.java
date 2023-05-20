package stack;

import java.util.ArrayList;

public class StackClass2 {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }

    //push
    public static void push(int data){
        list.add(data);
    }

    //pop
    public static int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    // peek
    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        pop();
        System.out.println(peek());
        System.out.println(list);
    }

}
