package Array;
/*
    21. WAJP to shift all o's to left and all 1's to the right.
 */
public class Question21 {
    public static int[] shift(int[] a) {
        int b[] = new int[a.length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                b[k++] = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                b[k++] = a[i];
            }

        }

        return b;
    }
        public static void main (String[]args){
            int a[] = {0, 1, 1, 0, 0, 1, 0,1,1,0,0,1,0,1,0};
            System.out.println("Before shifting o and 1 : ");
            for (int x : a) {
                System.out.print(x + " ");
            }

            System.out.println("\nAfter shifting o and 1 : ");
            int[] b = shift(a);
            for (int x : b) {
                System.out.print(x + " ");
            }

        }
    }
