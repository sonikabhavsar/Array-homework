import java.util.Arrays;
import java.util.HashSet;

//Program to find the common string use in array
public class CommonStringArray_7 {
    public static void main(String[] args) {
//Enter the string elements
        String[] arr1 = {"Red", "Blue", "green", "Yellow", "Orange", "Pink"};
        String[] arr2 = {"Sunday", "Flower", "Blue", "Black", "White", "Book"};

        System.out.println("Array1:" + Arrays.toString(arr1));
        System.out.println("Array2:" + Arrays.toString(arr2));
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);

                }

            }
        }
        System.out.println("Common Array : " +set  );
    }
}
