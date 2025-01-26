public class Exercise7 {

    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2); //true

//        During compilation, Java compiler translates the statement String s2 = "OCAJP" + "";
//        to String s2 = "OCAJP"; As "OCAJP" is a String literal, hence at runtime it will be referred by String Pool.
    }
}
