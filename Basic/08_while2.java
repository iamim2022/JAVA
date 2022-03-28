package basic;

import java.util.Scanner;
public class while2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (true) { // while(true) 넣으면 무한으로 계속 i가 증가.
			System.out.println(i);
			i++;
			if (i>100) {	//i==100 으로 하면 99까지만 출력됨.
				break;
			}
		}
	}
}
