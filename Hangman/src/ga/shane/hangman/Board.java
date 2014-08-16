package ga.shane.hangman;

import ga.shane.hangman.components.Hanging;
import ga.shane.hangman.components.Label;
import ga.shane.utilities.ArrayUtils;

/**
 * The board for the game.<br>
 * Contains an array of {@link Character}s (that the word contains),<br>
 * and a list of {@Link Label}s (for their graphical presentation)
 * 
 * @author http://www.shane.ga
 */
public class Board {
	//TODO create a separate array for _'s and make the normal char array invisible instead of changing character
	private final Label[] charLabels;
	private final Character[] chars;
	/** The {@link Character} that un-guessed letters will be shown as */
	public final static char UNKNOWN_REPLACE_CHAR = '_';
	/** The word */
	public final String word;
	/** The {@link Hanging} instance */
	public final Hanging hanging = new Hanging();
	
	public Board(String word) {
//		Make the word UPPER CASE
		word = word.toUpperCase();
		this.word = word;
		
//		If the word contains a space, exit the program
//		We only want to deal with one word per game
		if(word.contains(" "))
			throw new RuntimeException("Only ONE word per Board!");
		
		charLabels = new Label[word.toCharArray().length];
		chars = new Character[charLabels.length];
		
		for(int i = 0; i < chars.length; i++) {
			char cur = word.toCharArray()[i];
			charLabels[i] = new Label("" + UNKNOWN_REPLACE_CHAR);
			chars[i] = cur;
		}
	}
	
	/**
	 * @return The {@link Label} array
	 */
	public Label[] getLabels() {
		return charLabels;
	}
	
	/**
	 * Get the size of the word
	 */
	public int size() {
		return chars.length;
	}
	
	/**
	 * Check if the word contains a character<br>
	 * If it does, make all occurrences of that character visible
	 * @return Does it contain c
	 */
	public boolean checkIfContains(char c) {
		if(ArrayUtils.contains(chars, c)) {
			for(int i = 0; i < chars.length; i++) {
				char cur = chars[i];
				
				if(cur != c)
					continue;
				
				charLabels[i].setText("" + c);
			}			
			
			return true;
		}
		
		return false;
	}
}
