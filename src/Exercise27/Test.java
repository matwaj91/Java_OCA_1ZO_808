package Exercise27;

public class Test {

    public static void main(String[] args) {
        Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks); // 25-60
    }

    private static void review(Student stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }

    // Changes done to reference variable are visible in main method
    // but changes done to primitive variable are not reflected in main method.
}
