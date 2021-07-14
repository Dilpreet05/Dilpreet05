//******684344*******
// Student Name: Dilpreet Singh
// Date: 03/04/2021
// File Name: Lab15Digits_DS.java
// Description - Determine if a number is odd even or neither, use a loop to break a number into its places, find the sum of the digits of a number, count how many times a given digit appears in the number.
// *******************
import java.util.Scanner;

public class Lab15Digits_DS {
        public static void main (String[] args) {
                
                //***** Initalizing and Declaring ***** //
                        Scanner scan = new Scanner(System.in);
                        
                        //* First Sequence
                        int inBoxA;                             // Integers to count for Box A
                        
                        //* Second Sequence 
                        int inBoxB, countB1 = 1;                // Integers to count for Box B
                        int digitB = 0;
                        
                        //* Third Sequence
                        int inBoxC;                // Integers to count for Box C
                        int digitC = 0, sumC = 0;
                                                                
                        //* Fourth Sequence
                        int inBoxD, inBoxD2;                    // Integers to count for Box D
                        int digitD = 0, countD1 = 0;
                        
                //************************************* //
                //        
                //***** Box A ***** //        
                
                        System.out.print("Enter a number: ");                   // asks for user input
                                inBoxA = scan.nextInt();                        // saves user input in inBoxA
        
                        
                        
                        System.out.print("The number " + inBoxA + " is ");      // prints prompt
                        
                        
                        
                                if (inBoxA == 0) {                              // if-else-if statement, determines the number even, odd, or neither
                                        
                                        System.out.print("neither even nor odd");
                                        
                                }else if (inBoxA % 2 == 0) {
                                        
                                        System.out.print("an even number.");
                                        
                                }else if (inBoxA % 2 != 0) {
                                        
                                        System.out.print("an odd number.");
                                        
                                }
                                
                //***************** // 
                //
                //***** Box B ***** //
                        
                        System.out.print("\n\nEnter a number: ");               // asks for user input
                                inBoxB = scan.nextInt();                        // saves user input in inBoxB
                                

                                if (inBoxB > 0) {                               // if-else statement checks user input for negative or positive number
                                                                                        
                                                while (inBoxB > 0) {            // loop calculates the place of a digit
                                                        
                                                        digitB = inBoxB % 10;    // saves digit as the modulus of user input
                                                        
                                                        System.out.println("The number in the " + countB1 + "'s place is " + digitB);    // output
                                                                inBoxB/=10;     // saves value of inBoxB to itself divided by 10
                                                                countB1*=10;    // saves value of countB1 to itself times 10
                                                
                                                
                                                
                                                
                                                }                              
                                                  
                                }else{  // only goes if number is negative
                                
                                        inBoxB*=-1;                             // multiplies user input by -1 so the number becomes positive
                                
                                                while (inBoxB > 0) {            // loop calculates the place of a digit
                                                        
                                                        digitB = inBoxB % 10;    // saves digit as the modulus of user input
                                                        
                                                        System.out.println("The number in the " + countB1 + "'s place is " + digitB + ".");    // output
                                                                inBoxB/=10;     // saves value of inBoxB to itself divided by 10
                                                                countB1*=10;    // saves value of countB1 to itself times 10
                                                
                                                
                                                
                                                
                                                }
                                                
                        }
                                                
                //***************** //
                //
                //***** Box C ***** //
                
                        
                        
                        System.out.print("\nEnter a number: ");       // asks for user input
                                inBoxC = scan.nextInt();                // saves user input
                                
                        System.out.print("The sum of the digits of the number " + inBoxC + " is ");    // prints prompt
                                
                                if (inBoxC > 0) {    //checks if inputed number is positive or negative
                                                   
                                        
                                                while (inBoxC > 0) {            // Adds the digits together 
                                                
                                                        digitC = inBoxC % 10;
                                                        
                                                        sumC+=digitC;
                                                
                                                        inBoxC/=10;
                                                        
                                                        
                                                }
                                }else{
                                
                                        inBoxC*=-1;     // makes a negative inputed number into a positive
                                        
                                                while (inBoxC > 0) {            // Adds the digits together 
                                                
                                                        digitC = inBoxC % 10;
                                                        
                                                        sumC+=digitC;
                                                
                                                        inBoxC/=10;
                                                        
                                                        
                                                }
                                
                                
                                
                                }
                                
                                System.out.print(sumC + ".");
                                
                //***************** //
                //
                //***** Box D ***** //
                        
                        System.out.print("\n\nEnter a number: ");       // asks user input
                                inBoxD = scan.nextInt();
                                int tempD1 = inBoxD;                    // copies value of inBoxD into tempD1
                                
                        System.out.print("Enter a digit: ");            // asks user input
                                inBoxD2 = scan.nextInt();
                                int tempD2 = inBoxD2;                   // copies value of inBoxD2 into tempD2
                                
                        if (inBoxD > 0) {                               // checks if input is negative
                        
                                while (tempD1 > 0) {                    // checks how many times a digit appears in a number
                                
                                        digitD = tempD1 % 10;
                                        tempD1/=10;
                                        
                                        if (tempD2 == digitD) {
                                                
                                                countD1++;
                                                
                                        }
                                                                
                                }
                                
                        } else {
                                
                                tempD1*=-1;                             // makes negative input into positive
                                while (tempD1 > 0) {                    // checks how many times a digit appears in a number
                                        
                                        
                                        digitD = tempD1 % 10;
                                        tempD1/=10;
                                        
                                        if (tempD2 == digitD) {
                                                
                                                countD1++;
                                                
                                        }
                                                                
                                }
                        }
                        
                        
                                                        
                        System.out.print("The number " + inBoxD + " contains " + countD1 + " digits that are " + inBoxD2);
                                
                                
                                
                                
                //***************** //

                scan.close();
        }
}