package com.loic.projectfacebook.leetcode.easy;


public class LongestIncreasingSequence {

    public int findLengthOfLCIS(int[] nums) {

        int n = nums.length;
        int count= 0;

        for(int i =0;i<n;i++){

            if(nums[i+1] > nums[i]) {


                count++;
            } else {

                break;
            }

        }

        return count;

    }

    public static void main(String[] args) {


    }
}