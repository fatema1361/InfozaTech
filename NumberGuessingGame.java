import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int score=0;
        String playAgain;
        
        do{
            int number=random.nextInt(100)+1;
            int attempts=7;
            boolean guessed=false;
            System.out.println("\nWelcome to Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have 7 attempts.");
            while(attempts>0){
                System.out.println("Enter your guess:");
                int guess=input.nextInt();
                if(guess==number){
                    System.out.println("Congratulation!Correct guess.");
                    score++;
                    guessed=true;
                    break;
                }
                else if(guess>number){
                     System.out.println("Too High! Try a lower number.");
                }
                else{
                     System.out.println("Too Low! Try a higher number.");
                }
                attempts--;
                System.out.println("Attempts left:"+attempts);
            }
            if(!guessed){
                System.out.println("\nSorry! You lost.");
                System.out.println("The correct number was: " + number);
            }
            System.out.println("Your current score: " + score);
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = input.next();

        }
        while(playAgain.equalsIgnoreCase("yes"));
        System.out.println("\nGame Over!");
        System.out.println("Your final score: " + score);
        input.close();      
        
    }
}
