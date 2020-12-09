package com.loic.projectfacebook.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {

    int j =0;
    Map<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<nums.length-1;i++) {

        if(map.containsKey(nums[i])) {
            map.put(nums[i],map.get(nums[i]) +1);
        } else {

            map.put(nums[i],1);
        }

    }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())

        if(entry.getValue() == 1) {

            j = entry.getKey();
        }

        return j;

        }

    public static void main(String[] args){

        SingleNumber single = new SingleNumber();
        int[] arr = {4,1,2,1,2};
        System.out.println(single.singleNumber(arr));
    }

}
