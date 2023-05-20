package hashset;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // search - contains
        if (set.contains(1)){
            System.out.println("set contains 1");
        }

        // Iterator
        Iterator it = set.iterator();
        // hasNext, next
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
