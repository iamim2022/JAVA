package p0414;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p15_Ķ����Ŭ����_SimpleDataFormat���� {

	public static void main(String[] args) {
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		System.out.printf("��������ð� : %s\n", sdt.format(calt.getTime()));
		System.out.printf("************************************************\n");
		
	}

}
