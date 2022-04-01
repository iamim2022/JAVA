package basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int input = sc.nextInt();
			System.out.println(input + "th element of the Fibonacci sequence : " + fibonacci(input));
			System.out.println("Elements of the Fibonacci sequence before " + input + " : ");
			System.out.print("{ ");
			for (int i = 1; i < input; i++) {
				System.out.print(fibonacci(i) + " ");
			}
			System.out.println(" }");
		}
	}

	public static int fibonacci(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}