package ga.shane.hangman;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/** @author http://www.shane.ga */
public class HangmanWindow extends JFrame {
	private final Board game;
	
	public HangmanWindow(Board game) {
		this.game = game;
		setLayout(new GridLayout(1, game.size()));
		
		setup();
		
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void setup() {
		for(JLabel label : game.getLabels()) {
			
		}
	}
}
