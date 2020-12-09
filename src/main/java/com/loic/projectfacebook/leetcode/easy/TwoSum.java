package com.loic.projectfacebook.leetcode.easy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public ArrayList<Integer> twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
           // return new int[]{0,0};
            return null;

        ArrayList<Integer> arr_list = new ArrayList<>();

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                //return new int[] { numMap.get(complement), i };
                //numMap.get(complement);
                arr_list.add(numMap.get(complement));
                arr_list.add(i);
            } else {
                numMap.put(nums[i], i);
            }
        }
        return arr_list;
    }


    public static void main(String[] args) {

        TwoSum sum = new TwoSum();
        int[] new_array = {2,7,11,15};
        System.out.println(sum.twoSum(new_array,9));
    }

}
