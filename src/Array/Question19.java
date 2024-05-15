package Array;
/*
        18.WAJP to insert an element at certain position of the array.
 */
public class Question19 {

    public static int [] insertInto(int a[],int index,int element){
        int n = a.length-1;
        for (int i=n;i>index;i--){
            a[i]=a[i-1];

        }
        a[index]=element;
        return a;
    }

    public static void main(String[] args) {
        int a[]={25,66,44,15,25,32};

        System.out.println("Present array is : ");
        for (int x:a){
            System.out.print(x+" ");
        }
        insertInto(a,2,55);
        System.out.println("new array is ");
        for (int x: a){
            System.out.print(x+" ");
        }
            }

}
