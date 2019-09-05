package se.ec.jonatan.second_app;

import java.util.*;

public class Hangman {
	
	private static StringBuilder build = new StringBuilder();
	private static int tries = 0;
	private static String answer = "worwd";
	private static char[] empty = new char[answer.length()];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i=0; i<empty.length; i++) {
			empty[i] = '_';
		}
		while(tries<8) {
			System.out.println(Arrays.toString(empty)+"\n");
			System.out.println("Do you want to guess a letter or the entire word? "
								+ "\nType 1 for letter and 2 for word.");
			String reply = in.nextLine();
			String guess;
			if(reply.equals("1")) {
				System.out.println("\nGuess a letter: ");
				guess = in.nextLine();
				if(build.toString().contains(guess)) {
					System.out.println("You've already guessed that letter");
				}
				else {
					oneLetter(guess.charAt(0), answer);
					System.out.println();
				}
			}
			else if(reply.equals("2")) {
				System.out.println("\nGuess the word: ");
				guess = in.nextLine();
				wholeWord(guess, answer);
				tries++;
			}
			else {
				System.out.println("Wrong entry! Try again.\n");
			}
			if(printArray(empty).equals(answer)) {
				System.out.println("You win!");
				in.close();
				System.exit(0);
			}
		}
		System.out.println("Game over! \nThe word was " + answer);
	}
	
	public static void oneLetter(char guess, String answer) {
		build.append(guess);
		System.out.println("Guesses: " + build.toString());
		for(int i=0; i<answer.length(); i++) {
			if(!answer.contains(Character.toString(guess))) {
				tries++;
				return;
			}
		}
		for(int i=0; i<answer.length(); i++) {
			if(answer.charAt(i)==guess) {
				empty[i] = guess;
			}
		}
	}
	
	public static void wholeWord(String guess, String answer) {
		if(guess.equalsIgnoreCase(answer)) {
			build.replace(0, answer.length(), guess);
		}
		else {
			for(int i=0; i<answer.length(); i++) {
				empty[i] = guess.charAt(i);
			}
		}
	}
	
	public static String printArray(char[] arr) {
		StringBuilder temp = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			temp.append(arr[i]);
		}
		return temp.toString();
	}
}
