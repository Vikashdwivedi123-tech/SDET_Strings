package SDET_Strings;

import java.util.HashMap;
import java.util.Map;

public class characterFrequency {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
