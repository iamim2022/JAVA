package basic;

import java.util.Arrays;
import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		printArr_sort();
	}

	public static void printArr_sort() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("ex) 5");
			int inputNum = sc.nextInt();		
			System.out.println("ex) 1 3 4 7 8");
			sc.nextLine();
			int[] inputArr = new int[inputNum];		

			String str = sc.nextLine();
			String[] strArr = str.split(" ");

			try {
				for (int i = 0; i < strArr.length; i++) {
					inputArr[i] = Integer.parseInt(strArr[i]);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("error");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("error");
				e.printStackTrace();
			}

			Arrays.sort(inputArr);
			for (int n : inputArr) {
				System.out.println(n + " ");
			}
			break;
		}
	}
}