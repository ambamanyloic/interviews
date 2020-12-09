package com.loic.projectfacebook.leetcode.easy;

import java.util.Arrays;

public class IsValidAnagram {

    public boolean isAnagram(String s, String t) {

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        Arrays.sort(s_char);
        Arrays.sort(t_char);

        String str = new String(s_char);
        String ttr = new String(t_char);

        if(str.equals(ttr)) {

            return true;
        } else {

            return false;
        }

    }

    public static void main(String[] args) {

        IsValidAnagram anagram = new IsValidAnagram();
        String str = "anagram";
        String ftr = "nagaram";
        System.out.println(anagram.isAnagram(str,ftr));
    }
}
