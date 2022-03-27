package basic;

public class MultiplicationTable_Good {
//구구단 2~9단 *2부터 출력
	public static void main(String[] args) {
		for(int i =2; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}	
	}
}
