/*
 * Agatha Turyahikayo 
 * Kunal Dharmadhikari
 * 11/13/15 
 * Period 7
 * PigGame.java
 *
 * uses a Pair of dice to play a game between the computer and a player
 * player goes first, rolling from a pair of dice
 * if they roll a 1, they lose their turn
 * if they roll 2 1's, they lose all their points and their turn
 * they can continue as long as those conditions are true
 * then the computer goes
 * if they roll a 1, they lose their turn
 * if they roll 2 1's, they lose all their points and their turn
 * they can continue as long as those conditions are true, and the computer's score cant go above 20
 * uses methods from pair of dice
 */

import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		// variables
		PairOfDice d1 = new PairOfDice();
		int totalValue = d1.getTotalValue(), roundScore = 0, playerScore = 0, computerScore = 0, sentinel = 0;
		boolean winner = false, playerTurn = true;

		// scanner
		Scanner scan = new Scanner(System.in);

		while (winner == false) {
			while (playerTurn == true) {

				d1.roll();
				System.out.println("You have rolled a " + d1);
				totalValue = d1.getTotalValue();
				if (totalValue == 2) {
					System.out.println("You lose all of your points because you rolled 2 1's.");
					System.out.println("Now it's the computer's turn");
					System.out.println("-------------------------------------------");
					playerTurn = false;
					playerScore = 0;
					roundScore = 0;
				}

				else if (d1.getFaceValue1() == 1 || d1.getFaceValue2() == 1) {
					playerScore += roundScore;
					System.out.println("The player score is " + playerScore);
					roundScore = 0;
					playerTurn = false;
					System.out.println("The roundscore is " + roundScore);
					System.out.println("You lost your turn because you rolled a 1");
					System.out.println("-------------------------------------------");
				}

				else {
					roundScore += d1.getTotalValue();
					System.out.println("The round score is " + roundScore);
					System.out.println("-------------------------------------------");

				}

				if (playerScore + roundScore >= 50) {
					playerTurn = false;
					winner = true;
					playerScore = playerScore + roundScore;
					System.out.println("Your score is " + playerScore);
					System.out.println("You are the winner ");
					System.out.println("-------------------------------------------");
				}

				else if (playerTurn == true) {
					System.out.println("If you'd like to continue enter a 1, enter a 0 if you wish to quit");
					System.out.println("-------------------------------------------");
					sentinel = scan.nextInt();
				}

				if (sentinel == 0) {
					playerTurn = false;
					playerScore += roundScore;
					System.out.println("The player score is " + playerScore);
					System.out.println("-------------------------------------------");
					roundScore = 0;
				}
			}// end of players turn
			while (playerTurn == false && !winner) {
				d1.roll();
				System.out.println("The computer has rolled a " + d1);
				System.out.println("-------------------------------------------");

				if (d1.getTotalValue() == 2) {
					playerTurn = true;
					computerScore = 0;
					roundScore = 0;
					System.out.println("Computer score is now 0");
					System.out.println("Computer lost its turn");
					System.out.println("-------------------------------------------");
				}

				else if (d1.getFaceValue1() == 1 || d1.getFaceValue2() == 1) {
					roundScore = 0;
					playerTurn = true;
					System.out.println("It's now the players turn");
					System.out.println("The computer lost their turn because they rolled a 1");
					System.out.println("-------------------------------------------");
				}// end of computer's turn

				else
					roundScore += d1.getTotalValue();
				System.out.println("The round score is " + roundScore);
				System.out.println("-------------------------------------------");
				if (computerScore + roundScore >= 50) {
					winner = true;
					computerScore += roundScore;
					System.out.println("The computer score is " + computerScore);
					System.out.println("Computer is the winner!");
					System.out
							.println("-------------------------------------------");
				} else if (roundScore >= 20) {
					playerTurn = true;
					computerScore += roundScore;
					System.out.println("The computer score is " + computerScore);
					System.out.println("-------------------------------------------");
					roundScore = 0;
					playerTurn = true;
				}// end of the game
			}// end of computers turn

		}// end loop

	}// end main
}// end PigGame
