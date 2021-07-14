// ******684344******
// Student Name: Dilpreet
// Date: 1/27/21
// File Name: Lab11GradesComments_DS
// Description - Add to the program given by Mr. Payne 
// *******************
import java.util.Scanner;       // importing util scanner so the user can give input on his/her grades. //

//******* //

public class Lab11GradesComments_DS {      // public class/ name of the program. //
        public static void main(String [] args){        // string //
                Scanner GET = new Scanner(System.in);   // initializing the scanner object. //
                int count=0, grade=0;                   // declaring integers count and grade // 
                double average=0, finalGrade=0;               // declaring doubbles average and finalGrade //
                System.out.println("--- Grade Calculator ---"); // prints the title of the program "--- Grade Calculator ---" //
                while(count < 5) {                              // while loop that is sending the message to input the user grade and calculating the average of the grades //
                //******************* // making it look neet //
                        count=count+1;                                          // add 1 to the value of count so that the while loop will stop once the value is >= 5 //
                        System.out.print("Enter grade " + count + ": ");        // prompt to imnput user grades // 
                        grade=GET.nextInt();                                    // takes user input //
                        average=average+grade;                                  // adds up all the user inputed grades //
                //******************* // making it look neet //
                }                                                               // end of while loop
                //******************* // making it look neet //
                finalGrade=average/count;                                       // finds the average of all the user inputed grades and stores it into integer finalGrade //
                System.out.print("You earned a " + finalGrade);                 // prints the average of the user inputed grades
                
                if (finalGrade >= 72.4 && finalGrade <= 88.7) {                                 // if-else statement that says if your grade was between the numbers 72.4 and 88.7 //
                        System.out.print("\nYour average grade is between 72.4 and 88.7");      // code that prints if your grade is between the numbers 72.4 and 88.7 //
                }else{                                                                          // the else statement //
                        System.out.print("\nYour average grade is not between 72.4 and 88.7");  // code that prints if your grade is not between the numbers 72.4 and 88.7 //
                }                                                                               // end of if-else statement //

                GET.close();
        }
}