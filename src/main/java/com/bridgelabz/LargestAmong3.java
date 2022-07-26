package com.bridgelabz;

import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y ");
        int y = sc.nextInt();
        System.out.println("Enter the value of z ");
        int z = sc.nextInt();


        if(x>=y && x>=z){
            System.out.println(x+ " is largest number");
        }else if(y>=x && y>=z){
            System.out.println(y+ " is largest number");
        }else {
            System.out.println(z + " is largest number");
        }
    }
}
