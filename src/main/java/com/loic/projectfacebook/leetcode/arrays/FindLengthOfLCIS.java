package com.loic.projectfacebook.leetcode.arrays;

public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] nums) {
        int j =0;
        String str = null;

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] > nums[i+1]) {
                j = nums.length-i;
            }
        }

        return j;

    }

    public static void main(String[] args) {

        FindLengthOfLCIS flt = new FindLengthOfLCIS();
        int [] arr = {2,2,2,2,2};
        System.out.println(flt.findLengthOfLCIS(arr));
    }
}
