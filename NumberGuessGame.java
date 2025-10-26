import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Random randomNumber = new Random();
int maxAttempts = 10;
int score = 0;
boolean playMore = true;

System.out.println("Welcome to number guessing game!");
while (playMore) {
int number = randomNumber.nextInt(100) + 1;
int attempts = 0;
boolean guessed = false;

System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
while (attempts < maxAttempts && !guessed) {
System.out.print("Enter your guess: ");
int guess = in.nextInt();
attempts++;

if (guess == number) {
System.out.println("You got it! You guessed the number in " + attempts + " attempts!");
score += (maxAttempts - attempts + 1);
guessed = true;
} else if (guess < number) {
System.out.println("That's too low!");
} else {
System.out.println("That's too high!");
}
}

if (!guessed) {
System.out.println("Oops! The number was " + number + ".");
}
System.out.println("Your current score: " + score);
System.out.print("Want to play another round? (yes/no): ");
String answer = in.next();
playMore = answer.equalsIgnoreCase("yes");
}

System.out.println("Game over! Your final score: " + score);
in.close();
}
}