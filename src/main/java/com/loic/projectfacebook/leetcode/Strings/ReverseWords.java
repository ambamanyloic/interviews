package com.loic.projectfacebook.leetcode.Strings;

import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String s) {

        StringBuffer buffer = new StringBuffer();

        String[] words = s.split(" ");

        for(String word: words) {


            buffer.append(reverseWord(word));

        }

        return buffer.toString();

        }



    public String reverseWord(String word) {

        char[] new_chars = word.toCharArray();
        String ss = " ";

    for(int i = new_chars.length-1;i>=0;i--) {

        ss = ss + new_chars[i];

    }

     return ss;


    }

    public static void main(String [] args){

        ReverseWords rwords = new ReverseWords();
        System.out.println(rwords.reverseWords("Let's take LeetCode contest"));

    }
}
