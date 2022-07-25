package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Leap year:");
        int year = sc.nextInt();
        boolean result = leapYearChecker(year);

        if(result){
            System.out.println("Year:"+ year+ " is a Leap year.");
        }else{
            System.out.println("Year:"+ year+ " is not a Leap year.");
        }
    }

    private static boolean leapYearChecker(int year) {
    if(year>1000) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
    }
            return false;
        }

}
