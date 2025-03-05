package SDET_Strings;

public class CountVowelAndConsonent {
    public static void main(String[] args) {
        String str = "Vikash";
        str.toLowerCase();
        int v=0, c=0;
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u'){
                v++;
            }else{
                c++;
            }
        }
        System.out.println("Count of vowel and Consonant is: "+v+","+c);
    }
}
