package com.loic.projectfacebook.leetcode.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IntersectionArrays {
    public Object[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<Integer>();
        int[] new_int = null;

        try {


            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {

                    if (nums1[i] == nums2[j]) {

                       list.add(nums1[i]);

                    }

                }
            }

        }catch(NullPointerException io) {


            io.printStackTrace();
        }

        return list.toArray();

    }

    public static void main(String[] args) {

        IntersectionArrays inter = new IntersectionArrays();
        int[] new_array = {1,2,2,1};
        int [] new_array1 = {2,2};

        System.out.println(inter.intersect(new_array,new_array1));
    }
}
