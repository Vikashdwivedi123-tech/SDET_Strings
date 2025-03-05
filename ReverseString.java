package SDET_Strings;

public class ReverseString {
    public static void main(String[] args) {
//        String str = "Vikash";
        System.out.println(reversse("Vikash"));
    }
    static String reversse(String str){
        StringBuilder res = new StringBuilder();
        for(int i= str.length()-1;i>=0;i--){
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
