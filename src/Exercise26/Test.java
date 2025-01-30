package Exercise26;

public class Test {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age); // null:0

//        Default values are assigned to instance variables, hence null is assigned to name and 0 is assigned to age.
//        As no constructors are provided in the Student class, java compiler adds default no-arg constructor.
//        That is why the statement Student s = new Student(); doesn't give any compilation error.
    }
}
