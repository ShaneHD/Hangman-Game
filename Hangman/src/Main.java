import ga.shane.hangman.Board;
import ga.shane.hangman.HangmanWindow;


/** @author http://www.shane.ga */
public class Main {
	public static void main(String[] args) {
		Board board = new Board("Television");
		HangmanWindow window = new HangmanWindow(board);
	}
}
