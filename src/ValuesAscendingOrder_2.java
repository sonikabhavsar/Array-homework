import java.util.Arrays;
import java.util.Scanner;
// Program to find added value  come in ascending order to use array
public class ValuesAscendingOrder_2 {


    public static void main(String[] args) {
        //entered value
        int[] a = {10, 25,20,5,9,35};


        for (int i =0; i < a.length; i++){
            Arrays.sort(a);
            System.out.println(a[i]);
        }

    }
}
