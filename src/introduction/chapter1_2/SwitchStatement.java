package introduction.chapter1_2;

public class SwitchStatement {
    public static void main(String[] args){
        int number = 200;
        switch (number){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");

        }
    }
}
