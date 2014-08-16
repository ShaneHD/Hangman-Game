package ga.shane.hangman.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/** @author http://www.shane.ga */
public class Hanging extends JLabel {
	/** The stage in which the hanging currently is (7 is dead) */
	public int stage = -1;
	/** Is the poor man dead? */
	public boolean dead;
	
	public Hanging() {
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
		if(stage == 6)
			dead = true;
		
//		Increment the stage
		stage++;
//		Set the picture
		setIcon(new ImageIcon("images/stages/" + stage + ".gif"));
	}
}
