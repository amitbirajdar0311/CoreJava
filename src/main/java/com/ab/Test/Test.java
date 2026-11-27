package com.ab.Test;

import java.util.Arrays;
import java.util.Scanner;



public class Test {
    public static void linearSearch( int key,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==key){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void largeAndSammestNumber(int[] arr){
        int large = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int j : arr) {
            large = Math.max(large, j);
            smallest = Math.min(smallest, j);
        }
        System.out.println("Largest element: "+large);
        System.out.println("Smallest element: "+smallest);
    }


    public static void reverseArray(int[] arr) {
       int start = 0;
       int end = arr.length -1 ;

       while(start<end){
           int temp  = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }

    public static void subArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 5;
        linearSearch(key,arr);
        largeAndSammestNumber(arr);

        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        subArray(arr);
    }
}
