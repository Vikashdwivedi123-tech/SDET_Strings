package SDET_Strings;

import java.util.Scanner;

public class CountWordinString {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1) != ' '){ // Dry run easy logic..
                count++;
            }
        }
        System.out.println("Total no of word in the string is: "+count);
    }
}
