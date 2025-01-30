public class Exercise41 {

    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }

        //ANY FRUIT WILL DO
        //APPLE
        //MANGO
        //BANANA

        //"mango" is different from "Mango", so there is no matching case available. default block is executed, "ANY FRUIT WILL DO" is printed on to the screen.
        // no break statement inside default
        // so in this case, it prints APPLE, MANGO, BANANA one after another and break
    }
}
