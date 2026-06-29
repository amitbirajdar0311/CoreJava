package com.ab._08array;

public class LinearSearchAndBinarySearch {
    public static void linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void binarySearch(int[] arr, int key){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {

        int[] arr= {2,4,6,8,10};
        int key = 18;
        linearSearch(arr,key);
        binarySearch(arr,key);

    }
}
