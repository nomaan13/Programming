package Array;
/*
    For given array of String print and count all the String which has even numbers of characters.
 */
public class Question7 {
    public static void main(String[] args) {
        String s[] = {"Mohan", "jlo","Good","London","Zagreb"};
        int count=0;
        for (int i =0; i<s.length;i++){
            String st = s[i];
            if (st.length()%2==0){
                System.out.println(s[i]);
                count++;

            }
        }
        System.out.println("Total number of even digit Characters are: " + count);

    }

}
