package SDET_Strings;

public class RemoveSpecialcharacterString {
    public static void main(String[] args) {
        String str = "Vi@#ka%$sh";
        String op = str.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(op);
    }
}
// [^a-zA-Z0-9 ] → This regex removes everything except letters (a-z, A-Z), digits (0-9), and spaces.
