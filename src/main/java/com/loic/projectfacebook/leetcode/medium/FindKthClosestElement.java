package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class FindKthClosestElement {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        ArrayList<Integer> arr_list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<k;j++){

                if(arr[i] == x) {

                    arr_list.add(arr[j]);
                }

            }
        }

    return arr_list;

    }

    public static void main(String[] args) {

        FindKthClosestElement closest = new FindKthClosestElement();
        int[] array = {1,2,3,4,5};

        System.out.println(closest.findClosestElements(array,4,3));
    }
}
