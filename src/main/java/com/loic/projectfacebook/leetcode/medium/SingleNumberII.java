package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {

    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int value = 0;

        for(int i =0;i<nums.length;i++) {

            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+ 1);
            } else {

                map.put(nums[i],1);
            }

            for(Map.Entry hmap : map.entrySet()) {


                if((Integer)hmap.getValue() != 3) {

                    value = (Integer)hmap.getKey();

                }
            }
        }

        return value;
    }

    public static void main(String [] args){


        SingleNumberII single = new SingleNumberII();
        int[] arr = {0,1,0,1,0,1,99};

        System.out.println(single.singleNumber(arr));
    }
}
