package com.github.shanehd.hangman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.shanehd.hangman.components.Hanging;
import com.github.shanehd.hangman.components.Label;
import com.github.shanehd.utilities.ArrayUtils;

/**
 * The board for the game.<br>
 * Contains an array of {@link Character}s (that the word contains),<br>
 * and a list of {@Link Label}s (for their graphical presentation)
 * 
 * @author https://www.github.com/ShaneHD
 */
public class Board extends JPanel {
	//TODO create a separate array for _'s and make the normal char array invisible instead of changing character
	private final Label[] charLabels;
	private final Character[] chars;
	/** The {@link Character} that un-guessed letters will be shown as */
	public final static char UNKNOWN_REPLACE_CHAR = '_';
	/** The word */
	public final String word;
	/** The {@link Hanging} instance */
	public final Hanging hanging;
	/** The key pad ({@link Keyboard}) */
	public final Keyboard keyboard;
	
	public Board(String word) {
		keyboard = new Keyboard(this);
		hanging = new Hanging(this);
//		Make the word UPPER CASE
		word = word.toUpperCase();
		this.word = word;
		
//		If the word contains a space, exit the program
//		We only want to deal with one word per game
		if(word.contains(" "))
			throw new RuntimeException("Only ONE word per Board!");
		
		charLabels = new Label[word.toCharArray().length];
		chars = new Character[charLabels.length];
				
//		Initialise the letters
		for(int i = 0; i < chars.length; i++) {
			char cur = word.toCharArray()[i];
			charLabels[i] = new Label("" + UNKNOWN_REPLACE_CHAR);
			chars[i] = cur;
		}
		
		setLayout(new BorderLayout());
//		Create a panel for the letters to be added
		JPanel board = new JPanel();
		board.setLayout(new GridLayout(1, chars.length));
		board.setBackground(Color.white);
		
		for(JLabel label : charLabels)
			board.add(label);
		
		add(board, BorderLayout.SOUTH);
		
//		And a separate panel for the keyboard to be added to
		JPanel kboard = new JPanel();
		kboard.setBackground(Color.white);
		kboard.add(keyboard);
		add(kboard);
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
	public int wordSize() {
		return chars.length;
	}
	
	/**
	 * Complete the word
	 */
	public void complete() {
		for(int i = 0; i < chars.length; i++)
			charLabels[i].setText("" + chars[i]);
	}
	
	/**
	 * Check if the word contains a character<br>
	 * If it does, make all occurrences of that character visible
	 * @return Does it contain c
	 */
	public boolean checkIfContains(char c) {
//		If the character is inside the word
		if(ArrayUtils.contains(chars, c)) {
//			Make the letter visible
			for(int i = 0; i < chars.length; i++) {
				char cur = chars[i];
				
				if(cur != c)
					continue;
				
				charLabels[i].setText("" + c);
			}			
			
			boolean won = false;
//			Check if the player has won
			for(JLabel label : charLabels) {
				if(label.getText().contains("" + UNKNOWN_REPLACE_CHAR)) {
					won = false;
					break;
				}
				
				won = true;
			}
			
//			If they have, call hanging.won()
			if(won)
				hanging.won();
				
			
			return true;
		}
		
		return false;
	}
}
