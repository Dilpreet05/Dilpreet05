// ****684344*********
// Student Name: Dilpreet
// Date: 01/22/21
// File Name: Lab12aDecBin.java
// Description - Lab 12a assigned by Mr.Payne.
// *******************
import java.util.Scanner;

public class Lab12aDecBin{
        public static void main (String[] args){
        
                
                Scanner s = new Scanner(System.in);
                int decNum, binNum=1024, input;
                boolean x = true;
                
                while (x) {
                System.out.print("Enter a base 10 number (1-2047): ");
                        input = s.nextInt();
                        decNum = input;
                //
                if (decNum <= 0 ){
                        System.out.print("This is not a decimal number.");
                }
                //
               
               
               
                while (binNum > 0){
                
                        //*****************
                                if (decNum / binNum > 0) {
                                        System.out.print("1");
                                        decNum= decNum-binNum;
                                }else{
                                        System.out.print("0");
                                }
                        //******************
                        
                        binNum=binNum/2;
                        //******************
                        } 
                        //**
                        System.out.print("\nYou entered decimal number " + input + ", in binary the number is " + binNum); 
                        x = false;
                        //**

                        s.close();
                }
        }
}

// System.out.println(binNum);