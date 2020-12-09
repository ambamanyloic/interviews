package com.loic.projectfacebook.leetcode.easy;

import com.loic.projectfacebook.leetcode.arrays.IntersectionArrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {



        ArrayList<Integer> arr_list = new ArrayList<>();
        int i = 0;
        int j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);


        while(i <  nums1.length && j < nums2.length){

                if(nums1[i] == nums2[j]) {

                         arr_list.add(nums1[i]);
                         i++;
                         j++;
                } else if (nums1[i] < nums2[j]){
                            i++;
                } else {
                            j++;
                }

        }

        int[] result = new int[arr_list.size()];
        int k=0;
        for(int l: arr_list){
            result[k++] = l;
        }

        return result;

    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        IntersectionArrays inter = new IntersectionArrays();
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(inter.intersect(arr1,arr2));
    }

}
