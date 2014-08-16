package ga.shane.hangman.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/** @author http://www.shane.ga */
public class Hanging extends JLabel {
	/** The stage in which the hanging currently is (7 is dead) */
	public int stage = -1;
	
	public Hanging() {
		nextStage();
		
		setHorizontalAlignment(CENTER);
	}
	
	/**
	 * Move on to the next stage of the hanging
	 */
	public void nextStage() {
		stage++;
		setIcon(new ImageIcon("images/stages/" + stage + ".gif"));
	}
}
