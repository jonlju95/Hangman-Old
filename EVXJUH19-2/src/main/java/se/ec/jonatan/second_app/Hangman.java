package se.ec.jonatan.second_app;

import java.util.*;

public class Hangman {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "worwd";
		int tries = 0;
		char[] empty = new char[answer.length()];
		for(int i=0; i<empty.length; i++) {
			empty[i] = '_';
		}
		while(tries<8) {
			System.out.println("Do you want to guess a letter or the entire word? "
								+ "Type 1 for letter and 2 for word.");
			String reply = in.nextLine();
			if(reply.equals("1")) {
				oneLetter('w', answer);
			}
			else if(reply.equals("2")) {
				
			}
			else {
				System.out.println("Wrong entry! Try again.");
			}
		}
	}
	
	public static void oneLetter(char guess, String answer) {
		for(int i=0; i<answer.length(); i++) {
			if(answer.charAt(i)==guess) {
				System.out.println("test");
			}
		}
	}
	
	public static String wholeWord(String guess, String answer) {
		String check = guess;
		if(guess.equalsIgnoreCase(answer)) {
			return "Correct";
		}
		else {
			
		}
		return check;
	}
}
