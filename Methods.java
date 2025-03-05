package SDET_Strings;

public class Methods {
    public static void main(String[] args) {
        String name = "Vikash Dwivedi";
        System.out.println(name.toLowerCase()); // it will print lower case and create a new object.
        System.out.println(name);// it will still print the same value as we above declared it.

        System.out.println(name.compareTo("bdyvhedgu"));
        System.out.println(name.compareTo("Vikash Dwivedi"));// this method return 0 if the string is same.

        System.out.println(name.indexOf("s"));// it will find the index no of given character in the method.
        System.out.println(name.substring(1,4));
    }
}
