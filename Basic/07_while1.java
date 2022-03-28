package basic;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (i <= 10) { // while(true) 넣으면 무한으로 계속 i가 증가
			System.out.println(i);
			i++;
		}
	}
}
