package com.loic.projectfacebook.leetcode.Strings;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List arrList = new ArrayList<>();

        for(int i=0;i<candidates.length;i++){

            for(int j=i+1;j<candidates.length;j++) {

                if (candidates[i] == target) {

                    arrList.add(candidates[i]);

                } else if(candidates[i] + candidates[j] == target){

                    arrList.add(candidates[i]);
                    arrList.add(candidates[j]);

                }
            }
        }

        return arrList;

    }

    public static void main(String [] args) {

        CombinationSum comSum = new CombinationSum();
        int [] new_array = {2,5,6,7};
        System.out.println(comSum.combinationSum(new_array,7));
    }

}
