package string;
/*
    Q10. WAJP to compare two strings in java whether it is same or not .
 */
public class CompareString {

    public static boolean compareStrings(String  a , String b){

        int n = a.length();

        for (int i = 0;i<n;i++){
            if (a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }return true;

    }

    public static void main(String[] args) {
        String a = "Good Morning";
        String b = "Good Morning";

        if (compareStrings(a,b) ){
            System.out.println("Both the strings are same");
        }
        else
            System.out.println("Both strings are not same");
    }
}
