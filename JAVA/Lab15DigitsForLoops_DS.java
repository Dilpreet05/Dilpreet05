//******684344*******
// Student Name: Dilpreet Singh
// Date: 03/04/2021
// File Name: Lab15DigitsForLoops_DS.java
// Description - Determine if a number is odd even or neither, use a loop to break a number into its places, find the sum of the digits of a number, count how many times a given digit appears in the number.
// *******************
import java.util.Scanner;

public class Lab15DigitsForLoops_DS {
        public static void main (String[] args) {
                
                //***** Initalizing and Declaring ***** //
                        Scanner  input = new Scanner(System.in);
                        
                        //* First Sequence
                        int inBoxA;                             
                        
                        //* Second Sequence 
                        int inBoxB, countB1 = 1;                
                        int digitB = 0;
                        
                        //* Third Sequence
                        int inBoxC;                
                        int digitC = 0, sumC = 0;
                                                                
                        //* Fourth Sequence
                        int inBoxD, inBoxD2;                    
                        int digitD = 0, countD1 = 0;
                        
                //************************************* //
                //        
                //***** Box A ***** //        
                
                        System.out.print("Enter a number: ");                  
                                inBoxA =  input.nextInt();                        
        
                        
                        
                        System.out.print("The number " + inBoxA + " is ");      
                        
                        
                        
                                if (inBoxA == 0) {                              
                                        
                                        System.out.print("neither even nor odd");
                                        
                                }else if (inBoxA % 2 == 0) {
                                        
                                        System.out.print("an even number.");
                                        
                                }else if (inBoxA % 2 != 0) {
                                        
                                        System.out.print("an odd number.");
                                        
                                }
                                
                //***************** // 
                //
                //***** Box B ***** //
                        
                        System.out.print("\n\nEnter a number: ");               
                                inBoxB =  input.nextInt();                        
                                
                                
                                for (int tempB = inBoxB; tempB > 0; tempB/=10) {
                                
                                        digitB = tempB % 10;        
                                        System.out.println("The number in the " + countB1 + "'s place is " + digitB);
                                        countB1*=10;
                                        
                                } 
                                


                                                
                //***************** //
                //
                //***** Box C ***** //
                
                
                        
                        
                        System.out.print("\nEnter a number: ");       
                                inBoxC =  input.nextInt();                
                                
                        System.out.print("The sum of the digits of the number " + inBoxC + " is ");    
                        
                        
                                for (int tempC = inBoxC; tempC > 0; tempC/=10) {
                                        
                                        digitC = tempC  % 10;
                                        sumC+=digitC;
                                        
                                }


                                 
                                System.out.print(sumC + ".");
                                
                //***************** //
                //
                //***** Box D ***** //
                
                
                
                
                        

                        System.out.print("\n\nEnter a number: ");       
                                inBoxD =  input.nextInt();
                                int tempD1 = inBoxD;                    
                                
                        System.out.print("Enter a digit: ");            
                                inBoxD2 =  input.nextInt();
                  
                                
                                
                                for (tempD1 = tempD1; tempD1 > 0; tempD1/=10) {
                                
                                
                                        if (tempD1 < 0) {
                                                
                                                tempD1*=-1;
                                                
                                        }
                                        
                                                                                
                                        digitD = tempD1 % 10;
                                        
                                        if (tempD1 == digitD) {
                                                
                                                countD1++;
                                                
                                        }
                                        
                                        
                                        

                                }
                                
                       
                        System.out.print("The number " + inBoxD + " contains " + countD1 + " digits that are " + inBoxD2);

                                
                                 input.close();
                                
                //***************** //

                                

        }
}