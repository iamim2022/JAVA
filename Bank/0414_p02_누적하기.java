package p0414;

public class p02_�����ϱ� {
//#2. �����ϱ�, �� ���ϱ�
	public static void main(String[] args) {
		// �ڹٴ� ������ �ʿ��� ������ ���𰡴�, ������ �� �տ� �����ϴ°� ���
		int k38_sum;	//k38_sum ��������
		k38_sum = 0;

		// 1���� 100���� ���ϱ�
		for (int k38_i = 1; k38_i < 101; k38_i++) {
			k38_sum = k38_sum + k38_i;
		}
		System.out.printf("#2 : %d\n", k38_sum);

		// ��� ���
		System.out.printf("#2-2 : %d\n", k38_sum / 100);

		// �迭
		int[] k38_v = { 1, 2, 3, 4, 5 };	//k38_v �迭�� ������
		int k38_vSum = 0; // �� �ʱ�ȭ

		for (int k38_i = 0; k38_i < 5; k38_i++) {
			k38_vSum = k38_v[k38_i];		//k38_vSum�� k38_v[k38_i]�� ����
		}
		System.out.printf("#2-3 : %d\n", k38_vSum);
	}
}
