import java.util.Scanner;

/**
 * This program generates a random number from 1-6 and lets the user try to guess it.
 * 
 * @author Nick P-A
 * @since 2020/2/13 feb 27 2020
 * @version 1.0
 */
 
 
public class Dice {
  static int randomNum;
  static int userGuess;
  static int numOfGuess;
  static int randomInt;
  /**
  * This class generates a random number from 1-6 and lets the user try to guess it.
  */
  

  

 
  public static void main(String[] args) {
    usingMathClass();
  }
 
  /**
   * This class generates a random number from 1-6 and lets the user try to guess it.
  */
  public static void usingMathClass() {
    double randomDouble = Math.random();
    randomDouble = randomDouble * 6 + 1;
    int randomInt = (int) randomDouble;

    Scanner userInput = new Scanner(System.in);
    System.out.print("try to guess the number between 1 and 6: ");
    userGuess = userInput.nextInt();
    
    
    while (userGuess != randomInt) {
      numOfGuess = numOfGuess + 1;
      System.out.print("wrong, guess between 1 and 6: ");
      userGuess = userInput.nextInt();
    }
    
    System.out.println("Correct you guessed " + randomInt + " in " + numOfGuess + " guesses.");
  }
}

  