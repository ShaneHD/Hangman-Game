package ga.shane.hangman.components;

import javax.swing.JLabel;

/**
 * A {@link JLabel} that's suited for this game
 * 
 * @see {@link JLabel}
 * @author https://www.github.com/ShaneHD
 */
public class Label extends JLabel {
	public Label(String s) {
		super(s);
		
//		Make it center aligned
		setHorizontalAlignment(CENTER);
//		Make it float at the bottom
		setVerticalAlignment(BOTTOM);
//		Increase the font size
		setFont(getFont().deriveFont(30f));
	}
}
