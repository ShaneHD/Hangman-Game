import java.io.File;

import javax.swing.UIManager;

import ga.shane.hangman.Board;
import ga.shane.hangman.HangmanWindow;
import ga.shane.hangman.RandomWordPicker;
import ga.shane.utilities.FileUtils;
import ga.shane.utilities.GuiUtils;


/** @author http://www.shane.ga */
public class Main {
	public static void main(String[] args) {
		GuiUtils.setDefaultLookandfeel();
		new RandomWordPicker(new File("words.txt"));
	}
}
