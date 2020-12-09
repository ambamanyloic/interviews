package com.loic.projectfacebook.leetcode.hard;

public class ShortestSubarraySumK {
    public int shortestSubarray(int[] A, int K) {

        int min = Integer.MAX_VALUE;
        int value = 0;
        int j =0;

        for(int i=0;i<A.length;i++){

            value += A[i];

            if(value == K) {


                min = Math.min(min,i-j+1);

                if(min < value){

                    value = min;
                }
            }


        }
        return min;

    }
}
