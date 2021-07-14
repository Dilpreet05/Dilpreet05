//******684344**************
//
//*Name: Dilpreet
//*Date: 11/13/2020
//*Project Title: Lab06IntCalculator.java 
//*Description: Lab 06 assigned by Mr. Payne
//
//**************************
import java.util.Scanner;

public class Lab06IntCalculator {
        public static void main(String[] args){
                
                Scanner scan = new Scanner(System.in);
                
                System.out.print("--- Integer Calculator ---");
        
                System.out.print("\n\nEnter an integer: ");
                        int Int1 = scan.nextInt();
        
                System.out.print("Enter another integer: ");
                        int Int2 = scan.nextInt();
                
                System.out.println("\nYou entered the numbers " + Int1 + " and " + Int2);
                System.out.println(Int1 + " + " + Int2 + " = " + (Int1 + Int2));
                System.out.println(Int1 + " - " + Int2 + " = " + (Int1 - Int2));
                System.out.println(Int1 + " * " + Int2 + " = " + (Int1 * Int2));
                System.out.println(Int1 + " / " + Int2 + " = " + (Int1 / Int2));
                System.out.println(Int1 + " % " + Int2 + " = " + (Int1 % Int2));
                scan.close();
        }
}
