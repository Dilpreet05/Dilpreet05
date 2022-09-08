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
 * R7: 6-sept-2022 Dilpreet Singh - changed algorithm.
 * R8: 8-sept-2022 Dilpreet Singh - changed algorithm
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

		// Your algorithm goes here
		// brute forces solutions, when the loops reach the first inner conditional, it will proceed similarly to a binary search.
		boolean abort = false;
		int count = 0;
		for(int y = 0; y <= yInput; y++) {

			for(int x =  xInput; x >= -xInput && !abort; x--) {

				for(int a = aInput; a >= -aInput && !abort; a--) {

					if((Math.pow(y, 2) > Math.pow(x, 3) + (x*a) + 0)) {
						if((Math.pow(y, 2) > Math.pow(x, 3) + (x*a) + bInput/2)) {
							for(int b = bInput/2; b <= bInput && !abort; b++) {
								if((Math.pow(y, 2) == Math.pow(x, 3) + (x*a) + b) && ((4*Math.pow(a, 3)) + (27*Math.pow(0, 2)) != 0)) {	

									System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, b);
									abort = true;
									count++;

								}					
							}
						}else {
							for(int b = bInput/2; b >= 0 && !abort; b--) {
								if((Math.pow(y, 2) == Math.pow(x, 3) + (x*a) + b) && ((4*Math.pow(a, 3)) + (27*Math.pow(0, 2)) != 0)) {	

									System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, b);
									abort = true;
									count++;

								}	
							}
						}

					}else if((Math.pow(y, 2) < Math.pow(x, 3) + (x*a) + 0)){
						if(Math.pow(y, 2) < Math.pow(x, 3) + (x*a) + -bInput/2) {
							for(int b = (-bInput)/2; b >= -bInput; b--) {
								if((Math.pow(y, 2) == Math.pow(x, 3) + (x*a) + b) && ((4*Math.pow(a, 3)) + (27*Math.pow(0, 2)) != 0)) {	

									System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, b);
									abort = true;
									count++;

								}	
							}	
						}else{
							for(int b = -bInput; b <= 0; b++) {
								if((Math.pow(y, 2) == Math.pow(x, 3) + (x*a) + b) && ((4*Math.pow(a, 3)) + (27*Math.pow(0, 2)) != 0)) {	

									System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, b);
									abort = true;
									count++;

								}	
							}
						}

					}else if(4*Math.pow(a, 3) + (27*Math.pow(0, 2)) != 0){

						System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, 0);

					}else {

						abort = true;

					}

				}
			}
			if(!abort) {
				System.out.printf("%d not found!\n", y);
			}
			abort = false;
		}

		
		System.out.printf("\nSolution(s) found for %d values of y.\n\n", count);



		// ET end - insert at end of algorithm of interest
		et = System.nanoTime() - et;
		

		// elapsed time and total solutions found
		System.out.printf("Elapsed time: %.2E nsecs", (double) et);
	}
}
