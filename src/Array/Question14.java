package Array;
/*
    14.WAJP to print all the element of the array whose frequency are odd.
 */
public class Question14 {
    public static void oddFrequencyElement(int a[]){
        int n = a.length-1;
        for (int i=0;i<=n;i++){
            int count =1;
            for (int j=i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    j--;
                    n--;
                }
            }
            if (count%2!=0){
                System.out.println("Element with odd numbers of time apperence are: " + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int a []={12,21,21,21,3,12};
        oddFrequencyElement(a);
    }
}
