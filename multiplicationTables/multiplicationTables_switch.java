package multiplicationTables;

import java.util.Scanner;

public class multiplicationTables_switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int j;

		System.out.print("What number do you want?");
		i = scanner.nextInt();

		switch (i) {
		case 1:
			System.out.println("Please enter a number from 2 to 9");
			break;

		case 2:
			while (i == 2) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;

		case 3:
			while (i == 3) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;

		case 4:
			while (i == 4) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;

		case 5:
			while (i == 5) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;

			}
			break;

		case 6:
			while (i == 6) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;

		case 7:
			while (i == 7) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;

		case 8:
			while (i == 8) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;

		case 9:
			while (i == 9) {
				j = 1;
				while (j <= 9) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					j++;
				}
				i++;
			}
			break;
		default:
			System.out.println("Please enter a number from 2 to 9");
			break;
		}
	}
}