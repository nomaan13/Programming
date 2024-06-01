package string;
/*
    Q4. WAJP to take user input String and count all the characters without spaces in the String.
 */
import java.util.Scanner;
public class CountWithoutSpace {

    public static int countCharacters(String s ){
        int count = 0;
        int n = s.length();

        for (int i =0;i<n;i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countCharacters(s));
    }
}
