package Array;

import java.util.Scanner;

/*
    11.WAJP to print the frequency of each element of the array .
 */
public class Question11 {
    public static void getFrequency(int []a){
        int n = a.length-1;
        for (int i=0;i<=n;i++){
            int count =1;
            for (int j= i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }}
            System.out.println("Total frequency of "+a[i]+" is : " + count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int a [] = new int[l];
        for (int i=0;i<l;i++){
            System.out.print("Enter "+(i+1)+" element here  : ");
             a[i] = sc.nextInt();
        }
        System.out.print("Entered elements are:  ");
        for (int x : a){
            System.out.print(x+" ");
        }

        System.out.println();
        getFrequency(a);
    }
}
