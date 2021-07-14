package surfaceareacalculator;

import java.util.Scanner;

/**
 * SurfaceArea
 * To-Do
 * Calculates Surface Area, and Volume of the 3D objects.
 */

public class SurfaceArea {

        static Scanner scan = new Scanner(System.in);

        protected static void prompt(){
                System.out.println("Welcome to the Volume and Surface Area Calculator!");
                System.out.println("What would you like to do:");

        }



// revised with switch cases instead of if else statements.
        protected static void Calculation(){
                System.out.print("1 - Find Volume of a 3D object.\n2 - Find Surface Area of a 3D object.\nEnter your option: ");
                int input = scan.nextInt();

                switch(input){
                        case 1:
                                Volume();
                                break;
                        case 2:
                                surfaceArea();
                                break; 
                }

                // if (input == 1) {
                //         Volume();
                // }else if (input == 2) {
                //         surfaceArea();
                // }
        }


        //-----------------------------------------------------------------------------------------


        private static void Volume(){
                System.out.println("What object would you like to find the Volume of?");
                System.out.print("1 - Rectangular Prism\n2 - Cube\n3 - Sphere\n4 - Cylinder\nEnter your option: ");
                int input = scan.nextInt();

                switch(input){
                        case 1:
                                Vrectangle(input, input, input);
                                break;
                        case 2:
                                Vcube(input);
                                break;
                        case 3:
                                Vsphere(input);
                                break;
                        case 4:
                                Vcylinder(input, input);
                                break;
                }

                // if (input == 1) {
                //         Vrectangle(input, input, input);
                // }else if (input == 2){
                //         Vcube(input);
                // }else if (input == 3){
                //         Vsphere(input);
                // }else if (input == 4){
                //         Vcylinder(input, input);
                // }
        }
        /*
        Formulas
        Rectangle: V = l * w * h;
        Cylinder: V = (Math.PI*Math.pow(radius, 2))* height;
        Sphere: V = 4/3 * (Math.PI* Math.pow(radius, 3));
        Cube: V = Math.pow(length, 3);
        */

        public static void Vrectangle(double length, double width, double height){
                System.out.print("\nEnter the Length : ");
                length = scan.nextDouble();
                
                System.out.print("Enter the Width : ");
                width = scan.nextDouble();
                
                System.out.print("Enter the Height : ");
                height = scan.nextDouble();

                double result = length * width * height;
                System.out.print("\nThe volume of the prism is, " + result + " units cubed.");
        }

        public static void Vcube(double length){
                System.out.print("\nEnter the side length: ");
                length = scan.nextDouble();

                double result = Math.pow(length, 3);
                System.out.println("\nThe volume of the cube is, " + result + " units cubed.");
        }

        public static void Vsphere(double radius){
                System.out.print("\nEnter the Radius: ");
                radius = scan.nextDouble();

                double result = 4.0/3.0 * (Math.PI* Math.pow(radius, 3));
                System.out.println("\nThe volume of the sphere is, " + result + " units cubed.");
        }

        public static void Vcylinder(double radius, double height){
                System.out.print("\nEnter the Radius : ");
                radius = scan.nextDouble();
                
                System.out.print("Enter the Height ");
                height = scan.nextDouble();
                
                double result = (Math.PI*Math.pow(radius, 2))* height;
                System.out.print("\nThe volume of the cylinder is, " + result + " units cubed.");
        }

        /*
        Volume




        Surface Area
        */


        private static void surfaceArea(){
                System.out.println("What object would you like to find the Surface Area of? ");
                System.out.print("1 - Rectangular Prism\n2 - Cube\n3 - Sphere\n4 - Cylinder\nEnter your option: ");
                int input = scan.nextInt();

                switch (input){
                        case 1:
                                SArectangle(input, input, input);
                                break;
                        case 2:
                                SAcube(input);
                                break;
                        case 3:
                                SAsphere(input);
                                break;
                        case 4:
                                SAcylinder(input, input);
                                break;
                }

                // if (input == 1){
                //         SArectangle(input, input, input);
                // }else if (input == 2){
                //         SAcube(input);
                // }else if (input == 3){
                //         SAsphere(input);
                // }else if (input == 4){
                //         SAcylinder(input, input);
                // }
        }

        /*  
        Formulas
        Rectangle: SA = (length * width) + (length * height) + (width * height);
        Cylinder: SA = 2(Math.PI * Math.exp(radius)) + 2(Math.PI * radius * height);
        Sphere: SA = 4(Math.PI * Math.exp(radius));
        Cube: SA = 6(Math.exp(length));
        Other prism: SA = (height * perimeter) + (base * 2);
        */  

        private static void SArectangle(double length, double width, double height) {
                System.out.print("\nEnter the Length : ");
                length = scan.nextDouble();
                
                System.out.print("Enter the Width : ");
                width = scan.nextDouble();
                
                System.out.print("Enter the Height : ");
                height = scan.nextDouble();
                
                double result = 2.0 * (length * width) + 2.0 * (length * height) + 2.0 * (width * height);
                System.out.print("\nThe surface area of the prism is, " + result + " units squared.");
        }

        private static void SAcube(double length) {
                System.out.print("\nEnter the side length: ");
                length = scan.nextDouble();

                double result = 6.0 * (Math.pow(length, 2));
                System.out.println("\nThe surface area of the cube is, " + result + " units squared.");
        }

        private static void SAsphere(double radius) {
                System.out.print("\nEnter the Radius: ");
                radius = scan.nextDouble();

                double result = 4.0 * (Math.PI * Math.pow(radius, 2));
                System.out.println("\nThe surface area of the sphere is, " + result + " units squared.");

        }

        private static void SAcylinder(double radius, double height) {
                System.out.print("\nEnter the Radius : ");
                radius = scan.nextDouble();
                
                System.out.print("Enter the Height ");
                height = scan.nextDouble();
                
                double result = 2.0 * (Math.PI * Math.pow(radius, 2)) + 2.0 * (Math.PI * radius * height);
                System.out.print("\nThe surface area of the cylinder is, " + result + " units squared.");

        }



        


        
}