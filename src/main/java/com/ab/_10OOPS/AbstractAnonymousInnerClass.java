package com.ab._10OOPS;

public class AbstractAnonymousInnerClass {
    static void main() {
        Abstract ab = new Abstract() {
            @Override
            void show() {
                System.out.println("in main showing.......");
            }

            @Override
            void run() {
                System.out.println("in main running.......");
            }

            };
        ab.show();
        ab.run();
    }
}

abstract class Abstract{
    abstract void show();
    abstract void run();
}