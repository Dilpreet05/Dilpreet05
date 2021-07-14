// ******684344*******
// Student Name: Dilpreet Singh
// Date: 03/05/2020
// File Name: Lab16ForLoops_DS.java
// Description - Intro to for loops, printing numbers.
// *******************
import java.util.Scanner;

public class Lab16ForLoops_DS {
        public static void main (String[] args) {
                
                
                Scanner scan = new Scanner(System.in);
                
                
                for (int i = -10; i < 11; i++) {
                        
                        System.out.print(i + " ");
                        
                }
                
                System.out.print("\n");
                
                for (int j = 0; j < 50; j++) {
                        
                        if (j % 2 != 0 ) {
                                
                                System.out.println(j);
                                
                        }
                        
                        
                }
                
                
                for (int k = 30; k >= 3; k--) {
                        
                        if (k % 3 == 0) {
                                
                                System.out.print(k);
                                System.out.print("-");
                                
                                        if (k - 3 != 0){
                                                System.out.print("-");                                
                                        }
                                
                        }
                        
                        
                        
                }
                
                System.out.print("\n\nEnter a low value : ");
                        
                System.out.print("Enter a high value : ");
                        int high = scan.nextInt();
                
                for (int l = 0; l <= high; l++) {
                
                        if (l % 4 == 0 && l % 5 != 0) {
                                
                                System.out.println(l);
                                
                        }
                
                }

                scan.close();
                
                
        }
}