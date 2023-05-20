package arrays;
import java.util.Scanner;


public class Arrays {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        for (int mark: marks){
            System.out.println(mark);
        }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrayTest = new int[size];

        for (int i=0; i<size; i++){
            arrayTest[i] = sc.nextInt();
        }

        System.out.println("--------------------------");

        for (int arr: arrayTest){
            System.out.println(arr);
        }
    }
}
