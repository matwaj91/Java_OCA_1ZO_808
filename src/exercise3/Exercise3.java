package exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = (B)obj1;
        obj2.print(); //ClassCastException is thrown at runtime
    }
}
