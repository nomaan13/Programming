package string;

public class ReverseString {
    public static void reverseString(String a ){
        int n = a.length()-1;
        String revString="";

        for (int i=n;i>=0;i--){
            revString = revString + a.charAt(i);
        }

        System.out.println("Reverse String is : " + revString);
    }

    public static void main(String[] args) {
        String a = " Have a nice day sir ";

        reverseString(a);
    }
}
