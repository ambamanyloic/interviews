package com.loic.projectfacebook.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> list_arr = new ArrayList<>();

        for(int i=0;i<nums1.length;i++) {

            for(int j=0;j<nums2.length;j++) {


                if (nums2[j] == nums1[i] + 1) {

                    list_arr.add(nums2[j]);
                } else {
                    list_arr.add(-1);
                }
            }
        }

      return listToArray(list_arr);

    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main (String[] args) {

        NextGreater great = new NextGreater();
        int[] num1 = {2,4};
        int[] num2 = {1,2,3,4};

        System.out.println(great.nextGreaterElement(num1,num2));

    }
}
