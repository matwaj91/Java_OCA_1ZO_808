import java.time.LocalDate;
import java.time.LocalTime;

public class Exercise44 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse(("1947-08-14"));
        LocalTime time = LocalTime.MAX; // LocalTime.MAX --> {23:59:59.999999999}
        System.out.println(date.atTime(time)); // 1947-08-14T23:59:59.999999999
    }
}
