package ga.shane.hangman.components;

import ga.shane.hangman.Board;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The picture of hanging man<br>
 * Also contains stage handling and such
 * 
 * @see {@link JLabel}
 * @author https://www.github.com/ShaneHD
 */
public class Hanging extends JLabel {
	/** The stage in which the hanging currently is (7 is dead) */
	public int stage = -1;
	/** Is the poor man dead? */
	public boolean dead;
	private final Board game;
	
	public Hanging(Board board) {
		game = board;
		nextStage();
		
		setHorizontalAlignment(CENTER);
	}
	
	/**
	 * Move on to the next stage of the hanging
	 */
	public void nextStage() {		
//		If he's dead, there's no more stages to go to
//		So gtfo
		if(dead)
			return;
		
//		If the next stage is death, set dead
		if(stage == 6) {
			dead = true;
			finished();
			game.complete();
		}
		
//		Increment the stage
		stage++;
//		Set the picture
		setIcon("" + stage);
	}
	
	/**
	 * The game is over (called whenever the player wins/loses)
	 */
	private void finished() {
		game.keyboard.removeAll();
		game.keyboard.revalidate();
		game.keyboard.repaint();
	}
	
	private void setIcon(String s) {
		setIcon(new ImageIcon("images/stages/" + s + ".gif"));
	}
	
	/**
	 * Called when the player has won the game
	 * @see {@link Board#checkIfContains(char)}
	 */
	public void won() {
		setIcon("fin");
		finished();
	}
}
