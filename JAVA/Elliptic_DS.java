/*
 *  Name: Dilpreet Singh
 *  Prog Name: Elliptic_DS.java
 *  purpose: find all solutions to elliptic curves
 *  Comp date: 
 * 	
 * R0: 2-sept-2022 Dilpreet Singh - original version
 * R1: 3-sept-2022 Dilpreet Singh - added input vars for user in an created a counter 
 * R2: 3-sept-2022 Dilpreet Singh - added 4 for loops to evaluate the solutions using the given formula
 * R3: 4-sept-2022 Dilpreet Singh - switched from 4 nested loops to 4 separate methods containing for loops for
 * R4: 6-sept-2022 Dilpreet Singh - removed the cycleY method call and transfered code into the main method for extra speed.
 * R5: 6-sept-2022 Dilpreet Singh - switched from 3 static methods to 4 for loops inside the main method.
 * R6: 6-sept-2022 Dilpreet Singh - added more comments.
 * R7: 6-sept-2022 Dilpreet Singh - changed to faster algorithm.
 * R8: 8-sept-2022 Dilpreet Singh - changed to faster algorithm.
 * R9: 9-sept-2022 Dilpreet Singh - changed to faster algorithm.
 * R10: 11-sept-2022 Dilpreet Singh - Made algorithm faster and much more compact.
 * 
 */
import java.util.Scanner;

// y^2 = x^3 + Ax + B
public class Elliptic_DS {
 
	public static void main(String[] args) {
		
		
		// initialize scanner, create input vars
		Scanner scan = new Scanner(System.in);
		int yInput;
		int xInput;
		int aInput;
		int bInput;
		
		// user in
		System.out.print("<><><> Program Elliptic <><><>\n\n");
		
		System.out.print("Enter range for y: ");
		yInput = scan.nextInt();
		
		
		System.out.print("Enter span for x: ");
		xInput = scan.nextInt();
		
		
		System.out.print("Enter span for a: ");
		aInput = scan.nextInt();
		
		
		System.out.print("Enter span for b: ");
		bInput = scan.nextInt();
		scan.close();
		System.out.println();
		
		
		// ET start - insert at start of algorithm of interest
		long et = System.nanoTime();

		// Your algorithm goes here.
		// brute force with extra steps, inspired from a binary search
		boolean abort = false;
		int count = 0;
		for(int y = 0; y <= yInput; y++) {
			
			for(int x = xInput; x >= 0 && !abort; x--) {
				
				for(int a = aInput; a >= -aInput && !abort; a--) {
					

						for(int b = 0; b >= -bInput && b <= bInput && !abort;) {
							if((y*y == x*x*x + x*a + b) && ((4*a*a*a) + (27*b*b) != 0)){
								System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, b);
								count++;
								abort = true;
							}else if(y*y > (x*x*x) + (x*a) + b) {
								if( y*y <  (x*x*x) + (x*a) + b+(bInput/2)) {
									b++;
								}else 
									b+=bInput/2;
								
							}else if(y*y < (x*x*x) + (x*a) + b){
								
								if(y*y > (x*x*x) + (x*a) - b+bInput/2 ) {
									b--;
								}else 
									b-=bInput/2;

								
							}else if(4*a*a*a + 27*b*b == 0){
								break;
							}else {
								abort = true;
							}

						
					}
					
					
				}
			}
			if(!abort) {
				System.out.printf("%d not found!\n", y);
			}
			abort = false;
		}



			System.out.printf("\nSolution(s) found for %d values of y.", count);

			et = System.nanoTime() - et;


			// elapsed time and total solutions found
			System.out.printf("\n\nElapsed time: %.2E nsecs", (double) et);

		}
	}	


		
		System.out.printf("\nSolution(s) found for %d values of y.\n\n", count);



		// ET end - insert at end of algorithm of interest
		et = System.nanoTime() - et;
		

		// elapsed time and total solutions found
		System.out.printf("Elapsed time: %.2E nsecs", (double) et);
	}
}
