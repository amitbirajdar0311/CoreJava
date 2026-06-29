package com.ab._08array;

import java.util.Arrays;

public class ReverseAnArray {

    public static void  reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array: " + Arrays.toString(arr));

    }
    public static void main(String[] args){

        int[] arr = {2,4,6,8,10};
        reverseArray(arr);
    }

}
