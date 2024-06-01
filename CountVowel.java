package string;
/*
    Q6. WAJP to take user intput and count all the vowel present in the String.
 */

import java.util.Scanner;

public class CountVowel {

    public static int countVowel(String s ){
        int count = 0;
        int n = s.length();

        for (int i =0;i<n;i++){
            char c = s.charAt(i);
            if (c=='a'|| c=='e'||c=='i'|| c=='o'|| c=='u'|| c=='A'||c=='E'|| c=='I'|| c=='O'||c=='U'){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String Here: ");
        String s = sc.nextLine();
        System.out.print("Total number of vowels in  '" + s + "' is : ");
        System.out.println(countVowel(s));
    }
}
