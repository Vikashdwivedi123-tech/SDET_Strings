package SDET_Strings;
import java.util.Arrays;
public class StringAnagram {

    public static void main(String[] args) {
        System.out.println(check("Race","care"));
        System.out.println(check("vikash","sachin"));
    }

    public static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;

    }
}
