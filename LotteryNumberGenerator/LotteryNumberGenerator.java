package Lottery_number_Generator;

public class LotteryNumberGenerator {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45) + 1;
			System.out.println(random);
		}
	}
}
