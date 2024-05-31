package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
    22.WAJP to remove the duplicate value from the array and store all unique elements in a new Array.
 */
public class Question22 {
    public static void removeDuplicate(int []a){

        int x =a.length-1;

        int uniqueCount = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                uniqueCount++;
            }
        }

        int [] b= new int[uniqueCount];

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            System.out.print("Enter " +(i+1)+ " element : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Entered array is : ");
        for (int x: a){
            System.out.print(x+" ");
        }
    }
}

