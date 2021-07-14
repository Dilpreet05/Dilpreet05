// ****Student Number****
// Student Name: Dilpreet Singh
// Date: 4/8/21
// File Name: Lab19MultiplicationTable_DS.java
// Description - make a multiplication table using for loops.
// *******************
import java.util.Scanner; // import scanner.

public class Lab19MultiplicationTable_DS {
        public static void main (String[] args){
        
                
                Scanner scan = new Scanner(System.in);  // declare scanner.
                
                
                
                System.out.print("I will create a multiplication table for you.\n\n");  // first prompt prints a blank line inbetween this and next line of text.
                
                
                
                
                
                System.out.print("How many columns would you like it to have? ");       // asks user to input a column value. saves value in columnIn
                int columnIn = scan.nextInt();
                
                
                
                
                System.out.print("How many rows would you like it to have? ");          // asks user to input a row value. saves value in rowIn
                int rowIn = scan.nextInt();
                
                
                
                
                System.out.print("\nHere is a " + columnIn + " by " + rowIn + " multiplication table: \n\n"); // makes a blank space inbetween the last line of text and this line of text.
                
                
                
                
                        for (int row = 1; row <= rowIn; row++) {                        // calculates the rows
      
                                for (int column = 1; column <= columnIn; column++ ) {   // calculates the columns
                                
                                        
                                        System.out.print(column*row + "\t");            // prints the number in the table
                                
                                
                                }
                                
                                System.out.println();                                   // adds rows
                                
                        }

                        scan.close();
        }
}