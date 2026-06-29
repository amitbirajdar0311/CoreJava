package com.ab._04ConditionalStatement;

import org.w3c.dom.ls.LSOutput;

public class SwitchCase {
    static void main() {

        //java 7+ traditional switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("------------------- java 14+ switch case with arrow -------------------");

        //java14+ switch case with arrow

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        System.out.println("------------------- java 14+ switch case with multiple labels -------------------");
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }

        System.out.println("------------------- java 14+ switch case with yield -------------------");
        String dayType = switch (7){
            case 1,2,3,4,5 -> "Monday";
            case 6,7 -> {
                System.out.println("hi this is yeild statement");
                yield "Weekend";
            }
            default -> "Invalid day";

        };
        System.out.println("dayType = " + dayType);


        System.out.println("------------------- java 21+ pattern matching switch case  ------------------");
        Object obj = true;
        switch (obj){
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Character c -> System.out.println("Character: " + c);
            case Boolean b -> System.out.println("Boolean: " + b);
            default -> System.out.println("Invalid type");
        }

    }
}
