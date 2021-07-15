public class Exercise50 {
        public static void main(String[] args) {

                System.out.println("Divided by 3 : ");
                for(int i = 0; i <= 100; i++) {
                        if (i%3==0) {
                                System.out.print(i + ", ");
                        }
                }

                System.out.println("\n\nDivided by 5 : ");
                for(int i = 0; i <= 100; i++){
                        if(i%5==0) {
                                System.out.print(i + ", ");
                        }
                }

                System.out.println("\n\nDivided by both 3 and 5 : ");
                for(int i = 0; i <= 100; i++){             
                        if(i%5==0 && i%3==0){
                                System.out.print(i +", ");
                        }
                }

        } 
}