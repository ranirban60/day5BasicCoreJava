package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
            int head=0;
            int tail=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Flipping coin n ");

        int n = sc.nextInt();
           for(int i=0;i<n; i++){
          double randomValue = Math.random();
          System.out.println("Random Value " +randomValue);
          if (randomValue < 0.5) {
              head++;
                System.out.println("Head");
            } else {
              tail++;
                System.out.println("Tail");
            }
        }
           System.out.println("Number of Head is"+" " +head);
           System.out.println("Number of Tail is"+" " +tail);
           int percentageOfHead = ((head *100)/n);
           System.out.println("Percentage of Head is" + " "+percentageOfHead);
           int percentageOfTail = ((tail *100)/n);
           System.out.println("Percentage of Tail is" + " "+percentageOfTail);
    }
    }

