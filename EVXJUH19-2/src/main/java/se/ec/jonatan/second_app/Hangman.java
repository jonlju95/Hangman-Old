package se.ec.jonatan.second_app;

import java.util.*;

public class Hangman {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "word";
		char[] empty = new char[answer.length()];
		for(int i=0; i<empty.length; i++) {
			empty[i] = '_';
		}
		for(int i=0; i<8; i++) {
			String guess = in.nextLine();
			if(guess.length()>1) {
				wholeWord(guess, answer);
			}
			else {
				
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