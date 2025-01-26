import java.time.LocalDateTime;

public class Exercise10 {

    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());

//        LocalDateTime stores both date and time parts.
//        LocalDateTime.now();
//        retrieves the current date and time from the system clock. obj.getSecond() can return any value between 0 and 59.
    }
}
