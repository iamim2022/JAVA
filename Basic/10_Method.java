package basic;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Method main = new Method();
		main.showMenu();
		int input = sc.nextInt();

		nameCall(input);
	}

	public void showMenu() {
		System.out.println("#Printing a Name");
		System.out.println("Enter the number : ");
		System.out.println("1.Player 1");
		System.out.println("2.Player 2");
		System.out.println("3.Player 3");
		System.out.println("4.Player 4");
	}

	public static void nameCall(int inputNum) {
		if (inputNum == 1) {
			System.out.println("Jhon");
		} else if (inputNum == 2) {
			System.out.println("Kate");
		} else if (inputNum == 3) {
			System.out.println("Bobby");
		} else if (inputNum == 4) {
			System.out.println("Lose");
		} else {
			System.out.println("Check the Number.");
		}
	}
}
