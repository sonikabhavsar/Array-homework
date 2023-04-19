import java.util.Scanner;

public class ReverseNumbers_9 {
    // Program to find to  enter number come in revers

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter any 5-digit number
        System.out.println("enter the 5 digit numbers");
        int number = scanner.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}


