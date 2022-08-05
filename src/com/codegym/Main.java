package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Draw the rectangle");
                    for (int i = 0; i < 3;i++){
                        for (int j = 0; j <7;j++){
                            System.out.print("* ");
                        }
                    }
                case 2:
                    System.out.println("2. Print the square triangle");
                    for (int i = 0 ; i <= 5; i++){
                        for (int j = 1; j < i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                case 3:
                    System.out.println("Print isosceles triangle");
                    int k;
                    for(int i=0;i<5;i++){
                        for (int j=1;j<5-i;j++) {
                            System.out.println(" ");
                        }
                        while (k != (2 * i) - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.print("\n");
                    }
                    System.out.println(" ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
