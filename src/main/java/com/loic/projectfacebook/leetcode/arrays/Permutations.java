package com.loic.projectfacebook.leetcode.arrays;

import java.util.ArrayList;

public class Permutations {
    public ArrayList<Integer> nextPermutation(int[] nums) {

        ArrayList<Integer> new_array = new ArrayList<>();

        for(int i =nums.length-1;i>=0;i--) {

            new_array.add(nums[i]);


        }

        return new_array;

    }

    public static void main(String[] args) {

        Permutations perm = new Permutations();
        int[] arrays = {1,2,3};
        System.out.println(perm.nextPermutation(arrays));
    }
}
