package com.ab._09String;

public class StringConcepts {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "abc";
        String str4 = new  String("abc");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));


        // Convert to Uppercase

        String str = "hi i am amit birajdar";
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0))); // H
        for(int i=1;i<str.length();i++){
            if(str.charAt((i)) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());

        // String Compression
        String sing = "abcccccccccccccc";
        StringBuilder sbing = new StringBuilder();
        Integer counter = 0;
        for(int i=0;i<sing.length();i++){
            while( i<sing.length()-1 && sing.charAt(i) == sing.charAt(i+1)){
                counter++;
                i++;
            }
            sbing.append(sing.charAt(i));
            if(counter>1){
                sbing.append(counter);
            }
            counter = 1;
        }
        System.out.println(sbing.toString());
    }
}
