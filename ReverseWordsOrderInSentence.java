package SDET_Strings;

public class ReverseWordsOrderInSentence {
    public static void main(String[] args) {
        System.out.println(revWords("Welcome to java")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }
    public static String revWords(String str) {
        String res = "";

        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");

        // loop over the array from back
        for(int i = words.length - 1; i >= 0; i--) {
            // add words to res with space
            res = res+words[i]+" ";// just reversing the word and adding space in the end!
        }

        // trim needed to remove last space in the end
        return res;
    }
}
