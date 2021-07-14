// ******684344******
// Student Name: dilpreet
// Date: 4/22/21
// File Name: Lab21StringChecker_DS
// Description - compare strings to figure out 
// ******************
import java.util.Scanner;                       // scanner

public class Lab21StringChecker_DS {
        public static void main(String[] args) {
                        
                        Scanner scan = new Scanner(System.in); // scanner
                        
                        System.out.print("\t*** String Checker ***\n\n"); // top bar thing 
                        
                        System.out.print("Enter a sentence: ");           // prompt numero uno saves string in
                        String sentence = scan.nextLine().toLowerCase();
                        
                        System.out.print("Enter a string to look for: "); // prompt numero dos saves string in
                        String string = scan.nextLine();
                        
                        System.out.println();   // adds a space
                        
                        int count = 0;                          // make count to count how many times string is in sentence
                        int sentenceLength = sentence.length(); // make int of sentence length
                        int strLength = string.length();        // make int of str length
                        String strLower = string.toLowerCase(); // make string of str but lower case so the case doesnt mess it up   
                        
                        
                        for (int loop = 0; loop <= sentenceLength - strLength; loop++) {                // loop loops how many times how ever long the sentence is

                                
                                if (sentence.substring(loop, loop + strLength).equals(strLower)) {      // checks for string in sentence
                                       count++;

                                }        
                        }
                                                



                        
                        
                        System.out.print("The string \"" + string +  "\" is in your sentence " + count + " times.");    // print how many times string appears in sentence
                        
                        
                        scan.close();
                        
                        
                        
                        
        }
}

// works with strings with only one char not strings with more than one letter                        
//                         for (loop = 0; loop < sentence.length(); loop++) {
//                                 string.toLowerCase();    
//                                 if (sentence.substring(count2, strLength).equals(string) == true) {
//                                        count++;
//                                 }        
//                                 
//                                        strLength++;      
//                                        count2++;
//                                                                                           
//                         }
