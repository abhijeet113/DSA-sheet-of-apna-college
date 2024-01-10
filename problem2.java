/*
 * Write a program to reverse an array or string
 */

import java.util.Scanner;

public class problem2 {
    static int[] reverse(int arr[], int stidx ,int lsidx) {
        if (stidx<lsidx) {
            int temp = arr[stidx];
            arr[stidx] = arr[lsidx];
            arr[lsidx] = temp;
            reverse(arr, stidx+1, lsidx-1);
        }
        
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr,0,arr.length-1);
        for (int i =0;i<arr.length;i++) {
            System.err.print(arr[i]+ " ");            
        }
    }
}
