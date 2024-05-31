package Array;
/*
    20.WAJP to remove an element at certain position of an array.
 */
public class Question20 {
    public static int []  removeAnElement(int a[],int index){
        int n = a.length;
        int b[] =new int[n-1];

        for (int i =0;i<n;i++){
            if (i<index){
                b[i]=a[i];
            }
            else if (i>index) {
                b[i-1] = a[i];

            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] ={13,14,14,45,67,99};
        System.out.print("Present array : ");
        for (int x: a){
            System.out.print(x+" ");
        }
        int[] p = removeAnElement(a,2);

        System.out.print("\nArray after removing an element : ");
        for (int x:p){
            System.out.print(x+" ");
        }

    }
}
