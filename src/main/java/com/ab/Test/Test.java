package com.ab.Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
    }
}


interface  Harbivours{
    default void eat(){
        System.out.println("Harbivours can eat plants");
    }
}

interface Carnivores{
    default void eat(){
        System.out.println("Carnivores can eat meat");
    }
}

class Human implements Harbivours, Carnivores{
    @Override
    public void eat(){
        Harbivours.super.eat();
        Carnivores.super.eat();
        System.out.println("Human can eat both plants and meat");
    }



}