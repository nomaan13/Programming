package Array;
/*
    16.WAJP to print Biggest and Second-Biggest element of the array
 */
public class Question16 {
    public static void biggestAndSecondBiggest(int[]a){
        int n = a.length-1;
        int biggest =a[0] ;
        int secondBiggest=a[1];
        for (int i=0;i<=n ; i++){
            if (a[i]>biggest){
                secondBiggest=biggest;
                biggest=a[i];


            } else if (a[i]>secondBiggest &&  a[i]!=biggest ) {
                secondBiggest=a[i];

            }
        }
        System.out.println("Biggest number is: " + biggest);
        System.out.println("SecondBiggest number is: " + secondBiggest);
    }

    public static void main(String[] args) {
        int a[]={21,20,25,20,80,50,90,70,100};
        biggestAndSecondBiggest(a);
    }
}
