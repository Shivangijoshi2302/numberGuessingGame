import java.util.Scanner;
import java.util.Random;
public class first{
    public static void main(String[]args){
        Scanner reader= new Scanner(System.in);
        String play = "yes";
     //loop to know we want to play the game
     while(play.equals("yes")) {
        Random ran = new Random();
        int ranNum = ran.nextInt(100);
        int guess = -1;
        int tries = 0;

        // loop to see whether game is over
        while(guess != ranNum)
        {
            System.out.println("Guess the number between 1 to 100:");
            guess =reader.nextInt();
            tries++;

            if(guess == ranNum){
                System.out.println("Amazing, you guessed the number right");
                System.out.println("Congrats!! It took you "+ tries +" Guesses.");
                System.out.println("Would you love to play again? Yes or No");
                play = reader.next().toLowerCase();
            }
            else if(guess > ranNum){
                System.out.println(" Invalid greater value, Try Again! ");
            }
            else{
                System.out.println(" Invalid lower value, Try Again! ");
            }
        }
     }

     reader.close();
    }
}