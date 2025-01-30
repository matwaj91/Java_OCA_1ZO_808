public class Exercise32 {

    public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)) {
            System.out.println(x);  // Infinite loop
        }
    }

    // Every time checkAndIncrement method is invoked with argument value 1,
    // so true is returned always and hence while loop executes indefinitely.

    private static boolean checkAndIncrement(int x) {
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}
