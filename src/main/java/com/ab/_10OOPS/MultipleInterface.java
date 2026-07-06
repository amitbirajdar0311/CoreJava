package com.ab._10OOPS;

public class MultipleInterface {
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.eat();

    }


}

interface Harbivorous {
    default void eat() {
        System.out.println("harbivorous is eating ....");
    }
}

interface Carnivorous {
    default void eat() {
        System.out.println("carnivorous is eating ....");
    }
}

class Human implements Harbivorous, Carnivorous {
    @Override
    public void eat() {
        Harbivorous.super.eat();
        Carnivorous.super.eat();
        System.out.println("human is eating ....");
    }

    public void walk() {
        System.out.println("walking...............");
    }
}