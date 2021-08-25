package com.syntax.advancedjava;

import java.util.Random;
import java.util.Scanner;

public class TicTacMethods {

	// Method to print gameboard

	public static void printGameBoard(char gameBoard[][]) {

		for (char[] row : gameBoard) {
			for (char column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
	// --------------------

	/*
	 * Method to place a player's sign. If chosen position is already occupied,
	 * going back to the beginning of this method If number is out of range 1 to 9,
	 * print an error and go back to the beginning of this method
	 */

	public static void playersTurnMethod(char gameBoard[][]) {

		if (gameBoard[0][0] != ' ' && gameBoard[0][2] != ' ' && gameBoard[0][4] != ' ' && gameBoard[2][0] != ' '
				&& gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ' && gameBoard[4][0] != ' ' && gameBoard[4][2] != ' '
				&& gameBoard[4][4] != ' ') {
			System.out.println("All positions are occupied. No winner in this game. Game is over!");
			return;
		}
		int playerTurn;
		Scanner scan = new Scanner(System.in);
		System.out.println("Player's turn (number from 1 to 9)");
		playerTurn = scan.nextInt();
		if (playerTurn == 1) {
			if (gameBoard[0][0] == ' ') {
				gameBoard[0][0] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 2) {
			if (gameBoard[0][2] == ' ') {
				gameBoard[0][2] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 3) {
			if (gameBoard[0][4] == ' ') {
				gameBoard[0][4] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 4) {
			if (gameBoard[2][0] == ' ') {
				gameBoard[2][0] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 5) {
			if (gameBoard[2][2] == ' ') {
				gameBoard[2][2] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 6) {
			if (gameBoard[2][4] == ' ') {
				gameBoard[2][4] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 7) {
			if (gameBoard[4][0] == ' ') {
				gameBoard[4][0] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 8) {
			if (gameBoard[4][2] == ' ') {
				gameBoard[4][2] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}
		} else if (playerTurn == 9) {
			if (gameBoard[4][4] == ' ') {
				gameBoard[4][4] = 'X';
			} else {
				System.out.println("This cell is already occupied by computer");
				playersTurnMethod(gameBoard);
			}

		} else {
			System.out.println("Wrong number. Put number from 1 to 9");
			playersTurnMethod(gameBoard);
		}
	}

	/*
	 * Method to place a computer's sign. If random position is already occupied,
	 * error and going back to the beginning of this method
	 */

	public static void computerTurnMethod(char gameBoard[][]) {

		int computerTurn;

		Random rand = new Random();
		computerTurn = rand.nextInt(9) + 1;

		if (computerTurn == 1) {
			if (gameBoard[0][0] == ' ') {
				gameBoard[0][0] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 2) {
			if (gameBoard[0][2] == ' ') {
				gameBoard[0][2] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 3) {
			if (gameBoard[0][4] == ' ') {
				gameBoard[0][4] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 4) {
			if (gameBoard[2][0] == ' ') {
				gameBoard[2][0] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 5) {
			if (gameBoard[2][2] == ' ') {
				gameBoard[2][2] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 6) {
			if (gameBoard[2][4] == ' ') {
				gameBoard[2][4] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 7) {
			if (gameBoard[4][0] == ' ') {
				gameBoard[4][0] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 8) {
			if (gameBoard[4][2] == ' ') {
				gameBoard[4][2] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (computerTurn == 9) {
			if (gameBoard[4][4] == ' ') {
				gameBoard[4][4] = 'O';
				System.out.println("Computer's turn: ");
			} else {
				computerTurnMethod(gameBoard);
			}
		} else if (gameBoard[0][0] != ' ' && gameBoard[0][2] != ' ' && gameBoard[0][4] != ' ' && gameBoard[2][0] != ' '
				&& gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ' && gameBoard[4][0] != ' ' && gameBoard[4][2] != ' '
				&& gameBoard[4][4] != ' ') {
			System.out.println("All positions are occupied. No winner in this game. Game is over!");
		}

	}

	// Method to check if anybody won

	public static boolean winnerCheck(char gameBoard[][]) {

		boolean gameContinues;
		boolean playerWon;
		boolean ComputerWon;

		char win1[] = { gameBoard[0][0], gameBoard[0][2], gameBoard[0][4] };
		char win2[] = { gameBoard[2][0], gameBoard[2][2], gameBoard[2][4] };
		char win3[] = { gameBoard[4][0], gameBoard[4][2], gameBoard[4][4] };
		char win4[] = { gameBoard[0][0], gameBoard[2][0], gameBoard[4][0] };
		char win5[] = { gameBoard[0][2], gameBoard[2][2], gameBoard[4][2] };
		char win6[] = { gameBoard[0][4], gameBoard[2][4], gameBoard[4][4] };
		char win7[] = { gameBoard[0][0], gameBoard[2][2], gameBoard[4][4] };
		char win8[] = { gameBoard[0][4], gameBoard[2][2], gameBoard[4][0] };

		boolean winLine1 = (win1[0] != ' ' && win1[0] == win1[1] && win1[1] == win1[2]);
		boolean winLine2 = (win2[0] != ' ' && win2[0] == win2[1] && win2[1] == win2[2]);
		boolean winLine3 = (win3[0] != ' ' && win3[0] == win3[1] && win3[1] == win3[2]);
		boolean winLine4 = (win4[0] != ' ' && win4[0] == win4[1] && win4[1] == win4[2]);
		boolean winLine5 = (win5[0] != ' ' && win5[0] == win5[1] && win5[1] == win5[2]);
		boolean winLine6 = (win6[0] != ' ' && win6[0] == win6[1] && win6[1] == win6[2]);
		boolean winLine7 = (win7[0] != ' ' && win7[0] == win7[1] && win7[1] == win7[2]);
		boolean winLine8 = (win8[0] != ' ' && win8[0] == win8[1] && win8[1] == win8[2]);

		if ((win1[0] == 'O' && win1[1] == 'O' && win1[2] == 'O') || (win2[0] == 'O' && win2[1] == 'O' && win2[2] == 'O')
				|| (win3[0] == 'O' && win3[1] == 'O' && win3[2] == 'O')
				|| (win4[0] == 'O' && win4[1] == 'O' && win4[2] == 'O')
				|| (win5[0] == 'O' && win5[1] == 'O' && win5[2] == 'O')
				|| (win6[0] == 'O' && win6[1] == 'O' && win6[2] == 'O')
				|| (win7[0] == 'O' && win7[1] == 'O' && win7[2] == 'O')
				|| (win8[0] == 'O' && win8[1] == 'O' && win8[2] == 'O')) {
			ComputerWon = true;
			System.out.println("Computer won!");
		} else if ((win1[0] == 'X' && win1[1] == 'X' && win1[2] == 'X')
				|| (win2[0] == 'X' && win2[1] == 'X' && win2[2] == 'X')
				|| (win3[0] == 'X' && win3[1] == 'X' && win3[2] == 'X')
				|| (win4[0] == 'X' && win4[1] == 'X' && win4[2] == 'X')
				|| (win5[0] == 'X' && win5[1] == 'X' && win5[2] == 'X')
				|| (win6[0] == 'X' && win6[1] == 'X' && win6[2] == 'X')
				|| (win7[0] == 'X' && win7[1] == 'X' && win7[2] == 'X')
				|| (win8[0] == 'X' && win8[1] == 'X' && win8[2] == 'X')) {
			playerWon = true;
			System.out.println("You won!");
		}

		if (winLine1 || winLine2 || winLine3 || winLine4 || winLine5 || winLine6 || winLine7 || winLine8) {
			gameContinues = false;
			System.out.println("Game is over!");
		} else {
			gameContinues = true;
		}

		return gameContinues;
	}

	public static boolean isGameBoardFull(char gameBoard[][]) {
		boolean notFullGameBoard;
		if (gameBoard[0][0] != ' ' && gameBoard[0][2] != ' ' && gameBoard[0][4] != ' ' && gameBoard[2][0] != ' '
				&& gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ' && gameBoard[4][0] != ' ' && gameBoard[4][2] != ' '
				&& gameBoard[4][4] != ' ') {
			notFullGameBoard = false;
			System.out.println("All positions are accupied. Game is over!");
		} else {
			notFullGameBoard = true;
		}
		return notFullGameBoard;

	}
}
