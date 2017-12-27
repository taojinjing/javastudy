package org.jplus.alg;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        int result = 0;
        char[] charArray = s.toCharArray();
        int startPoint = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = startPoint; j < i; j++) {
                if (charArray[j] == charArray[i]) {
                    startPoint = j + 1;
                }
            }
            if (result < i + 1 - startPoint) {
                result = i + 1 - startPoint;
            }
        }
        return result;
    }
}
