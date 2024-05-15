package Array;

import java.util.Scanner;

/*
    18.WAJP to insert an element at certain position of the array.
 */
public class Question18 {
    private static int[] insertIntoArray(int a [], int index,int element) {
        int n = a.length;

        int b[]=new int[a.length+1];


        for (int i=0;i<b.length;i++){
            if (i<index){
                b[i]=a[i];

            }
            if (i > index) {
                b[i] = a[i - 1];
            }

            b[index] = element;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the index position :");
        int x  = sc.nextInt();
        System.out.print("Please enter the element :");
        int y = sc.nextInt();

        int a [] ={12,20,30,16,40};
        System.out.println("Old array ");
        for (int z:a){
            System.out.print(z+" ");
        }

        System.out.println("\nNew Array");
        int newArray[] =insertIntoArray(a,x,y);
        for (int q :newArray){
            System.out.print(q +" ");
        }}}