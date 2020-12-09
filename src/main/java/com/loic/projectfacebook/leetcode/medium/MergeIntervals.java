package com.loic.projectfacebook.leetcode.medium;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        int[][] array_one = {{1,4},{4,5}};
        int[] array_two = {4,5};
        int[][] array_last = null;
        int size_one = array_one.length;
        int size_two = array_two.length;

        for(int i=0;i<array_one.length;i++){
            for(int j=0;j<array_two.length;j++){



            }
        }

        return array_last ;

    }

    public static void main(String [] args) {

        MergeIntervals merge = new MergeIntervals();
        int[] new_one = {1,4};
        int[] new_two = {4,5};
        int[][] new_last = {};

        System.out.println(merge.merge(new_last));

    }
}
