package com.loic.projectfacebook.leetcode.easy;

public class IsPalindrome {

    public static boolean isPalindrome(String s,String s1) {

        char str[] = s.toCharArray();
        char str1[] = s1.toCharArray();

        int left = 0;
        int right = s1.length()-1;

        if(str[left] != str1[right]) {
            return false;
        }

            left++;
            right--;

        return true;


    }

    public static boolean isPalindrome(String s) {

        char str[] = s.toCharArray();


        int left = 0;
        int right = s.length()-1;

        if(str[left] != str[right]) {
            return false;
        }

        left++;
        right--;

        return true;

    }

    public static void main(String[] args) {


        IsPalindrome pal = new IsPalindrome();
        String str  = "MadaM";
        String str1 = "MadaM";
        System.out.println(pal.isPalindrome(str,str1));

    }
}
