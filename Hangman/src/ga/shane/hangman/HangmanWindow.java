package ga.shane.hangman;

import javax.swing.JFrame;

/** @author http://www.shane.ga */
public class HangmanWindow extends JFrame {
	private final Board game;
	
	public HangmanWindow(Board game) {
		this.game = game;
		
		setup();
		
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setSize(getWidth() * 4, getHeight() * 4);
		setLocationRelativeTo(null);		
	}
	
	private void setup() {
		setTitle(game.wordSize() + " letters");
		
		add(game);
	}
}
