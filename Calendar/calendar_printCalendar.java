package Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class calendar_printCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);

		System.out.println("====================[" + year + "년 " + month + "월]====================");
		System.out.println("일	월	화	수	목	금	토");

		cal.set(year, month - 1, 1);	// cal에서 month는 0이 1월


		int end = cal.getActualMaximum(Calendar.DATE); 
		int fistDay = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < fistDay; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");
			if (fistDay % 7 == 0) { // 한줄에 7일씩 출력
				System.out.println();
			}
			fistDay++;
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
	}
}
