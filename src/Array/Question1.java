package Array;
import java.util.Scanner;

/*
    1.Take one array and access all the element which is available at odd index of the array
 */

public class Question1 {



    public static void main(String[] args) {

        int n[] = {55,80,70,10,60,20};
        for (int i= 0;i<n.length;i++){
            if (i%2!=1)
            System.out.println(n[i]);
        }


    }}
