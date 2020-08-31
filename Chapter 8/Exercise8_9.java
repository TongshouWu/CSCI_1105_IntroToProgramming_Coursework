/*
 Author:Tongshou Wu
 Date:08/28/2020
 This program is a Game: play a tic-tac-toe game.
 */
import java.util.Scanner;

public class Exercise8_9 {
	public static void main(String[] args) {
		String[][] board = new String[3][3];
		Scanner input = new Scanner(System.in);
		for (int a = 0; a < board.length; a++)
			for (int b = 0; b < board[a].length; b++)
				board[a][b] = " ";
		while (check(board) == 0) {
			player(board, input);
		}
		
		TheBoard(board);
		System.out.println("The game has ended");
	}
	public static void TheBoard(String[][] board) {
		for (int a = 0; a < board.length; a++) {
			System.out.print("-------------\n");
			for (int b = 0; b < board[a].length; b++) {
				System.out.print("| " + board[a][b] + " ");
			}
			System.out.print("|\n");
		}
		System.out.println("-------------");
	}
	
	public static void player(String[][] board, Scanner input) {
		TheBoard(board);
		int x = 0;
		int y = 0;
		
		do {
			System.out.print("Enter a row (0, 1 or 2) for player X: ");
			x = input.nextInt();
			System.out.print("Enter a column (0, 1 or 2) for player X:");
			y = input.nextInt();
			if (board[y][x].equals("x") || board[y][x].equals("o"))
				System.out.println("Coordinates taken.");
		} while (board[y][x].equals("x") || board[y][x].equals("o"));
		
		board[y][x] = "x";
		
		if (check(board) == 0) {
			TheBoard(board);
			x = 0;
			y = 0;
			
			do {
				System.out.print("Enter a row (0, 1 or 2) for player O:");
				x = input.nextInt();
				System.out.print("Enter a column (0, 1 or 2) for player O:");
				y = input.nextInt();
				if (board[y][x].equals("x") || board[y][x].equals("o"))
					System.out.println("Coordinates taken.");
			} while (board[y][x].equals("x") || board[y][x].equals("o"));
			
			board[y][x] = "o";
		}
	}
	
	public static int check(String[][] board) {
		if (board[0][0] != " " &&
			board[0][1] != " " &&
			board[0][2] != " " &&
			board[1][0] != " " &&
			board[1][1] != " " &&
			board[1][2] != " " &&
			board[2][0] != " " &&
			board[2][1] != " " &&
			board[2][2] != " ") {
			return 1;
		}
		else
			return 0;
	}
}
