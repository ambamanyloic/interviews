package com.loic.projectfacebook.leetcode.Strings;

import java.util.Stack;

public class IsValidPalindrome {

    public boolean isPalindrome(String s) {

        for(int i = 0,j=s.length()-1 ; i<s.length() ; i++,j--) {
                if (s.charAt(i) != s.charAt(j)) {

                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {

        IsValidPalindrome valid = new IsValidPalindrome();
        System.out.println(valid.isPalindrome("tenet"));
    }
}
