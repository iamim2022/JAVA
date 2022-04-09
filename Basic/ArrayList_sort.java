package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str;

		for (int i = 1; i < 6; i++) {
			System.out.println("Enter the number : ");
			str = sc.nextLine(); 
			data.add(str);
		}

		Collections.sort(data);
		System.out.println(data);
	}
}
