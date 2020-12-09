package com.loic.projectfacebook.leetcode.sortsearch;

public class PeakElement {

    public int findPeakUtil(int[] arr,int low, int high,int n) {

        int mid = low + (high - low)/2;  /* (low + high)/2 */

        // Compare middle element with its neighbours (if neighbours
        // exist)
        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 ||
                arr[mid+1] <= arr[mid]))
            return mid;

            // If middle element is not peak and its left neighbor is
            // greater than it,then left half must have a peak element
        else if (mid > 0 && arr[mid-1] > arr[mid])
            return findPeakUtil(arr, low, (mid -1), n);

            // If middle element is not peak and its right neighbor
            // is greater than it, then right half must have a peak
            // element
        else return findPeakUtil(arr, (mid + 1), high, n);

    }

    public int findPeak(int arr[], int n)
    {
        return findPeakUtil(arr, 0, n-1, n);
    }



    public static void main(String[] args) {
        int[] n_arr = new int[] {1,2,1,3,5,6,4};
        int n = n_arr.length;
        PeakElement peek = new PeakElement();
        System.out.println(peek.findPeak(n_arr,n));
    }
}
