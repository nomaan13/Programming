package string;

import java.util.Scanner;

public class PrintIndex {

    public static void printIndexes(String s){
        int n = s.length();

        for (int i =0;i<n;i++){
            char a = s.charAt(i);
            if (a>=48&&a<=57){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string here: ");
        String  s = sc.nextLine();
        System.out.println("Numeric characters are present at indexes:  " );
        printIndexes(s);

    }
}
