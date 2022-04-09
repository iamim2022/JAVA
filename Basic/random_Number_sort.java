package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class S5_random{

	public static void main(String[] args) {
		ArrayList<Integer> random = new ArrayList<Integer>();
		
		Random ran = new Random();
		
		for (int i = 0; i < 10; i++) {
			int num = ran.nextInt(100);
			//System.out.println(num);
			random.add(i, num);
		}
		
		System.out.println("오리지널 : ");
		System.out.println(random);
		
		Collections.sort(random);
		System.out.println("오름차순 : ");
		System.out.println(random);
		
		Collections.reverse(random);
		System.out.println("내림차순 : ");
		System.out.println(random);
	}
}