package com.ab._11Multithreading;

public class DemoThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show();
        b.show();
    }
}


class A{
    public void show(){
        for(int i=0;i<10;i++){
            System.out.println("Hello " + i );
        }
    }
}

class B{
    public void show(){
        for(int i=0;i<10;i++){
            System.out.println("Hi " + i );
        }
    }
}