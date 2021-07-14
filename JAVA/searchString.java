import java.util.Scanner;

public class searchString {
        public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the string you wish to search : ");
                String input =  scan.nextLine().toUpperCase();


                int letterCount = 0;
                int numCount = 0;
                int spaceCount = 0;
                int otherCount = 0;
                for (int i = input.length() - 1; i >= 0; i--){
                        String x = input.substring(i, i + 1);
                        String letterSet = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
                        String numSet = "1234567890";
                        String spaceSet = " ";
                        String otherSet = "!@#$%^&*()-_=+`~\\/|\'\",.<>[]{};:?";

                        if(letterSet.contains(x)){
                                letterCount++;
                        }else if(numSet.contains(x)){
                                numCount++;
                        }else if(spaceSet.contains(x)){
                                spaceCount++;
                        }else if(otherSet.contains(x)){
                                otherCount++;
                        }
                }               
                //
                System.out.println("\nThere are");
                System.out.printf("Letters : %d\n", letterCount );
                System.out.printf("Numbers : %d\n", numCount );
                System.out.printf("Spaces : %d\n", spaceCount );
                System.out.printf("Other: %d\n", otherCount );
                //
        }
}
