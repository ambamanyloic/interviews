package com.loic.projectfacebook.leetcode.medium;

import java.util.*;
import java.util.ArrayList;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) throws NullPointerException {

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Set<ArrayList<Integer>> set = null;

        for(int i=0;i<nums.length-2;i++) {

            for(int j = i+1;j< nums.length-1;j++) {

                for(int k=j+1;k<nums.length;k++) {


                       if (nums[i] + nums[j] + nums[k] == 0) {
                           numList.add(nums[i]);
                           numList.add(nums[j]);
                           numList.add(nums[k]);
                       }
                    }
                }
            }

        list.add(numList);

        return list;
        }

        public static void main(String [] args) {

         ThreeSum sum = new ThreeSum();
         int[] arr_list = {-1, 0, 1, 2, -1, -4};

         System.out.println(sum.threeSum(arr_list));


        }


    }
