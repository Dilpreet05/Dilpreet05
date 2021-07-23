package salarycalculator;
import java.util.Scanner;

public class User {

        static double pay;
        static double hours;

        public static void hours() {
                Scanner scan = new Scanner(System.in);
                System.out.print("How many hours do you work weekly : ");
                hours = scan.nextDouble();

        }

        public static void pay(){
                Scanner scan = new Scanner(System.in);
                System.out.print("How much do you get paid hourly : ");
                pay = scan.nextDouble();
        }

        public double salary(){
                double totalWeeklyPay = (pay*hours);
                return totalWeeklyPay*52;
        }

        
}
