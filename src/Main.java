import static anagram.AnagramChecker.areAnagrams;

public class Main {
    public static void main(String[] args) {
        String text1 = "mary";
        String text2 = "army";

        System.out.printf("Is %s is an anagram of %s: %s",text1,text2,areAnagrams(text1, text2)); // true

        text1 = "hello";
        text2 = "world";

        System.out.printf("\nIs %s is an anagram of %s: %s",text1,text2,areAnagrams(text1, text2)); // false

    }
}