// ****Student Number****
// Student Name
// Date
// File Name
// Description - ask user for 3 ints in ascending order, then check what kind of triangle it would be
// ******************
import java.util.Scanner;

public class Lab24TriangleType_DS {
        public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                
                System.out.println("--== Triangle Information ==--\n");                 // title
                
                System.out.println("Let us check to see what kind of triangle you have");       // dialogue
                System.out.print("Please type in 3 integer number (seperated by spaces) : ");   // asks user for input 
                int intA = scan.nextInt();  // stores input into ints
                int intB = scan.nextInt();
                int intC = scan.nextInt();
                String triangle = "";   // creates String triangle
                
                
                
                        if (intA + intB > intC) {                       // determines whether the triangle inputed is acute obtuse right or not a triangle.
                        
                                if (Math.pow(intC, 2) < Math.pow(intA, 2) + Math.pow(intB, 2)) {
                                        
                                        triangle = "ACUTE";
                                        
                                        System.out.print("The sides " + intA + ", " + intB + ", " + intC + " form a " + triangle + " triangle.");
                                        
                                }else if (Math.pow(intC, 2) == Math.pow(intA, 2) + Math.pow(intB, 2)) {
                                        
                                        triangle = "RIGHT";
                                        
                                        System.out.println("\nThe sides " + intA + ", " + intB + ", " + intC + " form a " + triangle + " triangle.\n");
                                        
                                        System.out.println("The angle between the short side and the hypotenuse is " + (Math.sin(intA)*180/Math.PI));
                                        System.out.print("The angle between the long side and the hypotenuse is " + (Math.cos(intB)*180/Math.PI));

                                        
                                                                                
                                }else  if (Math.pow(intC, 2) > Math.pow(intA, 2) + Math.pow(intB, 2)) {
                                        
                                        triangle = "OBTUSE";
                                        
                                        System.out.print("The sides " + intA + ", " + intB + ", " + intC + " form a " + triangle + " triangle.");
                                        
                                        
                                }
                                
                                
                                
                                
                                
                        }else{
                                
                                System.out.print("The sides " + intA + ", " + intB + ", " + intC + " DO NOT form a triangle.");         // i dont know what happened here, but it works
                                
                        }
                
                
                scan.close();
                
                
        }
}