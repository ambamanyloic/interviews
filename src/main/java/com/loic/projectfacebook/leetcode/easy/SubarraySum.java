package com.loic.projectfacebook.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        Map<Integer, Integer> preSum = new HashMap<>();  // Maintains prefixSum and count of subArray ending with sum as k.
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                count += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return count;


    }

    public static void main(String[] args){

        SubarraySum sum = new SubarraySum();
        int [] array_sum = {1,2,3};
        System.out.println(sum.subarraySum(array_sum,3));
    }
}
