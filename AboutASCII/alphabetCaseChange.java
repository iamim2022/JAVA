package ASCIInWords;

import java.util.Scanner;

public class alphabetCaseChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.nextLine();
		char[] chars = null;
		chars = text.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 65 && chars[i] <= 90) {	//if Uppercase

				chars[i] += 32;
			} else if (chars[i] >= 97 && chars[i] <= 122) {	//if Lowercase
				chars[i] -= 32;
			}
		}
		System.out.println(chars);
	}
}
