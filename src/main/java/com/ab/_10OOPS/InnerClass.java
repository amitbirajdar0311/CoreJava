package com.ab._10OOPS;

public class InnerClass {
    static void main() {
        A a = new A();
        a.age=24;
        System.out.println("Age is : " + a.age);
        a.show();


        A.B b = a.new B();
        b.config();
    }
}


class A{
    int age = 23;
    void show (){
        System.out.println("Age is : " + age);
    }

    class B{
        void config(){
            System.out.println("Config .......");
        }
    }
}