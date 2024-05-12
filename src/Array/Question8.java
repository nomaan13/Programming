package Array;
/*
    WAJP to print and count all the element of array which is a prime number .
 */
public class Question8 {
    public static boolean isPrime(int n ){
        if (n <= 1) {
        for (int i =2;i<n/2;i++){
            if (n%i==0){
                return false;}

        }return true;
    }
        return false;
    }
    public static void main(String[] args) {
       int a[]={54,55,12,1,2,3,89,13};
       int count =0;


        System.out.println("All prime number elements are: ");
       for (int i =0;i<a.length;i++) {
           if (isPrime(a[i]) == true) {
               System.out.print(a[i] +" ");
               count++;
           }
       }
        System.out.println("\n"+count);
    }
}
