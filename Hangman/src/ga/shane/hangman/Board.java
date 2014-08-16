package ga.shane.hangman;

import ga.shane.utilities.ArrayUtils;

import javax.swing.JLabel;

/** @author http://www.shane.ga */
public class Board {
	private final JLabel[] charLabels;
	private final Character[] chars;
	public final static char UNKNOWN_REPLACE_CHAR = '*';
	
	public Board(String word) {
//		If the word contains a space, exit the program
//		We only want to deal with one word per game
		if(word.contains(" "))
			throw new RuntimeException("Only ONE word per Board!");
		
		charLabels = new JLabel[word.toCharArray().length];
		chars = new Character[charLabels.length];
		
		for(int i = 0; i < chars.length; i++) {
			char cur = word.toCharArray()[i];
			charLabels[i] = new JLabel("" + UNKNOWN_REPLACE_CHAR);
			chars[i] = cur;
		}
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
