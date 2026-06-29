package com.ab._02VariableAndDataType;

public class VariableAndDataType {
    public static void main(String[] args){

        char ch = 'a';
        int b = ch;
        System.out.println(b);

        char ch1 = ' ';
        int c = ch1;
        System.out.println(c);

        //java automatically promote byte short , chart to int

        byte b1 = 1;
        short c1 = 3;
        char ch2 = ' ';
        int d =  b1 + c1 + ch2;
        System.out.println(d);

        byte by = 23;
        by = (byte) ((byte)by*2);
        by*=2;
        System.out.println(by);
    }

}
