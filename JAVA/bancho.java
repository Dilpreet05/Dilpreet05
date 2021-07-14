import java.util.Scanner;
import java.util.Random;

public class bancho {
        public static void main(String[] args) {


                prompt();


                
        }

        public static void prompt() {
                Random random = new Random();
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a option: ");
                System.out.print("!roll\nexit\nEnter: ");
                String input = scan.nextLine();
                switch(input) {
                       case "!roll":
                       System.out.print("YOU ROLLED: " + random.nextInt(101));
                       break;

                       case "exit":
                       break;
                       
                       default:
                       System.out.println("\nTry again");
                       prompt(); 
                       break;
                }

                scan.close();

        }

}