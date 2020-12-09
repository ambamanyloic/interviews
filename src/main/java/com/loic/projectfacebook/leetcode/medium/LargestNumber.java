package com.loic.projectfacebook.leetcode.medium;

import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {

        StringBuffer bf = new StringBuffer();

        for(int i=0;i<nums.length;i++){

            bf.append(nums[i]);

        }

        char[] char_str = bf.toString().toCharArray();

        return bf.append(char_str).toString();

    }

    public static void main(String[] args){

        LargestNumber large = new LargestNumber();
        int[] arr = {10,2};
        System.out.println(large.largestNumber(arr));
    }
}
