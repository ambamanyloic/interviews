package com.loic.projectfacebook.leetcode;

import java.util.ArrayList;

public class ArrayIndices {
    public ArrayList<Integer> twoSum(int[] nums, int target) {

        ArrayList<Integer> new_list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    new_list.add(i);
                    new_list.add(j);

                    //return new int[]{i, j};
                    return new_list;
                }
            }


        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] new_array = new int[] {2,4,6,1};

        ArrayIndices a_index = new ArrayIndices();
        System.out.println(a_index.twoSum(new_array,8));
    }
}
