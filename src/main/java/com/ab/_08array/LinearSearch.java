package com.ab._08array;

public class LinearSearch {
    public static void linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {

        int[] arr= {8,1,82,28,52};
        int key = 28;
        linearSearch(arr,key);

    }
}
