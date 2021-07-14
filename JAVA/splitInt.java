import java.util.Scanner;
// split the input and sum the numbers in array
public class splitInt{
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter a number : ");
                int x = scan.nextInt();
                String temp = Long.toString(x);    
                int[] y = new int[temp.length()];
                for (int i = 0; i < temp.length(); i++) {
                y[i] = temp.charAt(i) - '0';
                }


                int sum = 0;
                int z = temp.length() - 1;
                while (z >= 0) {
                        sum = sum + y[z];
                        z--;

                }
                System.out.println(sum);


        }
}