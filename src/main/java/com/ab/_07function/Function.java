package com.ab._07function;

public class Function {
    public static int add(int x, int y) {
        return x + y;
    }
    public static void main() {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + c);

        change(a);
        System.out.println("Value of a after change: " + a);
    }
    public static void change(int x) {
        x = 30;
    }
}
