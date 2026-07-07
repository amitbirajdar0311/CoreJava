package com.ab._10OOPS;

public class AnonymousInnerClass {
    static void main() {
        AB ab = new AB(){
            void show(){
                System.out.println("in main showing.......");
            }
        };
        ab.show();

    }
}
class AB{
    void show(){
        System.out.println("in AB showing......");
    }
}
