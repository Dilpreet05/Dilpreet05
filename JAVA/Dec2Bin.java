import java.util.Scanner;

public class Dec2Bin
{
    public static void main (String[] args)
    {
        System.out.println("Welcome to Decimal Number to Binary Converter");
        System.out.println("");

        Scanner s = new Scanner(System.in);
        while (true)
        {
            String binary = "";
            System.out.print("Enter a decimal number (-1 to end)");
            int input = s.nextInt();

            if (input <= 0)
            {
                System.out.println("Goodbye!");
                break;
            }

            int result = input;

            while (result > 0)
            {
                result = result / 2;
                binary = (result % 2) + binary;
            }
            System.out.println("Binary number is " + binary);

            s.close();

        }
    }
}