package Array;

/*
    Take one array and access all the even element of array
 */
public class Question2 {
    public static void main(String[] args) {
        int a [] = {1,23,44,22,10,70,66};
        for (int i =0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
