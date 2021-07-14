// ******684344******
// Student Name: dilpreet singh
// Date: 4/29/21
// File Name: Lab22WavyName_DS.java
// Description - make a wavy name from the users name
// ******************
import java.util.Scanner;

public class Lab22WavyName_DS {
        public static void main(String[] args) {
        
                                Scanner scan = new Scanner(System.in);
                        
                        // ***** prompt and stuff ***** //
                                System.out.print("Please type in your first and last name separated by a space: ");
                                String name = scan.nextLine();  // saves answer of the prompt
                                
                                String firstName = name.substring(0,name.indexOf(" "));
                                String lastName = name.substring(name.indexOf(" "));
                                int nameLength = name.length();
                        // **************************** //
                        
                        
                        
                        // ***** loop 1 ***** //
                                int count = 0;
                                
                                for (int loopFirst = firstName.length(); loopFirst > 0; loopFirst--) {  // prints their first name by starting with just the first letter and adding a letter on each new line below,
                                
                                        count++;  
                                        System.out.println(firstName.substring(0, count));   
                                                          
                                }
                        // ****************** //
                        
                        
                                System.out.println();
                        
                        
                        // ***** loop 2 ***** //
                                int count2 = lastName.length();                         
                                for (int loopLast = 1; loopLast <= lastName.length(); loopLast++) {     // prints their last name by starting with the whole last name and subtracting the last letter
                                        
                                        System.out.println(lastName.substring(1, count2));
                                        count2--;
                                }
                        // ****************** //
                        
                        
                        
                        // ***** loop 3 ***** //
                                for (int loop3 = 0; loop3 < nameLength; loop3++) {      // prints the full name, one letter at a time, on a diagonal forwards
                                        
                                                int count3 = loop3;
                                        
                                        for (int nest1 = 0; nest1 < count3; nest1++) {
                                                System.out.print(" ");
                                                
                                        }
                                        
                                                System.out.println(name.substring(loop3, loop3 + 1));
                                                
                                }
                        // ****************** //
                        
                        
                        
                        // ***** loop 4 ***** //
                                for (int loop4 = nameLength; loop4 > 0; loop4--) {      // prints the full name, one letter at a time, on a diagonal backwards
                                        
                                        
                                        for (int nest1 = loop4; nest1 > 1; nest1--) {
                                                System.out.print(" ");
                                                
                                        }
                                        
                                                System.out.println(name.substring(loop4 -1, loop4));
                                        
                                }
                        // ****************** //
                        
                                scan.close();
        }
}