package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int Numbers[] = new int[5];

        boolean sorted = false;
        int temp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any 5 numbers.");

        for(int i = 0; i < Numbers.length; i++){

            Numbers[i] = scanner.nextInt();

        }

        while(!sorted) {

            sorted = true;

            for (int i = 0; i < Numbers.length - 1; i++) {
                if (Numbers[i] > Numbers[i+1]) {
                    temp = Numbers[i];
                    Numbers[i] = Numbers[i+1];
                    Numbers[i+1] = temp;
                    sorted = false;
                }
            }

        }

        for(int i = 0; i < Numbers.length; i++){

            System.out.println(Numbers[i]);

        }

        System.out.println("The End");

    }
}
