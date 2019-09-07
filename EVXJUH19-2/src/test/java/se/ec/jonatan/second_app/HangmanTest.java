package se.ec.jonatan.second_app;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class HangmanTest {
	Hangman gameTest;
	
	@Before
	public void beforeEach() {
		gameTest = new Hangman();
		gameTest.setAnswer();
		gameTest.setCharArr();
	}
	
	@Test
	public void oneLetter() {
		gameTest.oneLetter('a', gameTest.getAnswer());
	}
	
	@Test
	public void wholeWord() {
		gameTest.wholeWord("java", gameTest.getAnswer());
	}
	
	@Test
	public void printArray() {
		gameTest.printArray(gameTest.getCharArr());
	}
}
