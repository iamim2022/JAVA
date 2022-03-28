package basic;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while ( i <= 0);
	}
}
