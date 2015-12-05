package com.github.shanehd.hangman;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.github.shanehd.hangman.components.Letter;
import com.github.shanehd.utilities.StringUtils;

/**
 * A graphical presentation of all letters in the alphabet
 * 
 * @author https://www.github.com/ShaneHD
 */
public class Keyboard extends JPanel implements ActionListener {
	private final Board game;
	
	public Keyboard(Board board) {
		game = board;
		setBackground(Color.white);
		char[] alphabet = StringUtils.ALPHABET.toCharArray();
		
		setLayout(new GridLayout(2, 13));
		
//		For each of the letters in the alphabet
		for(char letter : alphabet)
//			Add a new Letter with its value
			add(new Letter(this, letter));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Get the typed letter
		char typed = e.getActionCommand().charAt(0);
		
//		If the letter isn't in the word, continue preppin' the hangin'
		if(!game.checkIfContains(typed))
			game.hanging.nextStage();
		
//		Remove the letter from the keyboard
		remove((Letter) e.getSource());
		
//		Refresh the keyboard so that it doesn't glitch out
		revalidate();
		repaint();
	}
}
