// ****Student Number****
// Student Name: Dilpreet Singh
// Date: 4/15/21
// File Name: Lab23EmailGenerator_DS.java
// Description - make an email generator by using parts of the users information by using strings
// ******************
import java.util.Scanner;

public class Lab20EmailGenerator_DS {
        public static void main(String[] args){
                
                
                Scanner scan = new Scanner(System.in);
                String city;
                
                // prompt 1 input
                
                System.out.print("Enter your first name: ");
                String firstName = scan.nextLine();
                
                System.out.print("Enter your last name: ");
                String lastName = scan.nextLine();
                
                String email = firstName.toLowerCase().charAt(0) + lastName.toLowerCase();
                
                System.out.print("\nPlease enter your street adress: ");
                String streetAdr = scan.nextLine();
                
                System.out.print("Please enter your city, state and zip:  ");
                String citySZ = scan.nextLine();
                int comma = citySZ.indexOf(",");
                city = citySZ.substring(0,comma);
                
                System.out.print("Enter your phone number (###)###-####: ");
                String phoneNum = scan.nextLine();
                String areaCode = phoneNum.substring(1,4);
                int phoneLength = phoneNum.length();
                String lastFour = phoneNum.substring(phoneNum.indexOf("-") + 1, phoneLength);         
                       
                // prompt 2 output
                System.out.print("\nYour full name is " + firstName + " " + lastName + ".");
                System.out.print("\nYou live at " + streetAdr + ".");
                System.out.print("\nYour phone number is " + phoneNum + ".");
                System.out.print("\n\nCongradulations " + firstName + "! Your new email adress  is " + email + "@awesomejava.com.");
                System.out.print("\nYour temporary password is \"" + areaCode + city + lastFour + "\".");
                
                
                
                scan.close();
                
                
        }
}