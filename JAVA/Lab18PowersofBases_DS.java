// ******684344******
// Student Name: Dilpreet Singh
// Date: 03/25/2021
// File Name: Lab18PowersofBases_DS.java
// Description - a program that finds the base to each power from 0 to the desired power using for loops.
// *******************
import java.util.Scanner;       // initialize scanner

public class Lab18PowersofBases_DS{
        public static void main(String[] args){
                
                Scanner scan = new Scanner(System.in);  // declare scanner
                
                System.out.print("Enter a base number from 2-12: ");    // prints prompt that asks users for input on the base number stores value in baseIn
                int baseIn = scan.nextInt();
                
                System.out.print("Enter a power number from 2-10: ");   // prints prompt that asks users for input on the power number stores value in powerIn
                int powerIn = scan.nextInt();

                        
                        int answer = 1;                 // used for finding the power of inputed numbers and printing them
                        int powerCurrent = 0;           // used as a integer that assists in printing the prompt 
                        
                        for (int loop = 0; loop <= powerIn; loop++) {   // for loop finds the power of the inputed number in sequence from 0 to the inputed power
                                
                                System.out.print(baseIn + "^" + powerCurrent + " = " + answer + "\n");
                                answer*=baseIn;
                                powerCurrent++;
                                
                        }
                        scan.close();
        }       
}