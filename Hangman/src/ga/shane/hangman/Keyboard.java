package ga.shane.hangman;

import ga.shane.hangman.components.Letter;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * A graphical presentation of all letters in the alphabet
 * 
 * @author http://www.shane.ga
 */
public class Keyboard extends JPanel implements ActionListener {
	public Keyboard() {
		setBackground(Color.white);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alphabetChars = alphabet.toCharArray();
		
		GridLayout grid;
		setLayout(grid = new GridLayout(2, 13));
		//grid.setVgap(-310);
		
		for(char letter : alphabetChars)
			add(new Letter(this, letter));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
