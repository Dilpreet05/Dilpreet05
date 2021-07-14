// ****684344********
// Student Name: Dilpreet Singh
// Date: 12/2/2020
// File Name: Lab10Grade_DS.java
// Description - Lab10 assigned 12/11/2020
// *******************
import java.util.Scanner;

public class Lab10Grade_DS {
        public static void main(String[] args) {
        
                System.out.println("\t\t*** Grade calculator ***");
                
        
                Scanner scan = new Scanner(System.in);
                
                double Grade1, Grade2, Grade3, Grade4, Grade5, averageGrade;

                System.out.print("\nPlease enter 5 grades so I can determine your average: ");
                       Grade1 = scan.nextDouble();
                       Grade2 = scan.nextDouble();
                       Grade3 = scan.nextDouble();
                       Grade4 = scan.nextDouble();
                       Grade5 = scan.nextDouble();
                       averageGrade = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5)/5;
                       
                 System.out.println("\nYour average is " + averageGrade);     
                 
                        if (averageGrade<60) {
                        
                                System.out.println("Your grade is an F.");
                                System.out.print("Pay attention in class!");
                        
                        }else if (averageGrade<66) {
                        
                                System.out.println("Your grade is a D.");
                                System.out.print("You can do this! Ask for help!");
                        
                        }else if (averageGrade<70) {
                        
                                System.out.println("Your grade is a D+.");
                                System.out.print("Try Harder, you can do it!");
                        
                        }else if (averageGrade<77) {
                        
                                System.out.println("Your grade is a C.");
                                System.out.print("You are doing well, but i know you can do better!");
                        
                        }else if (averageGrade<80) {
                        
                                System.out.println("Your grade is a C+.");
                                System.out.print("Push a little more and you'll be well off!");
                        
                        }else if (averageGrade<87) {
                        
                                System.out.println("Your grade is a B.");
                                System.out.print("You are doing well!");
                        
                        }else if (averageGrade<90) {
                        
                                System.out.println("Your grade is a B+.");
                                System.out.print("Push a litter farther and you'll be amongst the greats!");
                        
                        }else if (averageGrade<=100) {
                        
                                System.out.println("Your grade is a A!");
                                System.out.print("You are among the greatest of this county!");
                        
                        }
                        
                        
                        System.out.print("\n\nIf you wish to improve your grade to become the greatest of the great, make sure you turn in any late work and take any retakes!");
                        
                        scan.close();
                        
        }
}