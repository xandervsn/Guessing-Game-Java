package GuessingGame;
import java.util.Scanner;
public class GuessingGame {
  public GuessingGame() {
    boolean playing = true;
    while(playing == true) {
      int guesses = 0;
      int guess = -1;
      int num = (int) (Math.random() * 51);
      System.out.println("A new Guessing Game has started. Good luck!");
      Scanner scanner = new Scanner(System.in);
      while(guess != num) {
        String input = scanner.nextLine();
        if(guess != 0)
          guess = Integer.parseInt(input);
          guesses++;
        if(guess == num) {
          System.out.println("Your guess of " + guess + " was correct! It took you " + guesses + " guesses. Do you want to play again? Type Y for yes and N for no.");
        }else if(guess > num) {
          System.out.println("Your guess was too high. Guess again?");
        }else if(guess < num){System.out.println("Your guess was too low. Guess again?");}
      };
    String answer = scanner.nextLine();
    if(answer.equals("Y")) {
      playing = true;
     }else {
      playing = false;
    }
  }
}
  public static void main(String[] args) {
    new GuessingGame();
  }
}
