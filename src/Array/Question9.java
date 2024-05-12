package Array;
/*
    9.WAJP to reverse and print each element of the array.
 */
public class Question9 {
    public static void main(String[] args) {
int arr[]={23,33,2,1,8,2,56,86};
        System.out.println("Without reverse  : ");
        for (int x :arr ){
            System.out.print(x+" ");
        }
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("\nWith reverse  : ");
        for (int x:arr) {
            System.out.print(x + "  ");
        }}}
