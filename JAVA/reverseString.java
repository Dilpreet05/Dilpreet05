import java.util.Scanner;

public class reverseString {
        public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a string : ");
                String input = scan.nextLine();

                System.out.print("\nReverse string : " );

                for (int i = input.length() - 1; i >= 0; i--){
                        char reverse = input.charAt(i);
                        System.out.print(reverse);
                }


                




        }
}
