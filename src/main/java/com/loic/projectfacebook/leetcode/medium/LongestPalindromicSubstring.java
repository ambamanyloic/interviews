package com.loic.projectfacebook.leetcode.medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        if(s.isEmpty()) {
            return "";
        }

        int left = 0;
        int right = s.length() - 1;
        int count = 0;
        int longestSoFar = 0, startIndex = 0, endIndex = 0;
        char[] s_char = s.toCharArray();
        int min = Integer.MAX_VALUE;

        while (left <= right) {


            if (s_char[left] == s_char[right]) {

                min = Math.min(min,left-right+1);

                if(min > longestSoFar) {

                    longestSoFar = min;
                    startIndex = left;
                    endIndex = right;
                }

               /* if (left - right + 1 > longestSoFar) {
                    longestSoFar = left - right + 1;
                    startIndex = left;
                    endIndex = right;

                }*/
            }

            left++;
            right--;


        }

        return s.substring(startIndex, endIndex + 1);
    }

    public static void main(String[]args){

        LongestPalindromicSubstring longest = new LongestPalindromicSubstring();
        System.out.println(longest.longestPalindrome("babad"));
    }
}
