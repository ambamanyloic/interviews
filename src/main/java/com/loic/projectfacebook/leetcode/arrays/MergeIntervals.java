package com.loic.projectfacebook.leetcode.arrays;

public class MergeIntervals {
    public int[] merge(int[]interval1, int[] interval2) {

        int[] new_int = {};

        for(int i=0;i<interval1.length;i++) {
            for(int j=i;j<interval2.length;j++) {

                if(interval1[i] == interval2[j]) {

                    //new_int = {i,j};
                }
            }
        }

        return new_int;

    }
}
