package p0414;

//�ܼ�ȯ�� ���
public class p09_�ܼ�ȯ����� {
	public static void main(String[] args) {
		int k38_MyWon = 1000000; // ���࿡ 100���� �ְ� �޷��� ȯ���� ��.
		double k38_MoneyEx = 1238.21; // �޷�ȯ��
		double k38_commission = 0.003; // ȯ�� ������ 0.3%

		// ���� ȯ���� �޷� ���� ����

		// ���� ����� ���������� ����� ����ó������.=> int�� 1���ڸ� ���� ����!
		// ��ü�ݾ��� ȯ���� ����
		int k38_usd = (int) (k38_MyWon /k38_MoneyEx);
		int k38_remain = (int) (k38_MyWon - (k38_usd * k38_MoneyEx));	//�������� ���� ( ) ǥ��

		//���
		System.out.printf("========================================================\n");
		System.out.printf("%29s","������ ���� ���\n");
		System.out.printf("--------------------------------------------------------\n");	
		System.out.printf("%-5s%-10d\n%-5s%-33d%-5s%-1d\n", "�� ��ȭȯ���ݾ�(��):",k38_MyWon, "=> ��ȭ($): ", k38_usd, "�ܵ� : ",k38_remain);		
		System.out.printf("========================================================\n");		
	}
}
