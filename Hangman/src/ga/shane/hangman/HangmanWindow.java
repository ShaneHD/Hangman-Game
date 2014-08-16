package ga.shane.hangman;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * The {@link JFrame} for this game
 * 
 * @author http://www.shane.ga
 */
public class HangmanWindow extends JFrame {
	private final Board game;
	
	public HangmanWindow(Board game) {
		this.game = game;
		GridLayout layout;
		setLayout(layout = new GridLayout(2, 1));
		
		setup();
		
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);				
	}
	
	/**
	 * Setup the window
	 */
	private void setup() {
		setTitle(game.wordSize() + " letters");
		getContentPane().setBackground(Color.white);
		game.setBackground(Color.white);
		
//		Add the various game components
		add(game);
		add(game.hanging);
	}
}
