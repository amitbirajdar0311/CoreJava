package com.ab._11Multithreading;

public class RunnableImpl {
    public static void main(String[] args) {
        Runnable obj = () ->{
            for(int i=0;i<=10;i++){
                System.out.println("Hi " + i);
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable obj1 = () -> {
            for(int i=0;i<=10;i++){
                System.out.println("Hello " + i);
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };


        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}
