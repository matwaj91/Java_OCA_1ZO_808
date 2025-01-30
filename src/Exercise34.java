public class Exercise34 {

    static {
        System.out.println(1/0); // Exception in thread "main" java.lang.ExceptionInInitializerError
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }

    // To invoke the special main method, JVM loads the class in the memory.
    // At that time, static initializer block is invoked.
    // 1/0 throws a RuntimeException and as a result static initializer block throws an instance of java.lang.ExceptionInInitializerError.
}
