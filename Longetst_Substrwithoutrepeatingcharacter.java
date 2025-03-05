package SDET_Strings;

import java.util.HashMap;
public class Longetst_Substrwithoutrepeatingcharacter {
    public static void main(String[] args) {
        String s1 =  "aaa";
        System.out.println(longestSubstr(s1));
        String s2 = "abcdefabcbb";
        System.out.println(longestSubstr(s2));
    }
    static int longestSubstr(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength =0;
        int left = 0;
        for(int r=0;r<s.length();r++){
            char currentchar = s.charAt(r);
            if(map.containsKey(currentchar)){
                left=Math.max(left,map.get(currentchar)+1);
            }
            map.put(currentchar,r);
            maxlength=Math.max(maxlength,r-left);
        }
        return maxlength+1;

    }

}
//Question:2-
//Given a string s having lowercase characters, find the length of the longest substring without repeating characters.
//Examples:
//
//Input: s = "aaa"
//Output: 1
//Explanation: The longest substring without repeating characters is "a"
//
//
//Input: s = "abcdefabcbb"
//Output: 6
//Explanation: The longest substring without repeating characters is "abcdef".
