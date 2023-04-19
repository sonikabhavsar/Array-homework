import java.util.Arrays;
import java.util.Scanner;
// Program to find common element in string value
public class CommonElements_5 {

    public static void main(String[] args)
    {
//array 1 value
        int[] array1 = {10,15,20,25,30,35,40 };
//array 2 value
        int[] array2 = {10,17,23,25,32,45,50 };

        System.out.println("Array1 : "+ Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {

                    System.out.println("Common element is : "+(array1[i]));
                }
            }
        }

    }
}
