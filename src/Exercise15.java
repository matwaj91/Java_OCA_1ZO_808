import java.util.ArrayList;
import java.util.List;

public class Exercise15 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100);

        System.out.println(list);

        // remove(100) tries to remove the element at 100th index and this throws IndexOutOfBoundsException.
    }
}
