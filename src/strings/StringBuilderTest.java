package strings;

public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert 0
        sb.insert(0, 'S');
        System.out.println(sb);

        // delete the extra p
        sb.delete(1, 2);
        System.out.println(sb);

        sb.append("y");
        System.out.println(sb);

//        System.out.println(sb.reverse());

        for (int i=sb.length()-1; i>=0; i--){
            System.out.print(sb.charAt(i));
        }

        StringBuilder sb1 = new StringBuilder("hello");
        for (int i=0; i<sb1.length()/2; i++){
            int front = i;
            int back = sb1.length() - 1 - i; // 5 - 1 - 0
            char frontChar = sb1.charAt(i);
            char backChar = sb1.charAt(back);
            sb1.setCharAt(front, backChar);
            sb1.setCharAt(back, frontChar);
        }
        System.out.println();
        System.out.println(sb1);
    }
}
