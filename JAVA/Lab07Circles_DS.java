//************************************684344***************************************
//
// *Name: Dilpreet Singh
// ^Date: 11/18/20
// *Project Title: Lab07Circles_DS
// *Description: Finds the ratio circumference and area of a circle with the radius
//
//*********************************************************************************
import java.util.Scanner; //initializes Scanner
 
public class Lab07Circles_DS // public class
{
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in); 
      final double PI = 3.14159;
      
      System.out.print("Enter a radius: ");
      int radius = scan.nextInt();
      
      double area1 = PI * radius * radius;
      double circumference1 = 2 * PI * radius;
      
      
      System.out.println("\nThe area of a circle with radius " + radius + " is " + area1);
      System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
      
      
      
      double area2 = (PI * radius * radius) * 4;
      double circumference2 = (2 * PI * radius) * 2;
      
      
      System.out.println("\nThe area of a circle with radius " + (radius * 2) + " is " + area2);
      System.out.println("The circumference of a circle with radius " + (radius * 2 ) + " is " + circumference2);
      
      
      System.out.println("\nThe ratio of the areas when the radius is double is " + area2/area1);
      System.out.println("The ratio of the circumferences when the radius is doubled is " + circumference2/circumference1);
      // double a2da1 = area2/area1;

      scan.close();
      
      
      // This is very messy :( 
   }
}