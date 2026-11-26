package com.ab;

public class Test {
    public static void main(String[] args) {
        // as per java 7+ switch case we can use only int, short, byte, char, enum and String but not long, float, double and boolean
        String day = "Sunday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


//        java 14+ switch case with arrow

        switch (day) {
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday");
            case "Wednesday" -> System.out.println("Wednesday");
            case "Thursday" -> System.out.println("Thursday");
            case "Friday" -> System.out.println("Friday");
            case "Saturday" -> System.out.println("Saturday");
            case "Sunday" -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }


        //java 14+ switch case with multiple labels
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }

        //java 14+ switch case with yield

        String dayType = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> {
                System.out.println("Invalid day");
                yield "Invalid day";
            }
        };
        System.out.println(dayType);


        // java 14+ switch case with yield and multiple statements
        String dayType1 = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                System.out.println("Weekday");
                yield "Weekday";
            }
            case "Saturday", "Sunday" -> {
                System.out.println("Weekend");
                yield "Weekend";
            }
            default -> {
                System.out.println("Invalid day");
                yield "Invalid day";
            }
        };
        System.out.println(dayType1);

        // java 21+ switch case with pattern matching
        Object obj = "Hello";
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            case Boolean b -> System.out.println("Boolean: " + b);
            default -> System.out.println("Unknown type");
        }
    }
}
