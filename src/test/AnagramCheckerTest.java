package test;

import org.junit.Test;

import static anagram.AnagramChecker.areAnagrams;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams_True() {
        assertTrue(areAnagrams("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_False() {
        assertFalse(areAnagrams("hello", "world"));
    }

    @Test
    public void testAreAnagrams_CaseInsensitive() {
        assertTrue(areAnagrams("TeSt", "tseT"));
    }

    @Test
    public void testAreAnagrams_SameText() {
        assertTrue(areAnagrams("hello", "hello"));
    }
}