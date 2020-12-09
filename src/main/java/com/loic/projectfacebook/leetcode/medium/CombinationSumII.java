package com.loic.projectfacebook.leetcode.medium;
import com.loic.projectfacebook.leetcode.Strings.CombinationSum;

import java.util.*;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        ArrayList<Integer> curr = new ArrayList<Integer>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        helper(result, curr, 0, target, candidates);

        return result;
    }

        public void helper(List<List<Integer>> result, List<Integer> curr, int start, int target, int[] candidates){

            if(target==0){
                result.add(new ArrayList<Integer>(curr));

            }
            if(target<0){

            }

            int prev=-1;

        for(int i =start;i<candidates.length;i++) {


            if (prev != candidates[i]) {
                curr.add(candidates[i]);
                helper(result,curr,i+1,target- candidates[i],candidates);
                curr.remove(curr.size()-1);
                prev = candidates[i];

            }
        }

    }

    public static void main(String args[]) {

        CombinationSumII combine = new CombinationSumII();
        int[] arr = {10,1,2,7,6,1,5};

        System.out.println(combine.combinationSum2(arr,8));
    }
}
