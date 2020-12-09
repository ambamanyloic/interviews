package com.loic.projectfacebook.leetcode.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        char[] str_chars = s.toCharArray();
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();

        for(int i=0;i<s.length();i++) {

            if (set.contains((Character) str_chars[i])) {

                return count;

            } else {

                set.add(str_chars[i]);
                count++;
            }
        }


        return count;


    }

    public static void main(String [] args) {

        LongestSubstringWithoutRepeatingCharacters str = new LongestSubstringWithoutRepeatingCharacters();
        String s = "pwwkew";
        System.out.println(str.lengthOfLongestSubstring(s));

    }


}
