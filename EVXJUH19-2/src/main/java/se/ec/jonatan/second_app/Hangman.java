package se.ec.jonatan.second_app;

import java.util.*;

public class Hangman {
	
	static StringBuilder build = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "worwd";
		int tries = 0;
		char[] empty = new char[answer.length()];
		for(int i=0; i<empty.length; i++) {
			empty[i] = '_';
			build.append(empty[i]);
		}
		while(tries<8) {
			System.out.println("Do you want to guess a letter or the entire word? "
								+ "\nType 1 for letter and 2 for word.");
			String reply = in.nextLine();
			String guess;
			if(reply.equals("1")) {
				System.out.println("\nGuess a letter: ");
				guess = in.nextLine();
				oneLetter(guess.charAt(0), answer);
				tries++;
				System.out.println(build.toString());
			}
			else if(reply.equals("2")) {
				
			}
			else {
				System.out.println("Wrong entry! Try again.\n");
			}
		}
		if(build.toString().equals(answer)) {
			System.out.println("You win!");
		}
		else {
			System.out.println("Game over");
		}
		
	}
	
	public static void oneLetter(char guess, String answer) {
		for(int i=0; i<answer.length(); i++) {
			if(answer.charAt(i)==guess) {
				build.setCharAt(i, guess);
			}
		}
	}
	
	public static void wholeWord(String guess, String answer) {
		if(guess.equalsIgnoreCase(answer)) {
		}
		else {
			
		}
	}
}
