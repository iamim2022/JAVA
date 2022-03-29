package multiplicationTables;

import java.util.Scanner;

public class multiplicationTables_if_for {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		if (num >= 2 && num <= 9) {
			for (int i = num; i <= num; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "X" + j + "=" + i * j);
				}
			}
		} else {
			System.out.println("Please enter a number from 2 to 9.");
		}
	}
}
