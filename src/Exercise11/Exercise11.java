package Exercise11;

public class Exercise11 {

    char var1;
    double var2;
    float var3;

    public static void main(String[] args) {
        Exercise11 obj = new Exercise11();
        System.out.println(">" + obj.var1);
        System.out.println(">" + obj.var2);
        System.out.println(">" + obj.var3);

//        >
//        >0.0
//        >0.0

//        char default value is \u0000 (null character), which often appears as an empty space when printed.
//        double default value is 0.0.
//        float default value is 0.0f.
    }
}
