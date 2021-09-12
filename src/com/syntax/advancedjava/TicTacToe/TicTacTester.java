package com.syntax.advancedjava.TicTacToe;

import java.util.Scanner;

public class TicTacTester {

	public static void main(String[] args) {

		char gameBoard[][] = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};

		TicTacMethods board = new TicTacMethods();

		// 1) Print board using method:

		boolean startgame=false;
		String whoIsFirst="";

		do {

			Scanner scan = new Scanner(System.in);
			System.out.println("Who is going first: player or computer?");
			whoIsFirst = scan.next();
			if (whoIsFirst.equalsIgnoreCase("player") || whoIsFirst.equalsIgnoreCase("computer")) {
				startgame = true;
			} else {
				System.out.println("Wrong player choice input. Try again");
			}

		} while (startgame == false);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Who is going first: player or computer?");
//		whoIsFirst = scan.next();
//		if (whoIsFirst.equalsIgnoreCase("player") || whoIsFirst.equalsIgnoreCase("computer")) {
//			startgame = true;
//		}


		if (whoIsFirst.equalsIgnoreCase("player")) {

			board.printGameBoard(gameBoard);

			board.playersTurnMethod(gameBoard);

			board.printGameBoard(gameBoard);

			do {

				if (!board.isGameBoardFull(gameBoard)) {
					break;
				}

				board.computerTurnMethod(gameBoard);

				board.printGameBoard(gameBoard);

				if (!board.winnerCheck(gameBoard)) {
					break;
				}

				// board.winnerCheck(gameBoard);

				board.playersTurnMethod(gameBoard);

				board.printGameBoard(gameBoard);

			} while (board.winnerCheck(gameBoard));

		} else {
			do {

				board.printGameBoard(gameBoard);

				if (!board.isGameBoardFull(gameBoard)) {
					break;
				}

				board.computerTurnMethod(gameBoard);

				board.printGameBoard(gameBoard);

				if (!board.winnerCheck(gameBoard)) {
					break;
				}

				// board.winnerCheck(gameBoard);

				board.playersTurnMethod(gameBoard);

				board.printGameBoard(gameBoard);

			} while (board.winnerCheck(gameBoard));

		}
	}
}
