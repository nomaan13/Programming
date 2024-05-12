package Array;

import java.util.Scanner;
/*
    12. WAJP to print each element of the array which has appeared only once in the array.
 */
public class Question12 {

    public static void getFrequencyOf(int a[]){
        int n = a.length-1;
        for (int i=0;i<=n;i++){
            int count =1;
            for (int j =i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    j--;
                    n--;
                }}if (count==1){
                System.out.println("\nElement with only one count is : "+a[i]);
            }}}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+ " element : ");
            a[i]= sc.nextInt();
        }
        System.out.print("Entered array is : " );
        for (int x : a ){
            System.out.print(x + " ");
        }
        getFrequencyOf(a);

    }
}
