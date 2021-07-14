// ****684344*********
// Student Name: Dilpreet
// Date: 07/13/2021
// File Name: Lab12BinDec_DS.java
// Description - binary to decimal converter using while loops
// *******************
import java.util.Scanner;
public class Exercise22 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);    // scanner
                long binaryNumber, decimalNumber = 0, j = 1, remainder; // numbers
                System.out.print("Input a binary number: ");
                binaryNumber = sc.nextLong();   // gets input

                while (binaryNumber != 0) // does the conversion 
                {
                        remainder = binaryNumber % 10; // finds the modulus of input % 10
                        decimalNumber = decimalNumber + remainder * j;
                        j = j * 2;
                        binaryNumber = binaryNumber / 10;
                }
                System.out.println("Decimal Number: " + decimalNumber);
        }
}
