package com.loic.projectfacebook.leetcode.Strings;

public class MultiplyStrings {

    public int multiply(String num1, String num2) {

        int num3 = 0;

            int num_one = Integer.parseInt(num1);
            int num_two = Integer.parseInt(num2);

            num3 = num_one + num_two;

        return num3;

    }

    public static void main(String[] args){

        MultiplyStrings mstring = new MultiplyStrings();
        System.out.println(mstring.multiply("two","three"));

    }
}
