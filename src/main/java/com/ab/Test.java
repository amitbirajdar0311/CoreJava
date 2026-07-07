package com.ab;

public class Test {
    static void main() {
        // print random value
        int a = (int) (Math.random() * 100);
        System.out.println("Random number is " + a);

        // 2-D array using for each loop
        int[][] matrix = new int[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
    }
}
