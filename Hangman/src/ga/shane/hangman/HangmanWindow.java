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
		setSize(getWidth() * 4, getHeight() * 4);
	}
	
	private void setup() {
		setTitle(game.size() + " letters");
		
		for(JLabel label : game.getLabels())
			add(label);
	}
}
