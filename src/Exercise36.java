public class Exercise36 {

    public static void main(String[] args) {
        // m1(); Compilation error - must be caught or declared to be thrown
    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}
