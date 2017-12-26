package org.jplus.alg;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {
    LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

    @Test
    public void lengthOfLongestSubstring_null() {
        assertEquals(0, solution.lengthOfLongestSubstring(null));
    }

    @Test
    public void lengthOfLongestSubstring_empty() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    public void lengthOfLongestSubstring_norepeate() {
        assertEquals(2, solution.lengthOfLongestSubstring("ab"));
    }

    @Test
    public void lengthOfLongestSubstring_allrepeating() {
        assertEquals(1, solution.lengthOfLongestSubstring("zz"));
    }

    @Test
    public void lengthOfLongestSubstring_pwwkew() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}