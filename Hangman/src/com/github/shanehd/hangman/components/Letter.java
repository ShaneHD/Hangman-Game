package com.github.shanehd.hangman.components;

import java.awt.Color;

import javax.swing.BorderFactory;

import com.github.shanehd.hangman.Keyboard;
import com.github.shanehd.utilities.gui.BJButton;

/**
 * A {@link BJButton} with a letter from the alphabet in it
 * 
 * @see {@link Keyboard}
 * @author https://www.github.com/ShaneHD
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
