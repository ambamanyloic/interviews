package com.loic.projectfacebook.leetcode.Strings;

public class ReverseString {
    public void reverseString(char[] s) {

        for(int i =s.length-1;i>=0;i--) {

            System.out.println(s[i]);
        }

    }

    public static void main(String[] args) {

        ReverseString rstring = new ReverseString();
        char[] new_chars = {'t','e','n','e','t'};
        rstring.reverseString(new_chars);

    }


}
