package com.ab._10OOPS;

import java.util.Arrays;

public class Enum {
    static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        System.out.println(Arrays.toString(Day.values()));

        Day[] days = Day.values();
        for(Day d: days){
            System.out.print(d+" ");
        }
        System.out.println(" ");

        System.out.println(day.getClass().getSuperclass());

        Laptop[] laptop = Laptop.values();
        for(Laptop l : laptop){
            System.out.print(l+" : " + l.getPrice() + " ");
        }
    }
}

enum Laptop{
    MACBOOK(1000), DELL(), HP(600), LENOVO(500);
    private int price;
    Laptop(){
        this.price = 100;
    }
    Laptop(int price){
        this.price = price;
        System.out.println("Constructor called for : " + this.toString() + " and price is : " + price);
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
enum Day{
    SUNDAY , MONDAY , TUESDAY , WEDNSDAY , THURSDAY , FRIDAY , SATURDAY
}
