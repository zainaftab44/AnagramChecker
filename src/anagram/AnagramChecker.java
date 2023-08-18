package anagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static boolean areAnagrams(String anagram1, String anagram2) {
        if (anagram1.length() != anagram2.length()) {
            return false;
        }
        anagram1=anagram1.toLowerCase();
        anagram2=anagram2.toLowerCase();

        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : anagram1.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : anagram2.toCharArray()) {
            int count = charCounts.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            charCounts.put(c, count - 1);
        }

        return true;
    }

}
