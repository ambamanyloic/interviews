package com.loic.projectfacebook.leetcode.Strings;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
        int [] resultIndex = null;
        int x = 0;
        int y = 0;


        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];

                //if (nums[i] + nums[j] == target) {
                if(sumMap.containsKey(temp)) {
                    resultIndex = new int[2];
                    resultIndex[0] = sumMap.get(temp);
                    x = resultIndex[0];
                    resultIndex[1] = nums[i];
                    y = resultIndex[1];
                } else {

                    sumMap.put(nums[i], i);

                }
        }
        return new int[]{x, y};

    }

    public static void main(String[] args) {

        TwoSum tSum = new TwoSum();
        int[] test_arr = {2, 7, 11, 15};
        System.out.println(tSum.twoSum(test_arr,9));

    }
}
