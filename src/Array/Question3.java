package Array;
/*
    WAJP to access and count all 3-digit numbers in array
 */
public class Question3 {
    public static void main(String[] args) {
        int a [] = {10,999,100,50,800,745,55,230,111};

        int totalCount=0;
        for (int i =0;i<a.length;i++){
            int p =a[i];
            int count=0;
            while (p>0){

                int rem = p%10;
                count++;
                p/=10;

                if (count==3){
                    System.out.println(a[i]);
                    totalCount++;
                }

            }
        }
        System.out.println("Total number of three digit numbers are: "+ totalCount);
    }
}
