package string;

public class PalindromeString {
    public static void isPalindromeString(String a){
        int n = a.length()-1;
        String revStr = "";

        for (int i=n;i>=0;i--){
            revStr = revStr + a.charAt(i);
        }

        if (revStr.equals(a)){
            System.out.println(revStr+" is a palindrome string of " + a);
        }
        else System.out.println("it is not a palindrome string");

    }

    public static void main(String[] args) {
        String a = "hannah baker";
        isPalindromeString(a);
    }
}

