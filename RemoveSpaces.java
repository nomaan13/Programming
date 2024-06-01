package string;
/*
    Q7 . WAJP to remove all whitespaces from a String entered by user.
 */

import java.util.Scanner;

public class RemoveSpaces {
    public static  String removeWhiteSpaces(String s ){
        String s2 = "";
        int n = s.length();

        for (int i =0;i<n;i++){
            char a = s.charAt(i);
            if (a!=' '){
                s2=s2+a;
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string here: ");
        String s = sc.nextLine();
        System.out.println(removeWhiteSpaces(s));
    }
}
