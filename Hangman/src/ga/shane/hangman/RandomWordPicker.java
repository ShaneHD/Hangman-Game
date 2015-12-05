package ga.shane.hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import ga.shane.utilities.FileUtils;

/**
 * Pick a random word from a file and launch a hangman game with that word
 * 
 * @author https://www.github.com/ShaneHD
 */
//TODO random word array
public class RandomWordPicker {
	public RandomWordPicker(File file) {
//		Get the words in a list
		ArrayList<String> words = FileUtils.getFileLines(file);
		
		String word = null;
		
		do {
//			Set word to a random word from the list
			word = words.get(new Random().nextInt(words.size()));
		} while(word.contains(" "));
		
//		Create the game
		new HangmanWindow(new Board(word));
	}
}
