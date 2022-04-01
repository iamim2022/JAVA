package multiplicationTables;

import java.util.Scanner;

public class multiplicationTables_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of multiplication table: ");
		int input = sc.nextInt();
		multiplicationT(input);
	}

	public static void multiplicationT(int a) {
		if (a >= 2 && a <= 9) {
			for (int i = a; i <= a; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
			}
		} else {
			System.out.println("Error!");
		}
	}
}