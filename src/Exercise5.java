public class Exercise5 {

    public static void main(String[] args) {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2); //CoRe

        //System.out.println(str1 = str2) has assignment(=) operator and not equality(==) operator.
        //After the assignment, str1 refers to "CoRe" and System.out.println prints "CoRe" to the console.
    }
}
