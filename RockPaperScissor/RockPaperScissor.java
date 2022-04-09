package RockPaperScissor;

import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		RockPaperScissor();
	}

	public static void RockPaperScissor() {
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		while (exit == 0) {
			int randomNum = (int) (Math.random() * 3);
			System.out.println("0: Rock, 1: Paper, 2: Scissor");
			System.out.print("Enter the number : ");
			int input = sc.nextInt();

			if (input == 0 || input == 1 || input == 2) {
				if (randomNum == 0) {
					System.out.println("Computer : Rock");
				} else if (randomNum == 1) {
					System.out.println("Computer : Paper");
				} else if (randomNum == 2) {
					System.out.println("Computer : Scissor");
				}

				if (input == 0) {
					System.out.println("Player : Rock");
				} else if (input == 1) {
					System.out.println("Player : Paper");
				} else if (input == 2) {
					System.out.println("Player : Scissor");
				}

				if ((randomNum == 0 && input == 1) || (randomNum == 1 && input == 2)
						|| (randomNum == 2 && input == 0)) {
					System.out.println("Player wins!\n");
				} else if ((randomNum == 0 && input == 2) || (randomNum == 1 && input == 0)
						|| (randomNum == 2 && input == 1)) {
					System.out.println("Computer wins!\n");
				} else if (randomNum == input) {
					System.out.println("Player and computer draw.\n");
				}
			} else {
				System.out.println("Check the number.\n");
				System.out.println("");
				continue;
			}

			int continueChoice = 0;
			while (continueChoice == 0) {
				System.out.println("Do you want continue the game?");
				System.out.println("1: YES , 2: NO");
				System.out.print("Enter the number : ");
				int choice = sc.nextInt();

				if (choice == 1) {
					exit = 0;
					continueChoice++;
				} else if (choice == 2) {
					exit = 1;
					continueChoice++;
					System.out.println("Bye Bye~");
				} else {
					System.out.println("Check the number!");
					System.out.println("");
					continue;
				}
				System.out.println("");
			}
		}
	}
} // class
