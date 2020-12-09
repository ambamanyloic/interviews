package com.loic.projectfacebook.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionTwoArrayBis {
    public HashSet intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr_list = new ArrayList<>();
        HashSet<Integer> ar_list = new HashSet<>();

        for(int i =0;i<nums1.length;i++){

            arr_list.add(nums1[i]);
        }

        for(int j=0;j<nums2.length;j++){

            if(arr_list.contains(nums2[j])) {

                ar_list.add(nums2[j]);

            }
        }

        return ar_list;
    }

    public static void main(String[] args) {

        IntersectionTwoArrayBis bis = new IntersectionTwoArrayBis();
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};

        System.out.println(bis.intersection(num1,num2));
    }
}
