package basetodec;
import java.util.Scanner;

public class calculator {

        static Scanner scan = new Scanner(System.in);
        public static void welcome(){
                System.out.println("--- Welcome ---");
        }

        public static void calculation(){

                System.out.print("\n\nEnter the base you would like to use (2-9): ");
                int base = scan.nextInt();
                System.out.print("Enter the number you want to convert to decimal : ");
                int baseNum = scan.nextInt();


                        if (base == 2){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1;
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }
                                        y*=2;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);

                        }else if (base == 3){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }
                                        y*=3;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);
                        
                        }else if (base == 4){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }else if (baseNums[temp.length() - z] == 3){
                                                decNum+=y*3;
                                        }
                                        y*=4;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);
                        
                        }else if (base == 5){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }else if (baseNums[temp.length() - z] == 3){
                                                decNum+=y*3;
                                        }else if (baseNums[temp.length() - z] == 4){
                                                decNum+=y*4;
                                        }
                                        y*=5;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);
                        
                        }else if (base == 6){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }else if (baseNums[temp.length() - z] == 3){
                                                decNum+=y*3;
                                        }else if (baseNums[temp.length() - z] == 4){
                                                decNum+=y*4;
                                        }else if (baseNums[temp.length() - z] == 5){
                                                decNum+=y*5;
                                        }
                                        y*=6;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);
                        
                        }else if (base == 7){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }else if (baseNums[temp.length() - z] == 3){
                                                decNum+=y*3;
                                        }else if (baseNums[temp.length() - z] == 4){
                                                decNum+=y*4;
                                        }else if (baseNums[temp.length() - z] == 5){
                                                decNum+=y*5;
                                        }else if (baseNums[temp.length() - z] == 6){
                                                decNum+=y*6;
                                        }else if (baseNums[temp.length() - z] == 7){
                                                decNum+=y*7;
                                        }
                                        y*=7;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);
                        
                        }else if (base == 8){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }else if (baseNums[temp.length() - z] == 3){
                                                decNum+=y*3;
                                        }else if (baseNums[temp.length() - z] == 4){
                                                decNum+=y*4;
                                        }else if (baseNums[temp.length() - z] == 5){
                                                decNum+=y*5;
                                        }else if (baseNums[temp.length() - z] == 6){
                                                decNum+=y*6;
                                        }else if (baseNums[temp.length() - z] == 7){
                                                decNum+=y*7;
                                        }
                                        y*=8;
                                        z++;
                                        baseNum/=10;
                                }
                                System.out.print("The decimal number is : " + decNum);
                
                        }else if (base == 9){
                                String temp = Long.toString(baseNum);    
                                int[] baseNums = new int[temp.length()];
                                for (int i = 0; i < temp.length(); i++) {
                                baseNums[i] = temp.charAt(i) - '0';
                                }
                                int decNum = 0;
                                int y = 1;
                                int z = 1; 
                                while(baseNum > 0){              
                                        if (baseNums[temp.length() - z] == 1) {
                                                decNum+=y;
                                        }else if (baseNums[temp.length() - z] == 2) {
                                                decNum+=y*2;
                                        }else if (baseNums[temp.length() - z] == 3){
                                                decNum+=y*3;
                                        }else if (baseNums[temp.length() - z] == 4){
                                                decNum+=y*4;
                                        }else if (baseNums[temp.length() - z] == 5){
                                                decNum+=y*5;
                                        }else if (baseNums[temp.length() - z] == 6){
                                                decNum+=y*6;
                                        }else if (baseNums[temp.length() - z] == 7){
                                                decNum+=y*7;
                                        }else if (baseNums[temp.length() - z] == 8){
                                                decNum+=y*8;
                                        }
                                        y*=9;
                                        z++;
                                        baseNum/=10;   
                                } 
                                System.out.print("The decimal number is : " + decNum);                    
                        }



                        // ----------------------
                                

        }



}
