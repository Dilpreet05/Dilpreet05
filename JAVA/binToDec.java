import java.util.Scanner;

public class binToDec {
        public static void main(String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter a binary number : ");
                long binNum = scan.nextLong();

                String temp = Long.toString(binNum);
                int[] binNums = new int[temp.length()];
                for (int i = 0; i < temp.length(); i++) {
                    binNums[i] = temp.charAt(i) - '0';
                }

                
                int decNum = 0;
                int y = 1;
                int z = 1;
                while(binNum > 0){
                        if (binNums[temp.length() - z] == 1) {
                                decNum+=y;
                        }
                        y*=2;
                        z++;
                        binNum/=10;
                }
                
                System.out.print(decNum);
        }
}
