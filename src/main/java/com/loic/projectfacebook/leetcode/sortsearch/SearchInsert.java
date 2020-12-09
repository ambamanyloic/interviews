package com.loic.projectfacebook.leetcode.sortsearch;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        int i = 0;

        for(i=0;i<nums.length;i++) {


            if(nums[i] == target)

                return i;
        }

        return i;


    }

    public static void main(String[] args) {

       SearchInsert si = new SearchInsert();
       int[] new_arr =  {1,3,7,1,2,5};
       System.out.println(si.searchInsert(new_arr, 5));
    }
}
