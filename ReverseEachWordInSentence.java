package SDET_Strings;

public class ReverseEachWordInSentence {

     static void main() {
        String sentence = "Welcome to java";
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            StringBuilder reverse_word = new StringBuilder(word);
            res.append(reverse_word.reverse().append(" "));
        }
        System.out.println(res);
    }
}
