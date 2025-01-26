public class Exercise13 {

/*
    A bank's swift code is generally of 11 characters and used in international money transfers.
    An example of swift code: ICICINBBRT4
    ICIC: First 4 letters for bank code
    IN: Next 2 letters for Country code
    BB: Next 2 letters for Location code
    RT4: Next 3 letters for Branch code

    Which of the following code correctly extracts country code from the swift code referred by String reference variable swiftCode?
*/

    public static void main(String[] args) {

        String swiftCode = "ICICINBBRT4";
        String countryCode = swiftCode.substring(4, 6);
        System.out.println(countryCode);
    }

}
