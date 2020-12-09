package com.loic.projectfacebook.leetcode.arrays;

public class MissingElemArray {
    public int missingElement(int[] nums, int k) {

        int n = nums.length;


        if(nums[n - 1] - nums[0] - (n - 1 - 0) < k){
                        return nums[n - 1] + k - BinarySort(nums, n - 1);
                     }

        int low= 0;
        int high = n-1;
        int mid = low + ( high - low ) /2;

            while(low < high) {

                if (BinarySort(nums,mid) < k) {

                    low = mid + 1;

                } else {

                        high = mid;
                }
            }

    return nums[low-1] + k - BinarySort(nums,low -1);


    }

    private int BinarySort(int[] nums,int mid){

        return nums[mid] - nums[0] - mid;

    }

    public static void main(String [] args) {

        MissingElemArray element = new MissingElemArray();
        int[] new_array = {4,7,9,10};
        System.out.println(element.missingElement(new_array,3));
    }
}
