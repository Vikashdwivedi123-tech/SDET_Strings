package SDET_Strings;

public class RemovewhitespaceString {
    public static void main(String[] args) {
        String str = "w e l c o m e";

        // Using replaceAll() to remove spaces
        String noSpaceStr = str.replaceAll("\\s", "");

        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + noSpaceStr);
    }
}

/* \\s → Matches all whitespace characters (spaces, tabs, newlines).
replaceAll("\\s", "") → Removes all spaces from the string.*/

