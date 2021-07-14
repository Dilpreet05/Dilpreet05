// ***** 684344 ****** //
// Student Name: Dilpreet Singh 
// Date: 1/29/21
// File Name: Lab12aDecOct_DS
// Description - Converting base ten - octal using while loops.
// ******************* //
import java.util.Scanner;
//
public class Lab12aDecOct_DS {
        public static void main (String[] args){
        
                //***** Initalizing and Declaring ***** //
                                
                        Scanner scan = new Scanner(System.in);          // New Scanner object named scan
                        int octNum = 4096, decNum;                      // declaring octNum and initalizing decNum
                
                //************************************* //
                //
                //***** User Input ***** //
                
                        System.out.print("Enter a base ten number (0 - 32,768): ");
                                decNum = scan.nextInt();                                                        // Scanner is getting user Input for a base ten number
                                
                //********************** //
                //
                //***** First Sequence ***** //
                
                        if (decNum < 0) {                                                                       // checking if the user inputed base ten number is not convertable, makes sure that there arent double prompts.
                                System.out.print("This is not an octal number. ");
                        }
                
                //************************** //
                //
                //***** Seccond Sequence ***** //
                
                        if (decNum >= 0) {                                                                                      // checking if the user inputed base ten number is convertable,  makes sure that there arent double prompts.
                                System.out.print("You entered decimal number " + decNum + ", in octal the number is ");
                        
                        
                //**************************** //
                //
                //***** Number Conversions With While Loops ***** //
                                
                        while (octNum > 0) {                                                    // while loop that repeats the convertion to make it loop.
                                
                                 if (decNum / octNum == 0) {                                     // a chain of if - else - if operators that uses basic division to convert the base ten number into a octal number.
                                         System.out.print("0");
                                         
                                 }else if (decNum / octNum == 1) {
                                         System.out.print("1");
                                         decNum=decNum-octNum;
                                         
                                 }else if (decNum / octNum == 2) {
                                         System.out.print("2");
                                         decNum=decNum-(octNum*2);
                                         
                                 }else if (decNum / octNum == 3) {
                                         System.out.print("3");
                                         decNum=decNum-(octNum*3);
                                         
                                 }else if (decNum / octNum == 4) {
                                         System.out.print("4");
                                         decNum=decNum-(octNum*4);
                                         
                                 }else if (decNum / octNum == 5) {
                                         System.out.print("5");
                                         decNum=decNum-(octNum*5);
                                         
                                 }else if (decNum / octNum == 6) {
                                         System.out.print("6");
                                         decNum=decNum-(octNum*6);
                                         
                                 }else if (decNum / octNum == 7) {
                                         System.out.print("7");
                                         decNum=decNum-(octNum*7);
                                         
                                 }


                        octNum=octNum/8;                                                        // a operation that divides octNum by 8
                        }
                        
                        
                //*********************************************** //

                scan.close();
                
                        }
        }
}