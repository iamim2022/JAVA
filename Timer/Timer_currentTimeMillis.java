package Timer;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Timer_currentTimeMillis {
	public static void main(String[] args) {
		calTime();
	}

	public static void calTime() {
		long start = System.currentTimeMillis();
		System.out.print("Now : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(start));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seconds you want to add : ");
		long inputNum = sc.nextInt();
		System.out.println("");

		long upToTime = start + (inputNum * 1000);
		System.out.println("Must be entered by this time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(upToTime));

		long end = System.currentTimeMillis();
		System.out.print("Now : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(end));

		System.out.println("Time taken to enter a number : " + (end - start) / 1000.0 + " seconds\n");

		if ((end - start) / 1000.0 > (upToTime - start) / 1000.0) {
			System.out.println("Time is over");
			System.out.println("current time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(end));
		} else if ((end - start) / 1000.0 <= (upToTime - start) / 1000.0) {
			try {
				Thread.sleep(inputNum * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Time is over");
			System.out.println("current time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(upToTime));
			System.out.println("");
		}
	}
}