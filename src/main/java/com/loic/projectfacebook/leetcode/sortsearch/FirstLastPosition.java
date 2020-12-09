package com.loic.projectfacebook.leetcode.sortsearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstLastPosition {
    public ArrayList<Integer> searchRange(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        int first = 0;
        int last = 0;

        for(int i=0;i<nums.length;i++)
            if( target == nums[i])
                first = i;
                list.add(first);

        for(int j=nums.length-1;j>=0;j--)
            if(target == nums[j])
                last = j;
                list.add(last);


        return list;

    }

    public static void main(String[] args) {

        int[] nums_i = {5,7,7,8,8,10};
        int target = 8;

        FirstLastPosition first = new FirstLastPosition();
        System.out.println(first.searchRange(nums_i,target));
    }
}
