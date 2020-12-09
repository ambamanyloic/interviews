package com.loic.projectfacebook.leetcode.easy;

public class PivotIndex {
    public int pivotIndex(int[] nums) {

        int j =0;
        int size = nums.length-1;
        for(int i=0;i<nums.length;i++) {
            while(nums[0] + nums[i-j] == nums[i+j] + nums[size]) {
                j = nums[j];
                //TO REDO => Was not able to solve

            }
        }

        return j;

    }

    public static void main(String[] args) {

        PivotIndex pivot = new PivotIndex();
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivot.pivotIndex(arr));
    }
}
