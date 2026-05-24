package SDET_Strings;

public class compressString {
    static void main() {
        String str = "aaabbcc";
        String comp = "";
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                comp = comp + str.charAt(i)+count;
                count =1;
            }
        }
        System.out.println(comp);
    }


}
