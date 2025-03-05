package SDET_Strings;

public class Count_letter_of_String {
    public static void main(String[] args) {
        String str = "vikash";
        int count=0;
        for(int i =0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i)));
            count++;
        }

        System.out.println(count);
    }
}
