package Array;
/*
    13.WAJP to print each element of the array which has appeared more than once in the array.
 */

import java.util.Scanner;

public class Question13 {
    public static void getMaxFrequency(int[]a){
        int n = a.length-1;
        for (int i=0;i<=n;i++){
            int count =1;
            for (int j=i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }
            if (count!=1){
                System.out.println("Elements with apperence more than once is: "+a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();

        int a[]=new int[n];
        for (int i=0;i<a.length;i++) {
            System.out.print("Enter "+(i+1)+"element in array: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Entered element are: ");
        for (int x:a){
            System.out.print(x+" ");
        }
        System.out.println();

        getMaxFrequency(a);
    }
}
