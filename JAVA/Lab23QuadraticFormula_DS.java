// ******684344******
// Student Name: Dilpreet
// Date: 05/06/2021
// File Name: 
// Description - get user inputs, calculate quadratic formula 
// ******************
import java.util.Scanner;

public class Lab23QuadraticFormula_DS {
        public static void main(String[] args){
                
                
                Scanner scan = new Scanner(System.in);  // initialize scanner

                
                System.out.println("Givin a quadratic equation in the form of: y = a*x^2 + b*x + c\n"); // top bar prompt
                System.out.print("What is the value of the coefficient \"a\" ? ");      // asks user for value of 'a' and saves value in a double
                double intA = scan.nextDouble();
                System.out.print("What is the value of the coefficient \"b\" ? ");      // asks user for value of 'b' and saves value in a double
                double intB = scan.nextDouble();
                System.out.print("What is the value of the coefficient \"c\" ? ");      // asks user for value of 'c' and saves value in a double
                double intC = scan.nextDouble();
                
                double resultBase = Math.pow(intB, 2) - 4.0 * intA * intC;              // does the calculation of the quadratic formula in the radical

                System.out.println("\nThe quadratic funtion y = " + intA + "*x^2 + " + intB +"*x + " + intC);   // prints back the user's input but subs the values in
                
                if (resultBase > 0.0) {         // determines if the input hits the axis 2 times
                        
                        double resultAdd = (-intB + Math.sqrt(resultBase)) / (2.0 * intA);              // calculates outside of the radical for both addition and subtraction.
                        double resultSub = (-intB - Math.sqrt(resultBase)) / (2.0 * intA);                  
                        System.out.print("has two roots, they are:   x = " + resultAdd + " x = " + resultSub);  // prints result
                                    
                }else if (resultBase == 0.0) {  // determines if the input hits the axis 1 time
                        
                        resultBase = -intB / (2.0 * intA);                                      
                        System.out.print("has only one root, it is:  x = " + resultBase);                       // prints result 
                                               
                }else{                          // determines if the input does not hits the axis
                
                        System.out.print("has no real roots, it is imaginary.");                                // prints result 
                        
                }
                scan.close();
                
        }                
}