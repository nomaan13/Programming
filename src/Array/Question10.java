package Array;

import java.util.Scanner;

/*
    10.WAJP to check number is even or odd without using if-else/conditional Operator statement.
 */
public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = {"even","odd"};
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("The number is :" + a[n%2]);
    }
}
