package com.loic.projectfacebook.crackingcode.arrays;

import java.util.Arrays;

public class IsValidPalindrome {

    public boolean isValidP(String str){

        int right = 0;
        int  left = str.length()-1;
        char[] char_str = str.toCharArray();


        for(int i = right;i< str.length();i++){

            if(char_str[right] != char_str[left]) {

                return false;
            }

            right++;
            left--;

        }

        return true;
    }

    public static void main(String[] args) {

        IsValidPalindrome valid = new IsValidPalindrome();
        String str = "taco cat";
        System.out.println(valid.isValidP(str));
    }

}

