/*
 * 
 * Name: Dilpreet Singh
 * Prog name: BigO_DS.java
 * purpose: find the time complexity of a program given the n and t values of 2 seperate runs.
 * comp date: 9/15/2022
 * 
 * R0: 9/15/2022 - Dilpreet Singh - Original ver
 * 
 * 
 */
import java.util.Scanner;

public class BigO_DS {
	/*
	 	No loops or recursion: O(1) – "constant" 
		Binary search: O(log(n)) – "log" 
		A loop that runs "n" times, and simple recursion: O(n) – "linear" 
		The "clever" sorts: O(nlog(n)) – "quasi-linear" 
		k-deep nested loops: O(n^k) – "polynomial" 
		Checking all combinations/permutations: O(2^n) – "exponential"
	 */
	
	public static void main(String[] args) {
		
		System.out.println("*** Program BigO ***\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n1: ");
		double n1 = scan.nextDouble();
		
		System.out.print("t1: ");
		double t1 = scan.nextDouble();
		
		System.out.print("n2: ");
		double n2 = scan.nextDouble();
		
		System.out.print("t2: ");
		double t2 = scan.nextDouble();
		
		/*
		 both arrays are ordered as such {n, O(1), O(log(n)), O(n), O(nlog(n)), O(n^2), O(n^3), O(2^n)}
		 first array contains the time complexities that are used in the error calc and to print in the table
		 second array contains the matching Big O notations, used for printing at the end of the run.
		*/
		double[] arr = {n2, t1, (t1*(Math.log(n2)/Math.log(n1))), t1*(n2/n1), t1*((n2*Math.log10(n2))/(n1*Math.log10(n1))) ,t1*((n2*n2)/(n1*n1)),t1*((n2*n2*n2)/(n1*n1*n1)), t1*(Math.pow(2, n2)/Math.pow(2, n1)) };
		String[] name= {"n","O(1)","O(log(n))", "O(n)", "O(nlog(n))","O(n^2)" ,"O(n^3)", "O(2^n)"};
		
		System.out.printf("\nn1: %.1E\n", n1);
		System.out.printf("t1: %.1E\n", t1);
		System.out.printf("n2: %.1E\n", n2);
		System.out.printf("t2: %.1E\n\n", t2);

		// table with decent formatting
		System.out.println("   n          O(1)  O(log(n))       O(n) O(nlog(n))     O(n^2)     O(n^3)     O(2^n)");
		System.out.println("------- ---------- ---------- ---------- ---------- ---------- ---------- ----------");
		System.out.printf( "%.1E    %.1E    %.1E    %.1E    %.1E    %.1E    %.1E   %.1E", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
		
		
		// relError = abs((tcalc – t2) / t2) * 100
		double error = Math.abs((0-t2)/t2) * 100;
		int index = 0;
		double x;
		// figures out which time complexity has the smallest relative error. smallest error is the winner.
		for(int k = 1; k < arr.length; k++) {
			x = Math.abs((arr[k]-t2)/t2) * 100;
			
			if(x < error) {
				index = k;
				error = x;
			}
			
		}
		
		System.out.printf("\n\nBest fit: " + name[index] + ", Relative Error: %.2f%c", (float)error, '%' );
		
	}
}
