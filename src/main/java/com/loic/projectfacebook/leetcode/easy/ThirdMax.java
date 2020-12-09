package com.loic.projectfacebook.leetcode.easy;

import java.util.Arrays;

public class ThirdMax {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        int j =0;

        for(int i=0;i<nums.length;i++){

            j = nums[i];
        }

        return j;
    }

    public static void main(String[] args) {

        ThirdMax max = new ThirdMax();
        int[] nums = {3, 2, 1};
        System.out.println(max.thirdMax(nums));
    }
}
