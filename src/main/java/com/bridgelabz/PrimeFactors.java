package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        System.out.println("The Prime Factors for the number " + number + " is:");

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number/i;
            }
        }
            if (number>2) {
                System.out.print(number);
            }
        }
    }

