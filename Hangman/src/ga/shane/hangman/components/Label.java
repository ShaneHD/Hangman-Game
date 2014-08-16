package ga.shane.hangman.components;

import javax.swing.JLabel;

/**
 * A {@link JLabel} that's suited for this game
 * 
 * @see {@link JLabel}
 * @author http://www.shane.ga
 */
public class Label extends JLabel {
	public Label(String s) {
		super(s);
		
//		Make it center aligned
		setHorizontalAlignment(CENTER);
//		Make it float at the top
		setVerticalAlignment(TOP);
//		Increase the font size
		setFont(getFont().deriveFont(30f));
	}
}
