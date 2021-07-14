// ****** 684344 *****
// Student Name: Dilpreet Singh 
// Date 2/17/21 
// File Name: Lab14NestedWhileLoops2_DS 
// Description - using nested loops and getting user input to make the shell/border of a rectangle, a spaced out rectangle, a wavy rectangle.
// *******************
import java.util.Scanner;

public class Lab14NestedWhileLoops2_DS {
        public static void main (String[] args) {
                
                //***** Initalizing and Declaring ***** //
                Scanner scan = new Scanner(System.in);
                //* first box 
                int countA1 = 0;        // integers for counting box a
                int widthA, heightA;    // integers for width, and height box a
                
                //* second box
                int countB1 = 0;        // integers for countng box b
                int widthB, heightB;    // integers for width and height box b
                
                //* third box
                int countC1 = 0;        // integers for counting box c
                int widthC, heightC;    // integers for width and height box c
                
                //************************************* //
                //
                //***** Box A ***** //
                
                        System.out.print("Please enter a width value from 4 to 25 : ");         // asking user for width value
                                widthA = scan.nextInt();                                        // saving user's width value
                                
                        System.out.print("Please enter a height value from 4 to 11 : ");        // asking user for height value
                                heightA = scan.nextInt();                                       // saving user's height value
                                heightA-=2;                                                     // subtracts height by 2 for box calculation 
                        
                        
                         while (countA1 < heightA) {                                    // while loop that procedees if countA1 is less then height
                                  
                                 int countA2 = 0;                                       // declares countA2 for other use
                                //  int countA3 = 0;                                       // declares countA3 for other use
                                 int countA4 = 0;                                       // declares countA4 for other use
  
                                 
                                 
                                   if (countA1 == 0) {                                  // if countA1 is equal to 0 the statement will proceed
                                          
                                          while (countA4 < widthA) {                    // while loop that prints the top measurment of the shell
                                                  System.out.print("*");                // prints asterisks one at a time
                                                  countA4++;                            // adds to the value of countA4 so the while loop is finite
                                          }
                                          
                                          System.out.print("\n");                       // adds a row
                                          
                                   }
                                 

                                 
                                 
                        
                                 
                                 while (countA2 < widthA) {                             // does the coloumns for box a, while loops that proceeds if countA2 is less than width
                                        
                                        if (countA2 == 0 || countA2 == widthA - 1){     // if else statement that prints asterisks or spaces, sucsessfully making the sides of the border/shell pattern
                                                System.out.print("*");
                                        }else{
                                                System.out.print(" ");
                                        }
                                        
                                    countA2++;                                          // adds to the value of countA2 so the loop is finite
                                               
                                                                         
                                 }
                                 
                                 
                                 
                                 
                                 
                                 System.out.print("\n");                                // adds a row
                                 countA1++;                                             // adds to the value of countA1 so the original loop is finite
                                 
                                 
                                 
                                   if (countA1 == heightA) {                            // if countA1 is equal to user inputed height the statement will proceed
                                          
                                          while (countA4 < widthA) {                    // while loop that prints the bottom measurement of the shell
                                                  System.out.print("*");                // prints an asterisk
                                                  countA4++;                            // adds to the value of countA4 so the loop is finite
                                          }
                                          
                                          System.out.print("\n");                       // adds a row
                                          
                                   }                                                 
   
                                 
                         }                
                
                
                
                
                
                //***************** //
                //
                //***** Box B ***** //
        
                                System.out.print("\nPlease enter a width value from 10 to 19 : ");      // asking user for width value
                                        widthB = scan.nextInt();                                        // saving user's width value
                                        
                                System.out.print("Please enter a height value from 4 to 11 : ");        // asking user for height value
                                        heightB = scan.nextInt();                                       // saving user's height value
                                
                                
                                
                                
                                
                                while (countB1 < heightB) {                             // while loop that proceeds if countB1 is less than height
                                        
                                        int countB2 = 0;                                // declares countB2 for future use
                                        
                                        
                                        
                                        
                                                while (countB2 < widthB) {              // while loop that procees if coutnB2 is less than width
                                                        
                                                        if (countB2 % 2 == 0) {         // if countB2 / 2 and the remainder is 0 it will print an asterisk, else it will print a space
                                                        
                                                                System.out.print("*");
                                                                
                                                        }else{
                                                        
                                                                System.out.print(" ");
                                                                
                                                        }
                                                        
                                                    countB2++;                          // adds to countB2 for a finite loop
                                                        
                                                }
   
                                    System.out.print("\n");                             // adds a row
                                    countB1++;                                          // adds to the value of countB1 for a finite loop
                                        
                                        
                                }
                //***************** //
                //
                //***** Box C ***** //
                
                                System.out.print("\nlease enter a width value from 10 to 19 : ");       // asking user for width value
                                        widthC = scan.nextInt();                                        // saving user's width value
                                        
                                System.out.print("Please enter a height value from 4 to 11 : ");        // asking user for height value
                                        heightC = scan.nextInt();                                       // saving user's height value
                                        
                                        
                                        
                                        
                                        
                                while (countC1 < heightC) {                             // while loop that proceeds if countC1 is less than height
                                        
                                        int countC2 = 0;                                // declares countC2 for future use
                                        
                                        
                                        if (countC1 % 2 == 0) {                         // if countC1 / 2 and the remainder is 0 the first statement will proceed, else the second statement will proceed
                                        
                                                while (countC2 < widthC) {              // while loop that proceeds if countC2 is less than width
                                                        
                                                        if (countC2 % 2 == 0) {         // if statement that calculates if it should print a asterisk or a space
                                                        
                                                                System.out.print("*");
                                                                
                                                        }else{
                                                        
                                                                System.out.print(" ");
                                                                
                                                        }
                                                        
                                                    countC2++;                          // adds to countC2 for a finite loop
                                                        
                                                }
                                                
                                        }else{
                                        
                                                while (countC2 < widthC) {              // while loop that proceeds if countC2 is less than width
                                                        
                                                        if (countC2 % 2 == 0) {         // if countC2 / 2 and the remainder is 0 it will print a space else it will print an asterisk 
                                                        
                                                                System.out.print(" ");
                                                                
                                                        }else{
                                                        
                                                                System.out.print("*");
                                                                
                                                        }
                                                        
                                                    countC2++;                          // adds to the value of countC2 for a finite loop.
                                                        
                                                }
                                        
                                        }
                                        
                                        
                                        
                                        
                                    System.out.print("\n");                             // adds a row
                                    countC1++;                                          // adds to countC1 for a finite loop
                                        
                                        
                                }

                
                
                
                //***************** //

                                scan.close();   
     
        }                
}