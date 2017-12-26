package org.jplus.alg;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;
        char[] charArray = s.toCharArray();
        StringBuilder buffer = new StringBuilder(String.valueOf(charArray[0]));
        for (int i = 1; i < s.length(); i++) {
            int index = buffer.indexOf(String.valueOf(charArray[i]));
            if (index > -1) {
                if (result < buffer.length()) {
                    result = buffer.length();
                }
                buffer.delete(0, index + 1);
            }
            buffer.append(charArray[i]);
        }

        if (result < buffer.length()) {
            result = buffer.length();
        }
        return result;
    }
}
