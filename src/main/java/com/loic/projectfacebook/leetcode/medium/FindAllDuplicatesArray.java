package com.loic.projectfacebook.leetcode.medium;

import java.util.*;


public class FindAllDuplicatesArray {

    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        //List<Integer> arr_list = new ArrayList<>();
        List<Integer> res = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {

                map.put(nums[i], 1);
            }

            for (Map.Entry hmap : map.entrySet()) {


                if ((Integer) hmap.getValue() == 2) {

                    res.add((Integer) hmap.getKey());

                }
            }


        }

        return res;

        /*List<Integer> res = new LinkedList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int pos = Math.abs(nums[i])-1;
            if(nums[pos]<0){
                res.add(pos+1);
            }
            nums[pos] = -nums[pos];
        }
        return res;*/

    }

    public static void main(String[] args) {


        FindAllDuplicatesArray find = new FindAllDuplicatesArray();
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(find.findDuplicates(arr));
    }
}
