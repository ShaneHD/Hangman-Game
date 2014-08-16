package ga.shane.hangman.components;

import javax.swing.BorderFactory;
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
//		Make it float at the bottom
		setVerticalAlignment(BOTTOM);
//		Give a little bit of space at the bottom
		setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
//		Increase the font size
		setFont(getFont().deriveFont(30f));
	}
}
