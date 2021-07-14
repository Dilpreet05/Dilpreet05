// ******684344******
// Student Name: Dilpreet singh
// Date: 11/20/2020
// File Name: Lab08RoomPaint_DS.java
// Description - Painting a room lab
// *******************
import java.util.Scanner;

public class Lab08RoomPaint_DS {
        public static void main(String[] args){
        
                Scanner scan = new Scanner(System.in);
                final int COVERAGE = 350, WINDOW, DOOR;
                int length, width, height;
                // double totalSqFt, paintNeeded;
                
                
              //----------------------Title------------------------  
                System.out.println("--- Paint Calculator ---\n");
              //-----------------------lwh-------------------------
                System.out.print("Enter the room length: ");
                                length = scan.nextInt();
                
                System.out.print("Enter the room width: ");
                                width = scan.nextInt();
                
                System.out.print("Enter the room height: ");
                                height = scan.nextInt();
                                
                System.out.print("\nHow many doors are in the room: ");
                                DOOR = scan.nextInt();               
                
                System.out.print("How many windows are in the room: ");              
                                WINDOW = scan.nextInt();         
                                          
              //--------------------Computation--------------------  
                        
                        int totalSqFt = (length*height*2+width*height*2 - (DOOR*20) - (WINDOW*15)); 
                        
                System.out.println("\nA room that is " + length + " ft. long, " + width + " ft. wide, and " + height + " ft. tall " + DOOR + " doors and " + WINDOW + " windows has a total of " + totalSqFt + " square feet.");
                System.out.println("you will need " + totalSqFt/COVERAGE + " gallons of paint.");
                
                
                
                
                
                scan.close();
                
                
                
                
                
                
                
        
        
        }
}