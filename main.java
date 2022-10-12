import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random RanNum = new Random();
    int RanNumInt = RanNum.nextInt(100);
    int NumGuess;

    do{
    Scanner NumGuessIn = new Scanner(System.in);
    System.out.print("Please guess a number between 0-100: ");
    NumGuess = NumGuessIn.nextInt();

      if(NumGuess != RanNumInt) {
      System.out.println("Guess again");
      }
        if(NumGuess > RanNumInt) {
        System.out.println("Your guess is too high!");
          }
          if(RanNumInt > NumGuess) {
        System.out.println("Your guess is too low!");
          }
      if(NumGuess == RanNumInt){
        System.out.println("Congrats you guessed right!");
      }
    } while(NumGuess != RanNumInt);
  }
}
