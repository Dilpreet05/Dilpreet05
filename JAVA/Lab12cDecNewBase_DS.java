// ******684344******
// Student Name: Dilpreet Singh
// Date: 2/3/21
// File Name: Lab12cDecNewBase_DS.java
// Description - converting base ten number in to base 2-9
// *******************
import java.util.Scanner;

public class Lab12cDecNewBase_DS {
        public static void main (String[] args) {
                
                //***** Initalizing and Declaring **** //
                        Scanner scan = new Scanner(System.in);                  // New Scanner object named scan
                        int decimalNum, generalNum = 1, baseNum;                // declaring generalNum and initalizing baseNum and decimalNum
                //************************************ //
                //
                //***** First User Input ***** //
                        
                        System.out.print("Enter a base from 2-9: ");                            // Prompt that is prints out for the user to input what base they want to convery to
                                baseNum=scan.nextInt();
                                
                        System.out.print("Enter a base ten number between 0 and 2048: ");       // Prompt that is prints out for the user to input a decimal number that they would like to convert
                                decimalNum=scan.nextInt();                        
                        
                //**************************** //
                //
                //***** Output 1 ***** //
                
                        if (baseNum > 1 && baseNum < 10) {              // checks if the base that the user inputed is converable by the program, if it is then the output of the conversion will print
                        
                                System.out.print("You entered decimal number " + decimalNum + ", in base " + baseNum + ", the number is "); 
                                
                        
                
                //******************** //
                //
                //***** Output for binary ***** //
                                                
                                if (baseNum == 2) {                                             // checks if the user inputed base is base 2 
                                                
                                        while (generalNum <= decimalNum/2) {
                                        generalNum=generalNum*2;
                                        }
                                                
                                                
                                                
                                        while (generalNum > 0){                                 // starts a loop that, if the number that will be converted is less then or equal to 0 will stop looping,
                                                                                                        // -this loop is duplicated on all other converters
                                                if (decimalNum / generalNum > 0) {              // an if statement that converts the decimal number into binary/base 2
                                                        System.out.print("1");
                                                        decimalNum= decimalNum-generalNum;
                                                        
                                                }else{
                                                        System.out.print("0");
                                                        
                                                }    
                                                                                                                           
                                                generalNum=generalNum/2;                        // apart of the conversion from decimal to binary/base 2
                                                
                                                }
                                        }
                        
                //***************************** //
                //
                //***** Output for base 3 ***** //
                
                                if (baseNum == 3) {                                             // checks if the user inputed base is base 3
                                
                                        while (generalNum <= decimalNum/3) {
                                        generalNum=generalNum*3;
                                        }
                                        
                                        
                                        
                                        while  (generalNum > 0) {                               
                                                
                                                if (decimalNum / generalNum == 0) {
                                                        System.out.print("0");
                                                
                                                }else if (decimalNum / generalNum == 1) {       // an if statement that converts the decimal number into base 3
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                        
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }
                                                
                                                generalNum=generalNum/3;                        // apart of the conversion from decimal to base 3
                                                
                                        }
                                }
                //***************************** //
                //
                //***** Output for base 4 ***** //
                
                                if (baseNum == 4) {                                             // checks if the user inputed base is base 4
                                
                                        while (generalNum <= decimalNum/4) {
                                        generalNum=generalNum*4;
                                        }
                                        
                                        
                                        
                                        while (generalNum > 0) {                                
                                                
                                                if (decimalNum / generalNum == 0) {             // an if statement that converts the decimal number into base 4
                                                        System.out.print("0");
                                                        
                                                }else if (decimalNum / generalNum == 1) {
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                        
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }else if (decimalNum / generalNum == 3) {
                                                        System.out.print("3");
                                                        decimalNum=decimalNum-(generalNum*3);
                                                        
                                                }
                                                
                                                generalNum=generalNum/4;                        // apart of the conversion from decimal to base 4
                                                
                                                
                                        }
                                }
                //***************************** //
                //
                //***** Output for base 5 ***** //
                                
                                if (baseNum == 5) {                                             // checks if the user inputed base is base 5
                                
                                        while (generalNum <= decimalNum/5) {
                                        generalNum=generalNum*5;
                                        }
                                        
                                        
                                        
                                        while (generalNum > 0) {                                
                                                
                                                if (decimalNum / generalNum == 0) {             // an if statement that converts the decimal number into base 5
                                                        System.out.print("0");
                                                
                                                }else if (decimalNum / generalNum == 1) {
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }else if (decimalNum / generalNum == 3) {
                                                        System.out.print("3");
                                                        decimalNum=decimalNum-(generalNum*3);
                                                        
                                                }else if (decimalNum / generalNum == 4) {
                                                        System.out.print("4");
                                                        decimalNum=decimalNum-(generalNum*4);
                                                        
                                                }
                                                
                                                
                                                
                                        generalNum=generalNum/5;                                // apart of the conversion from decimal to binary/base 5
                                        }

                                }
                //***************************** //
                //
                //***** Output for base 6 ***** //
                                
                                if (baseNum == 6) {                                             // checks if the user inputed base is base 6
                                
                                        while (generalNum <= decimalNum/6) {
                                        generalNum=generalNum*6;
                                        }
                                        
                                        
                                        
                                        while (generalNum > 0) {                                
                                                
                                                if (decimalNum / generalNum == 0) {             // an if statement that converts the decimal number into base 6
                                                        System.out.print("0");
                                                
                                                }else if (decimalNum / generalNum == 1) {
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }else if (decimalNum / generalNum == 3) {
                                                        System.out.print("3");
                                                        decimalNum=decimalNum-(generalNum*3);
                                                        
                                                }else if (decimalNum / generalNum == 4) {
                                                        System.out.print("4");
                                                        decimalNum=decimalNum-(generalNum*4);
                                                        
                                                }else if (decimalNum / generalNum == 5) {
                                                        System.out.print("5");
                                                        decimalNum=decimalNum-(generalNum*5);
                                                        
                                                }
                                                
                                                
                                                
                                        generalNum=generalNum/6;                                // apart of the conversion from decimal to binary/base 6
                                        }

                                }
                //***************************** //
                //
                //***** Output for base 7 ***** //
                                
                                if (baseNum == 7) {                                             // checks if the user inputed base is base 7
                                
                                        while (generalNum <= decimalNum/7) {
                                        generalNum=generalNum*7;
                                        }
                                        
                                        
                                        
                                        while (generalNum > 0) {                                
                                                
                                                if (decimalNum / generalNum == 0) {             // an if statement that converts the decimal number into base 7
                                                        System.out.print("0");
                                                
                                                }else if (decimalNum / generalNum == 1) {
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }else if (decimalNum / generalNum == 3) {
                                                        System.out.print("3");
                                                        decimalNum=decimalNum-(generalNum*3);
                                                        
                                                }else if (decimalNum / generalNum == 4) {
                                                        System.out.print("4");
                                                        decimalNum=decimalNum-(generalNum*4);
                                                        
                                                }else if (decimalNum / generalNum == 5) {
                                                        System.out.print("5");
                                                        decimalNum=decimalNum-(generalNum*5);
                                                        
                                                }else if (decimalNum / generalNum == 6) {
                                                        System.out.print("6");
                                                        decimalNum=decimalNum-(generalNum*6);
                                                        
                                                }
                                                
                                                
                                                
                                        generalNum=generalNum/7;                                // apart of the conversion from decimal to binary/base 7
                                        }

                                }
                //***************************** //
                //
                //***** Output for Octal. ***** //
                                
                                if (baseNum == 8) {                                             // checks if the user inputed base is base 8
                                
                                        while (generalNum <= decimalNum/8) {
                                        generalNum=generalNum*8;
                                        }
                                        
                                        
                                        
                                        while (generalNum > 0) {                                
                                                
                                                if (decimalNum / generalNum == 0) {             // an if statement that converts the decimal number into base 8
                                                        System.out.print("0");
                                                
                                                }else if (decimalNum / generalNum == 1) {
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }else if (decimalNum / generalNum == 3) {
                                                        System.out.print("3");
                                                        decimalNum=decimalNum-(generalNum*3);
                                                        
                                                }else if (decimalNum / generalNum == 4) {
                                                        System.out.print("4");
                                                        decimalNum=decimalNum-(generalNum*4);
                                                        
                                                }else if (decimalNum / generalNum == 5) {
                                                        System.out.print("5");
                                                        decimalNum=decimalNum-(generalNum*5);
                                                        
                                                }else if (decimalNum / generalNum == 6) {
                                                        System.out.print("6");
                                                        decimalNum=decimalNum-(generalNum*6);
                                                        
                                                }else if (decimalNum / generalNum == 7) {
                                                        System.out.print("7");
                                                        decimalNum=decimalNum-(generalNum*7);
                                                        
                                                }
                                                
                                                
                                                
                                        generalNum=generalNum/8;                                // apart of the conversion from decimal to base 8
                                        }

                                }
                //***************************** //
                //
                //***** Output for base 9 ***** //
                                
                                if (baseNum == 9) {                                             // checks if the user inputed base is base 9
                                
                                        while (generalNum <= decimalNum/9) {
                                        generalNum=generalNum*9;
                                        }
                                        
                                        
                                        
                                        while (generalNum > 0) {                                
                                                
                                                if (decimalNum / generalNum == 0) {             // an if statement that converts the decimal number into binary/base 9
                                                        System.out.print("0");
                                                
                                                }else if (decimalNum / generalNum == 1) {
                                                        System.out.print("1");
                                                        decimalNum=decimalNum-generalNum;
                                                
                                                }else if (decimalNum / generalNum == 2) {
                                                        System.out.print("2");
                                                        decimalNum=decimalNum-(generalNum*2);
                                                        
                                                }else if (decimalNum / generalNum == 3) {
                                                        System.out.print("3");
                                                        decimalNum=decimalNum-(generalNum*3);
                                                        
                                                }else if (decimalNum / generalNum == 4) {
                                                        System.out.print("4");
                                                        decimalNum=decimalNum-(generalNum*4);
                                                        
                                                }else if (decimalNum / generalNum == 5) {
                                                        System.out.print("5");
                                                        decimalNum=decimalNum-(generalNum*5);
                                                        
                                                }else if (decimalNum / generalNum == 6) {
                                                        System.out.print("6");
                                                        decimalNum=decimalNum-(generalNum*6);
                                                        
                                                }else if (decimalNum / generalNum == 7) {
                                                        System.out.print("7");
                                                        decimalNum=decimalNum-(generalNum*7);
                                                        
                                                }else if (decimalNum / generalNum == 8) {
                                                        System.out.print("8");
                                                        decimalNum=decimalNum-(generalNum*8);
                                                        
                                                }
                                                
                                                
                                                
                                        generalNum=generalNum/9;                                // apart of the conversion from decimal to base 9
                                        }

                                }
                //***************************** //

                                scan.close();
                        }
        }
}