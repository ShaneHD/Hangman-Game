package ga.shane.hangman;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/** @author http://www.shane.ga */
public class HangmanWindow extends JFrame {
	private final Board game;
	
	public HangmanWindow(final Board game) {
		this.game = game;
		setLayout(new GridLayout(2, 1));
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				game.hanging.nextStage();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			
		});
		
		setup();
		
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);				
	}
	
	private void setup() {
		setTitle(game.wordSize() + " letters");
		getContentPane().setBackground(Color.white);
		game.setBackground(Color.white);
		
		add(game);
		add(game.hanging);
	}
}
