package basic;

import java.util.Scanner;
public class while2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (true) { // while(true) ������ �������� ��� i�� ����.
			System.out.println(i);
			i++;
			if (i>100) {	//i==100 ���� �ϸ� 99������ ��µ�.
				break;
			}
		}
	}
}
