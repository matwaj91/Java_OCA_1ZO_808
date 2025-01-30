import java.util.ArrayList;
import java.util.List;

public class Exercise30 {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0,'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O'); // Runtime exception - IndexOutBoundsException
        }

        // Solution:

//        if(list.contains('O')) {
//            list.remove(Character.valueOf('O')); //Remove the first occurrence of 'O'
//        }

        for(char ch : list) {
            System.out.print(ch); //
        }
    }
}

