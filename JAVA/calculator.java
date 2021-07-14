import java.util.Scanner;
/**
 * 684344
 * Dilpreet Singh
 * 6/19/2020
 * A calculator that can add, subtract, multiply, divide, find the square root of a number, and find the power of a number.
 */
public class calculator {
        public static void main(String[] args) {

                
                prompt();
                Calculation();

        }





        public static void prompt(){

                System.out.println("Welcome to our calculator!");
                System.out.println("What would you like to do:");

        }
        //----------------------------------------------------------------
        public static void Calculation(){

                Scanner scan = new Scanner(System.in);


                System.out.print("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - SQRT\n6 - Exponet\nEnter one of the above: ");
                int input = scan.nextInt();

                double a;
                double b;

                if (input == 5 ){
                        System.out.print("Enter the number: ");
                        a = scan.nextDouble();
                        b = 0;
                }else if (input == 6) {
                        System.out.print("Enter the number: ");
                        a = scan.nextDouble();
                        System.out.print("Enter the exponet: ");
                        b = scan.nextDouble();
                }else{
                        System.out.print("Enter the 2 numbers: ");
                        a = scan.nextDouble();
                        b = scan.nextDouble();
                }

                if (input == 1) {
                        Add(a, b);
                }else if (input == 2){
                        Subtract(a, b);
                }else if (input == 3){
                        Multiply(a, b);
                }else if (input == 4){
                        Divide(a, b);
                }else if (input == 5){
                        Root(a);
                }else if (input == 6){
                        Exponet(a, b);
                }else{
                        System.out.println("Try again.\n");
                        Calculation();
                }     
                scan.close();
        }
        // ---------------------------------------------------------------
        public static void Add(double a, double b) {
                System.out.println(a + " + " + b + " = " + (a + b));
        }
        //----------------------------------------------------------------
        public static void Subtract(double a, double b){
                System.out.println(a + " - " + b + " = " + (a - b));
        }
        //----------------------------------------------------------------
        public static void Multiply(double a, double b){
                System.out.println(a + " * " + b + " = " + (a * b));
        }
        //----------------------------------------------------------------
        public static void Divide(double a, double b){
                System.out.println(a + " / " + b + " = " + (a / b));
        }
        //----------------------------------------------------------------
        public static void Root(double a){
                System.out.println(a + "sqrt = " + Math.sqrt(a));
        }
        //----------------------------------------------------------------
        public static void Exponet(double a, double b){
                System.out.println(a + "^" + b + " = " + (Math.pow(a, b)));
        }

}


// line 100 :)