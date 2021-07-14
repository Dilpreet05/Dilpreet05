import java.util.Scanner;

public class surfaceArea {
        public static void main(String[] args) {
                
                
                Scanner scan = new Scanner(System.in);
                double length;
                double width;
                double height;
                double radius;
                double perimeter;
                double base;
                
                
                System.out.println("SA calculator\n");
                
              /*  
              
                Formulas
                Rectangle: SA = (length * width) + (length * height) + (width * height)
                Cylinder: SA = 2(Math.PI * Math.exp(radius)) + 2(Math.PI * radius * height)
                Other prism: SA = (height * perimeter) + (base * 2)
                
              */  
              
                System.out.print("What is the shape (rectangular prism (R), Cylinder (C), or Other (O) ) : ");
                String shape = scan.nextLine().toLowerCase();
                
                
                
                if (shape.equals("r")) {
                        
                        System.out.print("\nEnter the Length : ");
                        length = scan.nextDouble();
                        
                        System.out.print("Enter the Width : ");
                        width = scan.nextDouble();
                        
                        System.out.print("Enter the Height : ");
                        height = scan.nextDouble();
                        
                        double result = 2.0 * (length * width) + 2.0 * (length * height) + 2.0 * (width * height);
                        System.out.print("\nThe surface area of the prism is, " + result + " units squared.");
                        
                }
                
                
                
                if (shape.equals("c")) {
                        
                        System.out.print("\nEnter the Radius : ");
                        radius = scan.nextDouble();
                        
                        System.out.print("Enter the Height ");
                        height = scan.nextDouble();
                        
                        double result = 2.0 * (Math.PI * Math.pow(radius, 2)) + 2.0 * (Math.PI * radius * height);
                        System.out.print("\nThe surface area of the cylinder is, " + result + " units squared.");
                        
                }
                
                
                
                if (shape.equals("o")) {
                        
                        System.out.print("\nEnter the Height : ");
                        height = scan.nextDouble();
                        
                        System.out.print("Enter the Perimeter : ");
                        perimeter = scan.nextDouble();
                        
                        System.out.print("Enter area of Base : ");
                        base = scan.nextDouble();
                        
                        double result = (height * perimeter) + (base * 2.0);
                        System.out.print("\nThe surface area of the prism is, " + result + " units squared.");
                        
                }

                scan.close();

        }
}