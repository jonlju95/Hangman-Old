package se.ec.jonatan.second_app;

import java.util.*;

public class HangmanMain {
	public static void main(String[] args) {
		Hangman game = new Hangman();
		Scanner in = new Scanner(System.in);
		game.setAnswer();
		game.setCharArr();
		
		while(game.usedTries()<8) {
			System.out.println(Arrays.toString(game.getCharArr())+"\n");
			System.out.println("Do you want to guess a letter or the entire word? "
								+ "\nType 1 for letter and 2 for word.");
			String reply = in.nextLine();
			String guess;
			if(reply.equals("1")) {
				System.out.print("\nGuess a letter: ");
				guess = in.nextLine();
				if(game.getGuesses().contains(guess)) {
					System.out.println("You've already guessed that letter");
				}
				else {
					game.oneLetter(guess.charAt(0), game.getAnswer());
				}
				game.setGuesses(guess);
				System.out.println("\nGuesses: " + game.getGuesses());
			}
			else if(reply.equals("2")) {
				System.out.print("\nGuess the word: ");
				guess = in.nextLine();
				game.wholeWord(guess, game.getAnswer());
				game.usedTries();
			}
			else {
				System.out.println("Wrong entry! Try again.\n");
			}
			if(game.printArray(game.getCharArr()).equalsIgnoreCase(game.getAnswer())) {
				System.out.println("You win! \nThe word is: " + game.getAnswer());
				in.close();
				System.exit(0);
			}
		}
		System.out.println("Game over! \nThe word was " + game.getAnswer());
	}
}
