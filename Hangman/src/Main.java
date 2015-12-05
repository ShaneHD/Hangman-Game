import java.io.File;

import com.github.shanehd.hangman.RandomWordPicker;
import com.github.shanehd.utilities.GuiUtils;

/** @author https://www.github.com/ShaneHD */
public class Main {
	public static void main(String[] args) {
		GuiUtils.setDefaultLookandfeel();
		new RandomWordPicker(new File("words.txt"));
	}
}
