package p0414;

public class p02_누적하기 {
//#2. 누적하기, 합 구하기
	public static void main(String[] args) {
		// 자바는 변수를 필요할 때마다 선언가능, 하지만 맨 앞에 선언하는게 깔끔
		int k38_sum;	//k38_sum 변수선언
		k38_sum = 0;

		// 1부터 100까지 더하기
		for (int k38_i = 1; k38_i < 101; k38_i++) {
			k38_sum = k38_sum + k38_i;
		}
		System.out.printf("#2 : %d\n", k38_sum);

		// 평균 출력
		System.out.printf("#2-2 : %d\n", k38_sum / 100);

		// 배열
		int[] k38_v = { 1, 2, 3, 4, 5 };	//k38_v 배열에 값대입
		int k38_vSum = 0; // 값 초기화

		for (int k38_i = 0; k38_i < 5; k38_i++) {
			k38_vSum = k38_v[k38_i];		//k38_vSum는 k38_v[k38_i]값 대입
		}
		System.out.printf("#2-3 : %d\n", k38_vSum);
	}
}
