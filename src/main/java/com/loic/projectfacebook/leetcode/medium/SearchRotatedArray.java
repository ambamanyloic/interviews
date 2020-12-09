package com.loic.projectfacebook.leetcode.medium;


public class SearchRotatedArray {
    public int search(int[] nums, int target) {

        int num = -1;

        for(int i =0;i<nums.length;i++){
            if(nums[i] == target) {

                num = i;
            }
        }

        return num;

    }

    public static void main(String args[]){

        SearchRotatedArray search = new SearchRotatedArray();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search.search(arr,3));

    }
}
