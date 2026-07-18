package com.ab._11Multithreading;

public class MultiThread {
    public static void main(String[] args){
        C c = new C();
        D d = new D();

        System.out.println("Priority of C: " + c.getPriority());
        System.out.println("Priority of D: " + d.getPriority());
        c.setPriority(Thread.MAX_PRIORITY);
        d.setPriority(Thread.MIN_PRIORITY);
        c.start();
        d.start();

    }
}

class C extends  Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi " + i );
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class D extends  Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello " + i );
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}