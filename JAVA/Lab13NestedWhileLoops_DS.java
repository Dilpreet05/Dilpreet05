// ****Student Number****
// Student Name: Dilpreet Singh
// Date: 2/13/21
// File Name: Lab13NestedWhileLoops_DS.java
// Description - making a box of * using user inputed mesurements 
// *******************
import java.util.Scanner;

public class Lab13NestedWhileLoops_DS {
        public static void main (String[] args) {
                
                //***** Initalizing and Declaring ***** //
                        Scanner scan = new Scanner(System.in);
                        //* first Sequence
                        int countA1 = 0, countA2;               // Integers to count for Box A
                        
                        //* Second Sequence 
                        int countB1 = 0, countB2;               // Integers to count for Box B
                        int width, height;
                        
                        //* Last Sequence
                        int countC1 = 1, countC2;               // Integers to count for Box C
                        int heightWidth;
                //************************************* //
                //
                //***** Box A ***** //
                        
                        while (countA1 < 6) {                   // while loop that loops 6 times, this spesific while loop adds the rows of the 11x6 box that is first outputed 
                                
                                countA2 = 0;                    // resets the value of countA2 for the rows to be printed out
                                
                                while (countA2 < 11) {          // prints the rows in sequence only using 1 asterisk
                                        System.out.print("*");
                                        countA2++;              // adds to the value of countA2 so the nested loop that operates the printing of the loops ends
                                }
                                
                                System.out.print("\n");         // adds the rows via a next line escape sequence 
                                countA1++;                      // adds to the value of countA1 so that the original while loop ends after 6 passes
                                
                        }
                        
                //***************** //
                //
                //***** Box B ***** //
                        
                        System.out.print("\nPlease enter a width value from 1 to 25 : ");       // first prompt, asks user for the width of the object
                                width=scan.nextInt();
                                
                        System.out.print("Please enter a height value from 1 to 11 : ");        // second prompt, asks user for the height of the object
                                height=scan.nextInt();
                                
                                
                        while (countB1 < height) {              // while loop that loops the amont of times that the height integer is given by the user
                        
                                countB2 = 0;                    // resets the countB2 for the rows to be printed
                        
                                while (countB2 < width) {       //  prints the rows left to right using one asterisk, prints out the value of width
                                
                                        System.out.print("*");
                                        countB2++;              // adds to countB2 so that the loop ends after countB2 is no longer less then the inputed width
                                        
                                }
                                System.out.print("\n");         // adds rows 
                                countB1++;                      // adds to the value of countB1 so the original loop ends at the value of height
                                
                        }
                        
                //***************** //
                //
                //***** Box C ***** //
                        
                        System.out.print("\nPlease enter a hight or width value from 1 to 9 : ");       // prompt, asks user for the height or width of the triangle, within the values of 1 and 9 inclusive 
                                heightWidth=scan.nextInt();
                                
                        
                        while (countC1 <= heightWidth) {        // while loop that loops the amont of heightWidth
                        
                                countC2 = 0;                    // resets the value of countC2
                                
                                while (countC2 < countC1) {     // loops if countC2 is less then countC1
                                
                                        System.out.print("*");
                                        countC2++;              // adds to the value of countC2 so the asterisks print in a triangular pattern
                                        
                                }
                                
                                System.out.print("\n");         // adds new rows for the triangle to form
                                countC1++;                      // adds to the value of countC1
                                
                        }
                        
                //***************** //

                        scan.close();
                        
                        
        }
}