package Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calendar_dateDifference {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===��¥�Է¿���:20200203===");
		System.out.println("���۳���� �Է� : ");
		String date1 = sc.nextLine();
		System.out.println("�񱳳���� �Է� : ");
		String date2 = sc.nextLine();

		Date format1 = new SimpleDateFormat("yyyyMMdd").parse(date1);	//Date ��¥����ȯ
		Date format2 = new SimpleDateFormat("yyyyMMdd").parse(date2);

		long diffSec = (format2.getTime() - format1.getTime()) / 1000; 
		long diffMin = (format2.getTime() - format1.getTime()) / 60000; 
		long diffHor = (format2.getTime() - format1.getTime()) / 3600000;
		long diffDays = diffSec / (24 * 60 * 60); // ���ڼ� ����(��*��*��)
		
		System.out.println("");
		System.out.println("---�񱳰��---");
		System.out.println(diffSec + "�� ����");
		System.out.println(diffMin + "�� ����");
		System.out.println(diffHor + "�� ����");
		System.out.println(diffDays + "�� ����");
	}
}