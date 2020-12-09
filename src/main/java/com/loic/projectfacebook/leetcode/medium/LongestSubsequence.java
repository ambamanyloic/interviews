package com.loic.projectfacebook.leetcode.medium;

public class LongestSubsequence {
    public int lengthOfLIS(int[] nums) {

        int count = 0;

        for(int i =0;i<nums.length;i++){
            if(nums[i+1] > nums[i+1]) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        LongestSubsequence longest = new LongestSubsequence();
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(longest.lengthOfLIS(arr));
    }
}
