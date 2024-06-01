package string;

import java.util.Scanner;

/*
    Q3. WAJP to take user input of String and count all the numeric characters.
 */
public class CountNumeric {

    public static int countNumericCharacters(String s){
        int count = 0;
        int n = s.length();
        for (int i =0;i<n;i++){
            char p = s.charAt(i);
            if (p>=48 && p<=57){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countNumericCharacters(s));
    }
}
