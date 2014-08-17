import ga.shane.hangman.RandomWordPicker;
import ga.shane.utilities.GuiUtils;
import java.io.File;

/** @author http://www.shane.ga */
public class Main {
	public static void main(String[] args) {
		GuiUtils.setDefaultLookandfeel();
		new RandomWordPicker(new File("words.txt"));
	}
}