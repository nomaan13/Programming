package Array;
/*
    WAJP to print the sum and average of all the elements of array.
 */

public class Question5 {
    public static void main(String[] args) {
        int a []={10,20,50,40,100,30,50};
        int sum =0;
        int avg = 0;
        double len = a.length;

        for (int i=0;i<a.length;i++){
            sum = sum + a[i] ;

        }
        System.out.println("Total sum of elements are: "+sum);
        System.out.println("Average of given elements of array is : "+ sum/len);
    }
}
