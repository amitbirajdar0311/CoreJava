package com.ab._06Pattern;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n){
        if(n<=1){
            System.out.println(n+" is not a prime number");
            return false;
        }
        if(n==2){
            System.out.println(n+" is a prime number");
            return true;
        }
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(n+" is not a prime number");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num =29;
       if( isPrimeNumber(num)){
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is not a prime number");
        }
    }
}
