import java.util.Arrays;
import java.util.Scanner;
 // Program to find two array are equal or not
public class EqualityOfTwoArray_1 {

    
    public static void main (String[] args)
    {

   //defining array to compare
        int[] array1 = new int[] {'a', 'b', 'c', 'd', 'e'};
        int[] array2 = new int[] {'a', 'b', 'c', 'd', 'e'};
    //comparing two arrays using equals() method
        if (Arrays.equals(array1, array2))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}
