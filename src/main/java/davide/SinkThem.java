package davide;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class SinkThem {
	static public final char SHIP = 'S';
	static public final char WRECK = 'W';
	static public final char MISS = 'M';
	static public final char EMPTY = '_';
	static public final char UNKNOWN = '?';

	static public final int POINTS_FOR_SINK = 5;
	static public final int POINTS_FOR_MISS = 1;

	/** the battlefield */
	private char[][] board;
	/** ships on board */
	private int counter;
	/** current player score */
	private int points;

	/**
	 * Create the squared board game filled with EMPTY cells
	 * 
	 * @param dimension board size
	 */
	public SinkThem(int dimension) {
		board = new char[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	/**
	 * @return the current score
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return true if no more ships
	 */
	public boolean done() {
		if (counter == 0) {
			return true;
		}
		return false;
	}

	/**
	 * The board is a square
	 * 
	 * @return board size
	 */
	public int getBoardSize() {

		return board.length;
	}

	/**
	 * A user representation for the board
	 * 
	 * Only MISS and WRECK should be shown
	 * 
	 * UNKWNOWN should hide EMPTY and SHIP
	 * 
	 * @return a string
	 */
	public String getBoard() {
		String s = new String();
		s = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == WRECK || board[i][j] == MISS) {
					s = s + " " + " " + board[i][j];
				} else
					s = s + " " + " "+ UNKNOWN;
			}
			s = s + "\n\n";
		}
		return s;
	}

	/**
	 * Place a ship on the board
	 * 
	 * @param row
	 * @param col
	 * @return false if it can't be placed
	 */
	public boolean place(int row, int col) {
		
		if(board[row][col]==SHIP) {
			while(board[row][col]==SHIP) {
				Random generator = new Random();
				row = generator.nextInt(board.length);
				col = generator.nextInt(board.length);
			}
		}
		if (row < board.length && col < board.length && board[row][col]!= SHIP) {
			board[row][col] = SHIP;
		}
		return false;
	}

	/**
	 * Shoot to a cell
	 * 
	 * a miss would cost POINTS_FOR_MISS, a center would give POINTS_FOR_SINK
	 * 
	 * @param row
	 * @param col
	 * @return true for a sink
	 */
	public boolean shoot(int row, int col) {
		if (board[row][col] == SHIP) {
			board[row][col] = WRECK;
			points = points + POINTS_FOR_SINK;
			counter--;
			return true;
		}
		if (board[row][col] == EMPTY) {
			board[row][col] = MISS;
			points = points - POINTS_FOR_MISS;
		}
		return false;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(board);
	}

	/**
	 * Apply a simple strategy to the game
	 * 
	 * @param st the game
	 */
//	public static void shootAll(SinkThem st) {
//		for (int i = 0; i < st.getBoardSize(); i++) {
//			for (int j = 0; j < st.getBoardSize(); j++) {
//				System.out.println(st.getBoard());
//				if (st.shoot(i, j)) {
//					System.out.println("Hit!");
//					if (st.done()) {
//						System.out.println("You win!");
//						return;
//					}
//				} else {
//					System.out.println("Miss ...");
//				}
//			}
//		}
//	}

	public static void main(String[] args) {
		// use Scanner for user interaction
		try(Scanner scan = new Scanner(System.in)){

		System.out.println("Introduci la dimensione della mappa:");
		String d = scan.next();

		//  let the player choose for a (sensible) board size
		SinkThem st = new SinkThem(Integer.parseInt(d));

		//  place the ships randomly 
		Random generator = new Random();
		for (int i = 0; i < 3; i++) {
			st.place(generator.nextInt(Integer.parseInt(d)), generator.nextInt(Integer.parseInt(d)));
		}
		st.counter = 3;
		//  use Scanner 
		System.out.println(st.getBoard());
		while (!st.done()) {

			System.out.println("se vuoi uscire scrivi: E \n \n Inserisci il numero della riga da colpire:");
			String riga = scan.next(); 

			if (riga.charAt(0) == 'E') {
				break;
			}

			System.out.println("Inserisci il numero della colonna da colpire:");
			String colonna = scan.next(); 
			st.shoot(Integer.parseInt(riga), Integer.parseInt(colonna));
			if (st.shoot(Integer.parseInt(riga), Integer.parseInt(colonna))) {
				System.out.println("Hit!");
				System.out.println(st.getBoard());
				if (st.done()) {
					System.out.println("You win!");
					break;
				}
			} else {
				System.out.println("Miss ...");
				System.out.println(st.getBoard());
			}

		}
		System.out.println(st);
		System.out.println("You scored " + st.getPoints());
		}

	}
}
