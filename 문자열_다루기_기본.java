import java.util.*;

public class 문자열_다루기_기본 {
    static class Solution {
        public boolean solution(String s) {
            if (s.length() != 4 && s.length() != 6) {
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] testCases = {"1234", "a234", "123456", "abcdef", "123", "12 34"};

        for (String testCase : testCases) {
            boolean result = sol.solution(testCase);
            System.out.println(result);
        }
    }
}