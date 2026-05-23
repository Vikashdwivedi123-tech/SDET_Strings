package SDET_Strings;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Vikash";
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println("revers string is: "+rev);
    }
}
