package ga.shane.hangman.components;

import ga.shane.hangman.Keyboard;
import ga.shane.utilities.gui.BJButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

/**
 * A {@link BJButton} with a letter from the alphabet in it
 * 
 * @see {@link Keyboard}
 * @author http://www.shane.ga
 */
public class Letter extends BJButton {	
	public final char letter;
	
	public Letter(Keyboard keyboard, char letter) {
		super("" + letter);

		this.letter = letter;
		
		addActionListener(keyboard);
		setBackground(new Color(0, 0, 0, .5f));
		setOpaque(true);
//		Increase the font's size
		setFont(getFont().deriveFont(60f));
		
//		Align to the center
		setHorizontalAlignment(CENTER);
//		Float at the top
		setVerticalAlignment(TOP);
//		Add a space at the top
		setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
	}
}
