package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("t");
        double t = sc.nextDouble();
        System.out.println("v");
        double v = sc.nextDouble();
        double w = 35.74+ 0.6125*t + (0.4275*t-35.75) * Math.pow(v,0.16);
        //The formula is not valid if "t" is larger than 50 in absolute value or if "v" is larger than 120 or
        //less than 3.
        System.out.println("Temperature= "+ t +" Fahrenheit");
        System.out.println("Wind Speed= " +v+ " mph ");
        System.out.println("Wind Chill= " +w);
    }
}
