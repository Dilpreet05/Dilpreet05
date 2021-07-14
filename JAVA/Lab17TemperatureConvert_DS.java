// ****** 684344 *****
// Student Name: Dilpreet Singh
// Date: 03/11/2021
// File Name: Lab17TemperatureConvert_DS
// Description - converting user input to fahrenheit and printing celcius and fehrenheit values on a vertical table.
// *******************
import java.util.Scanner;               // inputs scanner.

public class Lab17TemperatureConvert_DS {
        public static void main(String []args) {
                
                Scanner scan = new Scanner(System.in);          // creates Scanner named scan
                int posNumIn, tempCelcius;                      // creates posNumIn and tempCelcius as integers.

                
                System.out.print("Give me a negative value from -25 to -5 : "); // asks for user input of a negative number, saves inside tempCelcius.
                        tempCelcius = scan.nextInt();
                        
                System.out.print("Give me a positive value from 5 to 25 : ");   // asks for user input of a positive number, saves inside of poNumIn.
                        posNumIn = scan.nextInt();
                        
                        
                System.out.println(" deg. C\t|  deg. F");                       // prints table titles.
                System.out.println("--------------------");                     // prints table seperator.
                
                
                for (tempCelcius = tempCelcius; tempCelcius != posNumIn + 1; tempCelcius++) {   // for loop that coverts tempCelcius into Fehrenheit, 
                                                                                                // and prints out both values in a vertical table untill the integer tempCelcius is equal to posNumIn+1.
                        double tempFehrenheit = (9 * tempCelcius + 160) / 5.0;                  // converts celcius to fehrenheit.
                        System.out.println( (double)tempCelcius + "\t|  " + tempFehrenheit);    // prints the table verticaly.
                        
                        
                }
                
                scan.close();
                
        }
}