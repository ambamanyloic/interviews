package com.loic.projectfacebook.leetcode.medium;


public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {

        int size = nums.length;

        if (nums == null || size == 0) {
            return 0;
        }


        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {

                sum += nums[i];

                while (sum >= s) {

                    min = Math.min(min,i - j + 1);
                    sum -= nums[j];
                    j++;
                }

            }

            return min;


    }

    public static void main(String [] args) {

        MinimumSizeSubarraySum min = new MinimumSizeSubarraySum();
        int[] array_sum = {2,3,1,2,4,3};
        System.out.println(min.minSubArrayLen(7,array_sum));

    }
}
