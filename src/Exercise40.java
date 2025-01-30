import java.util.function.Predicate;

public class Exercise40 {

    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        Predicate <String> p = s -> s.toUpperCase().substring(0,1).equals("A");

        processStringArray(arr, p);

//        A
//        ab
//        Aa
//        aba
//        Abab
    }

    private static void processStringArray(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
