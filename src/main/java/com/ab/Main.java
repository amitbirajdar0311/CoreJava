package com.ab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws IOException {

        System.out.println("This is my hello world program!!!");

        System.out.println("Enter a number : ");
//        int a = System.in.read();
//        System.out.println("You entered: " + (a - 48));

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        System.out.println("You entered: " + a);
        bf.close();

    }
}
