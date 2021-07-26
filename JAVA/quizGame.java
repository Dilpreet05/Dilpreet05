import java.util.Scanner;

public class quizGame {
        public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                System.out.println("-- Welcome to the Game! --\n");

                System.out.print("Would you like to play? ");
                String playing = scan.nextLine().toLowerCase();

                if (playing.equals("no")){
                        System.exit(0);
                }
                int totalCorrect = 0;
                String answer = "";
                System.out.println("Alright! Let's get started!");
                System.out.println("This game will be Capitals Trivia!");   


                System.out.println("\n\nQuestion 1:\nWhat is the capital of Great Brittan?");
                answer = scan.nextLine().toLowerCase();
                if(answer.equals("london")){totalCorrect++; System.out.println("Correct!");}else{System.out.println("Incorrect!");}


                System.out.println("\nQuestion 2:\nWhat is the capital of France?");
                answer = scan.nextLine().toLowerCase();
                if(answer.equals("paris")){totalCorrect++; System.out.println("Correct!");}else{System.out.println("Incorrect!");}
                

                System.out.println("\nQuestion 3:\nWhat is the capital of Germany?");
                answer = scan.nextLine().toLowerCase();
                if(answer.equals("berlin")){totalCorrect++; System.out.println("Correct!");}else{System.out.println("Incorrect!");}

                System.out.println("\nQuestion 4:\nWhat is the capital of Italy?");
                answer = scan.nextLine().toLowerCase();
                if(answer.equals("rome")){totalCorrect++; System.out.println("Correct!");}else{System.out.println("Incorrect!");}


                System.out.println("\nQuestion 4:\nWhat is the capital of Japan?");
                answer = scan.nextLine().toLowerCase();
                if(answer.equals("tokyo")){totalCorrect++; System.out.println("Correct!");}else{System.out.println("Incorrect!");}

                System.out.println("\nyou got a total of " + totalCorrect + " answers correct!");
                int totalPercentCorrect = totalCorrect*100/5; 
                System.out.println(totalPercentCorrect + "% of the questions correct!");

                

        }
}
