// ****684344*********
// Student Name: Dilpreet
// Date: 01/22/21
// File Name: Lab12aDecBin_DS.java
// Description - Decimal - Binary converter using while loops
// *******************
import java.util.Scanner;               // importing java util scanner for user input //

public class Lab12aDecBin_DS{                           // name of the program //
        public static void main (String[] args){        
        
                //******************* //
                
                Scanner scan = new Scanner(System.in);     // declaring the scanner with the name "scan" //
                int decNum, binNum = 1024, input;       // initializing integers decNum and input, and declaring integer binNum //
                
                //******************* // 
                
                
                
                System.out.print("Enter a base 10 number (1-2047): ");
                        input = scan.nextInt();                                   
                        decNum = input;
                        
                
//                         if (decNum <= 0 ){                                                 
//                                 System.out.print("This is not a decimal number.");      
//                         }
                
               
                        System.out.print("\nYou entered decimal number " + input + ", in binary the number is ");        
               
               
                        while (binNum > 0){                                     
                
                        
                                if (decNum / binNum > 0) {              
                                        System.out.print("1");
                                        decNum= decNum-binNum;
                                }else{
                                        System.out.print("0");
                                }                                       
                        
                                binNum=binNum/2;         
                                scan.close();               
                        
                        }  
        }
}