package Array;
/*

    17.WAJP to print smallest and second-smallest element of an array.
 */
public class Question17 {
    public static void smallestAndSecondSmallest(int a[]){
        int n = a.length-1;
        int smallest =a[0];
        int secondSmallest=a[1];
        for (int i =0;i<=n;i++){
            if (a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];

            } else if (a[i]!=smallest && a[i]<secondSmallest) {
                secondSmallest=a[i];
}
        } System.out.println("Smallest number is : " +smallest);
        System.out.println("Second-Smallest number is : " +secondSmallest);

    }

    public static void main(String[] args) {
        int a[] ={50,55,45,10,12,20,30,8,-1,0};
        smallestAndSecondSmallest(a);
    }
}
