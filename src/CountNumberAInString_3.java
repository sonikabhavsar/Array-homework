import java.util.Scanner;
// Program to find 'a' element in enter string
public class CountNumberAInString_3 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        //Ask user to enter the  string
        System.out.println("Enter the string:");
        String string =scanner.nextLine();

        int count =0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a'){
                count++;
            }

        }
        System.out.println("Total number of 'a' in the string: " + count);
    }
}
