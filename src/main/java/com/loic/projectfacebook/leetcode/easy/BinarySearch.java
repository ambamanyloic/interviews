package com.loic.projectfacebook.leetcode.easy;

public class BinarySearch {

    public  int binarySearch(int[] array,int x) {

        int n = array.length;


        return  binarySearch(array, 0, n-1,x);
    }


    int binarySearch(int[] array, int start, int end,int x)

    {

        if (end >= start) {

            int mid = start + (end - start) / 2;

            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] > x) {


                return binarySearch(array, start, mid - 1, x);

            } else {

                return binarySearch(array, mid + 1, end, x);
            }

        }

        return -1;

    }


    public static void main(String[] args) {

        BinarySearch bin = new BinarySearch();
        int[] array = {1,2,4,5,6,7,9,10};
        int n = array.length;
        int x = 5;

        System.out.println(bin.binarySearch(array,x));

    }
}