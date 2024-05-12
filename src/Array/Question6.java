package Array;
/*
    WAJP to print the biggest element and the smallest element and their difference in the array.
 */
public class Question6 {
    public static void main(String[] args) {


        int a[] = {44, 41, 6, 78, 12, 56, 80, 69, 34, 70};
        int biggestElement = Integer.MIN_VALUE;
        int smallestEstelement = Integer.MAX_VALUE;

        for (int i = 1; i < a.length;i++){

            if (a[i]>biggestElement){
                biggestElement = a[i];
            }
            if (a[i]!=biggestElement && a[i]<smallestEstelement){
                smallestEstelement=a[i];
            }


            }
        System.out.println(biggestElement);
        System.out.println(smallestEstelement);
    }

}