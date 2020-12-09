package com.loic.projectfacebook.leetcode.medium;

import com.loic.projectfacebook.leetcode.arrays.FindLengthOfLCIS;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int begin = 0;
        int end = nums.length-1;

        int mid = begin + ( end - begin) /2;

        if(nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {
            begin = mid + 1;
        } else if(nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]) {
            end = mid - 1;
        } else { // nums[mid - 1] > nums[mid] && nums[mid] < nums[mid + 1]
            // Both side has a peak, but we need to move mid towards eigther way
            begin = mid +   1;
        }

        if(nums[begin] > nums[end]) {
            return begin;
        }
        return end;

    }

    public static void main(String[] args) {

        FindPeakElement peak = new FindPeakElement();
        int[] arr =  {1,2,3,1};
        System.out.println(peak.findPeakElement(arr));
    }
}
