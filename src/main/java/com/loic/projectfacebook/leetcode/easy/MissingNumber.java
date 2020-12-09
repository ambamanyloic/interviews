package com.loic.projectfacebook.leetcode.easy;

import com.loic.projectfacebook.facebookexercises.queuesstack.MinStack;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int j =0;

        if (nums[0] != 0) {
            return 0;
        } else if (nums[nums.length - 1] != nums.length)  {
            return nums.length;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] != nums[i] + 1) {

                j = nums[i] + 1;
            }

        }

        return j;

    }

    public static void main(String[] args) {

        MissingNumber miss = new MissingNumber();
        int[] num_arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(miss.missingNumber(num_arr));
    }
}
