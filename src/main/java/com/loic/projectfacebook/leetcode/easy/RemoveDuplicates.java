package com.loic.projectfacebook.leetcode.easy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int j = 0;

            for (int i = 0; i < nums.length; i++) {

                if(i < n - 1 && nums[i] == nums[i+1]){

                    nums[j] = nums[i];
                    continue;
                }
                nums[j++] = nums[i];

            }

        return j;

    }

    public static void main(String[] args) {

        int[] num_arr = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates dup = new RemoveDuplicates();
        System.out.println(dup.removeDuplicates(num_arr));

    }
}
