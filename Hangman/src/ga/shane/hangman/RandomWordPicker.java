package ga.shane.hangman;

import ga.shane.utilities.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * Pick a random word from a file and launch a hangman game with that word
 * 
 * @author http://www.shane.ga
 */
public class RandomWordPicker {
	public RandomWordPicker(File file) {
//		Get the words in a list
		ArrayList<String> words = FileUtils.getLinesFromFile(file);
		String word = null;
		
		do {
//			Set word to a random word from the list
			word = words.get(new Random().nextInt(words.size()));
		} while(word.contains(" "));
		
//		Create the game
		new HangmanWindow(new Board(word));
	}
}
