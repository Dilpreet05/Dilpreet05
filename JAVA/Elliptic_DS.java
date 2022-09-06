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
 * R6: 6-sept-2022 Dilpreet Singh - added more comments.
 */
import java.util.Scanner;


// y^2 = x^3 + Ax + B
public class Elliptic_DS {
 
	static int count = 0;
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
		// iterates values of y from 0 to yInput
		for(int y = 0; y <= yInput; y++) {
			if(!cycleX(y, xInput,  aInput, bInput))
				System.out.printf("%d not found!\n",y);
		}
		System.out.printf("\nSolution(s) found for %d values of y\n\n.", count);


		// ET end - insert at end of algorithm of interest
		et = System.nanoTime() - et;
		

		// elapsed time and total solutions found
		System.out.printf("Elapsed time: %.2E nsecs", (double) et);
	}
	
	

	// iterates values of x with a for loop from the lower bound of x to the upper bound
	public static boolean cycleX(int y, int xIn, int aIn, int bIn) {
		for(int x = Math.abs(xIn)*-1; x <= Math.abs(xIn); x++) {
			if(cycleA(y, x, aIn, bIn)) {
				return true;
			}
		}
		return false;
	}
	
	
	// iterates values of a with a for loop from the lower bound to upper bound
	public static boolean cycleA(int y, int x, int aIn, int bIn) {
		for(int a = Math.abs(aIn)*-1; a <= Math.abs(aIn); a++) {
			if (cycleB(y, x, a, bIn)){
				return true;
			}
			
		}
		return false;
	}
	
	// iterates values of b from lower bound to upper bound. checks for solutions and prints first solution then returns.
	public static boolean cycleB(int y, int x, int a, int bIn) {
		for(int b = Math.abs(bIn)*-1; b <= Math.abs(bIn); b++) {
			if((Math.pow(y, 2) == Math.pow(x, 3) + (x*a) + b) && ((4*Math.pow(a, 3)) + (27*Math.pow(b, 2)) != 0)) {		
			System.out.printf("y: %d, x: %d, a: %d, b: %d\n", y, x, a, b);
			count++;
			return true;
			}
		}
		return false;
	}
}
