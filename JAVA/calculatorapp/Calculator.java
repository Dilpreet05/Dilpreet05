package calculatorapp;

/**
 * Calculator
 */
import java.util.Scanner;
public class Calculator {

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
// revised
                switch(input){
                        case 1:
                                Add(a, b);
                                break;
                        case 2:
                                Subtract(a, b);
                                break;
                        case 3:
                                Multiply(a, b);
                                break;
                        case 4:
                                Divide(a, b);
                                break;
                        case 5:
                                Root(a);
                                break;
                        case 6:
                                Exponet(a, b);
                                break;
                        default:
                                System.out.println("Try again.\n");
                                Calculation();
                        break;
                }
// old ver
                // if (input == 1) {
                //         Add(a, b);
                // }else if (input == 2){
                //         Subtract(a, b);
                // }else if (input == 3){
                //         Multiply(a, b);
                // }else if (input == 4){
                //         Divide(a, b);
                // }else if (input == 5){
                //         Root(a);
                // }else if (input == 6){
                //         Exponet(a, b);
                // }else{
                //         System.out.println("Try again.\n");
                //         Calculation();
                // }     
                scan.close();
        }
        // ---------------------------------------------------------------
        private static void Add(double a, double b) {
                System.out.println(a + " + " + b + " = " + (a + b));
        }
        //----------------------------------------------------------------
        private static void Subtract(double a, double b){
                System.out.println(a + " - " + b + " = " + (a - b));
        }
        //----------------------------------------------------------------
        private static void Multiply(double a, double b){
                System.out.println(a + " * " + b + " = " + (a * b));
        }
        //----------------------------------------------------------------
        private static void Divide(double a, double b){
                System.out.println(a + " / " + b + " = " + (a / b));
        }
        //----------------------------------------------------------------
        private static void Root(double a){
                System.out.println(a + "sqrt = " + Math.sqrt(a));
        }
        //----------------------------------------------------------------
        private static void Exponet(double a, double b){
                System.out.println(a + "^" + b + " = " + (Math.pow(a, b)));
        }

        // testing testing


}