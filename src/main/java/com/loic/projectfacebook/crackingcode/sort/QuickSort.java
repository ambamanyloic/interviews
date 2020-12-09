package com.loic.projectfacebook.crackingcode.sort;

public class QuickSort {

    int[] numbers;

    public void sort(int[] values){

        if ( values==null || values.length==0){
            return ;
        }

        int number = numbers.length-1;

        quickSort(0,number);

    }

    public void quickSort(int low,int high) {

        int i = low;
        int j = high;

        int pivot = numbers[high + (high - low) / 2];

        while (i <= j) {


            if (numbers[i] < pivot) {

                i++;
            }

            if (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, i);
        }
        if (high > i) {
            quickSort(i, high);
        }

    }

        public void exchange(int i,int j){

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }



    }
