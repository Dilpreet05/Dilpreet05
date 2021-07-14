import java.util.Scanner;

public class binToDec {
        public static void main(String[] args){

                Scanner scan = new Scanner(System.in);
                int decNum = 0;


                System.out.print("Enter a binary number : ");
                long binNum = scan.nextLong();          // takes input as long

                String temp = Long.toString(binNum);    // chunk of code that turns the binary number and splits it into an array of individual numbers 
                int[] binNums = new int[temp.length()];
                for (int i = 0; i < temp.length(); i++) {
                    binNums[i] = temp.charAt(i) - '0';
                }

                
                int y = 1;
                int z = 1;
                while(binNum > 0){              // loop iterates through the array of 1's and 0's from the input and adds to the value of the decimal number if the array slot is 1
                        if (binNums[temp.length() - z] == 1) {
                                decNum+=y;
                        }
                        y*=2;
                        z++;
                        binNum/=10;
                }
                
                System.out.print(decNum);
        }
}
