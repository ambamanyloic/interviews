package com.loic.projectfacebook.leetcode.medium;

public class ReverseWords {
   public String reverseWords(String s) {


       String words[] = s.split("\\s");
       StringBuilder reverse = new StringBuilder();

       for (int i = words.length-1;i>=0;i--) {

           reverse.append(words[i]);
           reverse.append(' ');
       }

       return reverse.toString();


    }

    public static void main(String[] args){

       ReverseWords reverse = new ReverseWords();
       String str1 = "the sky is blue";

       System.out.println(reverse.reverseWords(str1));

    }
}
