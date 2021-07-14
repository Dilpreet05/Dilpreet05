import java.util.Scanner;

public class getUserInput {
        public static void main(String[] args){
        
                   Scanner scanner = new Scanner(System.in);
          //
          // Read string input for username
          //
           System.out.print("Username: ");
            String username = scanner.nextLine();
            //
            // Read string input for password
            //
            System.out.print("Password: ");
            String password = scanner.nextLine();
            //
            // Read an integer input for another challenge
            //
            System.out.print("What is 2 + 2: ");
            int result = scanner.nextInt();
            System.out.print("What is 2.1 + 2.3: ");
            double dresult  =  scanner.nextDouble( );
            System.out.println("username = " + username);
            System.out.println("password = " + password);
            System.out.println("2 + 2 = " + result);
            System.out.println("2.1 + 2.3  = " + dresult);

            scanner.close();
        
//        Scanner scan = new Scanner(System.in);
        
//        // int grade = 85; //creating a variable and assigning a value
//         
//        // System.out.println(grade);
//         
//        // grade = scan.nextInt(); 
//         
//        // System.out.println(grade);
//         
//         System.out.println("How Old Are You?");
//         int age = scan.nextInt();
//         System.out.print("if you are " + age + " then you are born in " + (2020 - age));
//         
//         System.out.println("Name : ");
//         String name = scan.nextLine();
//         System.out.print(name);
        
        }
}



       
       
        // import a library (progran (class) with a list of commands)
                // import java.util,Scanner; //Program Scanner (class)
        
                //you want to import Libraies before ever accessing any programs 
                //isially do this on like one
        //create an opject that allows for user input
                //type          Name = create / initialize          
                //Scanner       scan = new Scanner
                //you now have a way to get input by typing "scan" followed by a command
                //you only need one scanner, only create 1, you may reuse the scanner and use different commands
        //scan.nextInt(); gets an integet
        //scan.nextDouble(); gets a double
        //scan.nextLine(); gets some text(String); 