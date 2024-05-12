package Array;

import java.util.Scanner;

/*
    15.WAJP to print the element and the frequency which has appeared for the maximum times in the array.
 */
public class Question15 {

    public static void maximumFrequency(int a[]){
        int  n = a.length-1;
        int max_count=0;
        int target = 0;
        for (int i =0;i<=n;i++){
            int count =1;
            for (int j =i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }
            if (max_count<count){
                target=a[i];
                max_count=count;
            }
        }
        System.out.println(target +" is appeared "+max_count+" times.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int a [] = new int[n];
        for (int i =0;i<n;i++){
            System.out.print("Enter "+ (i+1)+" element ");
            a[i]= sc.nextInt();

        }
        System.out.println();
        maximumFrequency(a);
    }
}
