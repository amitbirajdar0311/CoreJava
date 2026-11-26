package com.ab._05LoopsFlowControl;

public class FlowControl {
    public static void main(String[]  args) {
        // 1. For Loop
        for (int i=0; i < 2;i++ ) {
            if (i == 1) {
                System.out.println("World");
            } else {
                System.out.println("Java");
            }
        }

        // 2. While Loop
        int i = 0;
        while(i < 2) {
            if (i == 1) {
                System.out.println("World");
            } else {
                System.out.println("Java");
            }
            i++;
        }

        /// i==0 java + i==1 World

        // 3. Do While Loop
        int j = 0;
        do {
            if (j == 1) {
                System.out.println("World");
            } else {
                System.out.println("Java");
            }
            j++;
        }
        while(j < 2);

        // 4. Break and Continue
        for (int k = 0; k < 5; k++) {
            if (k == 2) {
                break;
            }
            System.out.print(k+" ");
        }
        System.out.println();

        for (int k = 0; k < 5; k++) {
            if (k == 2) {
                continue;
            }
            System.out.print(k+" ");
        }
        System.out.println();

        // 5. For-each loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
