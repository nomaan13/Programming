package Array;
/*
    WAJP to print and count all the element of array which are divisible by 7.
 */
public class Question4 {
    public static void main(String[] args) {
        int a[] = {12,44,49,77,84,90,17,34,21,22,91};
        int count = 0;
        for (int i =0;i< a.length;i++){
            if (a[i]%7==0){
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println("Total count of elements which are divisible by 7 are: " + count);
    }
}
