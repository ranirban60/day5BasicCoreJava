package com.bridgelabz;

public class FindTriplets {
    public static void main(String[] args) {
        int arr[] = {7,-7,4,-5,1,9,-8};
        int n = arr.length;
        findTriplet(arr,n);
    }

     static void findTriplet(int[] arr, int n) {
         boolean statement = false;
         for (int i = 0; i < n - 2; i++) {
             for (int j = i + 1; j < n - 1; j++) {
                 for (int k = j + 1; k < n; k++) {
                     if (arr[i] + arr[j] + arr[k] == 0) {
                         System.out.println(arr[i] + " " + arr[j]+ " "+arr[k]);
                         statement = true;
                     }
                 }
             }
         }
         if (statement == false) {
             System.out.println("Triplet not exist");
         }
     }

}
