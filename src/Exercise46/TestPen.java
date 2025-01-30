package Exercise46;

public class TestPen {
    /**
     * How many objects of Pen class are eligible for Garbage Collection at Line 4?
     */

    public static void main(String[] args) {
        new Pen(); //Line 1
        Pen p = new Pen(); // Line 2
        change(p); //Line 3
        System.out.println("About to end."); //Line 4
    }

    public static void change(Pen pen) { //Line 5
        pen = new Pen(); //Line 6
    }

    // At Line 4, we have two Pen objects eligible for Garbage collection: Created at Line 1 and Created at Line 6.
}
