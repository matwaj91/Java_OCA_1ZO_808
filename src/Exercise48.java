public class Exercise48 {

    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
//            //case 200:
//                System.out.println("var is 200");
//                break;
            default:
                System.out.println("In default");
        }
        // compilation error - byte range is from -128 to 127.
        // In case expression [case 200], 200 is outside byte range and hence compilation error.
    }
}

