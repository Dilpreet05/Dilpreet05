// ****684344********
// Student Name: Dilpreet Singh
// Date: 12/2/2020
// File Name: Lab09BCompareNum_DS.java
// Description - Lab09 assigned 12/2/2020
// *******************
import java.util.Scanner;

public class Lab09BCompareNum_DS {
        public static void main(String[] args) {
        
                Scanner scan = new Scanner(System.in);
                int integer1, integer2;
        
                System.out.print("Enter two integers: ");
                        integer1 = scan.nextInt();      
                        integer2 = scan.nextInt();
        
                System.out.println("You entered " + integer1 + " and " + integer2);
                
        
                        if ( integer1 > 0 ) {
                                System.out.println("\nThe number " + integer1 + " is positive.");
                               }else{
                                System.out.println("\nThe number " + integer1 + " is negative.");
                        }
                        
                        if ( integer2 > 0 ) {
                                System.out.println("The number " + integer2 + " is positive.");
                               }else{
                                System.out.println("The number " + integer2 + " is negative.");
                        }
                        
                        if ( integer1 % 2 == 0 ) {
                                System.out.println("\nThe number " + integer1 + " is even.");
                               }else{
                                System.out.println("\nThe number " + integer1 + " is odd.");
                        }
                        
                        if ( integer2 % 2 == 0 ) {
                                System.out.println("The number " + integer2 + " is even.");
                               }else{
                                System.out.println("The number " + integer2 + " is odd.");
                        }
                        
                        if ( integer1 > integer2 ) {
                                System.out.println("\nThe number " + integer1 + " is larger than the number " + integer2);
                        
                                if ( integer1 % integer2 == 0) {
                                        System.out.println("The number " + integer1 + " is divisable by " + integer2);
                                        System.out.println(integer1 + " / " + integer2 + " = " + (integer1 / integer2));
                                       }else{
                                        System.out.println("The number " + integer1 + " is not divisable by " + integer2);
                                }
                        
                        }
                        
                        if ( integer2 > integer1 ) {
                                System.out.println("\nThe number " + integer2 + " is larger than the number " + integer1);
                        
                                if (integer2 % integer1 == 0 ) {
                                        System.out.println("The number " + integer2 + " is divisable by " + integer1);
                                        System.out.println(integer2 + " / " + integer1 + " = " + (integer2 / integer1));
                                       }else{
                                        System.out.println("The number " + integer2 + " is not divisable by " + integer1);
                                }
                        
                        }
                        scan.close();
                        

        }
}