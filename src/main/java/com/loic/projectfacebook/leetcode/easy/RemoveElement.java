package com.loic.projectfacebook.leetcode.easy;

public class RemoveElement {

    public int removeElement(int[] nums,int val){

        int index = 0;
        for(int i=0;i<nums.length;i++){

            if(nums[i] != val){

                nums[index++] = i;
            }
        }

        return index;

    }

    public static void main(String[] args){

        RemoveElement remove = new RemoveElement();
        int[] array = {3,2,2,3};
        System.out.println(remove.removeElement(array,3));

    }
}
