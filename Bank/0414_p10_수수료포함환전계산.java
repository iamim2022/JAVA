package p0414;

//������ ���� ȯ�� ���
public class p10_����������ȯ����� {

	public static void main(String[] args) {
		int k38_MyWon = 1000000; // ���࿡ 100���� �ְ� �޷��� ȯ���� ��.
		double k38_MoneyEx = 1238.21; // �޷�ȯ��
		double k38_commission = 0.003; // ȯ�� ������ 0.3%

		// ���� ȯ���� �޶� ���� ����

		// ���� ����� ���������� ����� ����ó������.
		// ��ü�ݾ��� ȯ���� ����
		int k38_usd = (int) (k38_MyWon /k38_MoneyEx);
		int k38_remain = (int) (k38_MyWon - k38_usd * k38_MoneyEx);

		double k38_ComPerOne = k38_MoneyEx * k38_commission;	//1�޷��� ������
		double k38_totalcom = k38_usd * k38_ComPerOne;			
		
		System.out.printf("=======================================================\n");
		System.out.printf("%29s","������ ���\n");
		System.out.printf("-------------------------------------------------------\n");	
		System.out.printf("%-5s%-12f\n%-10s%-14d%-5s%-2f\n", "�� ������(��):",k38_totalcom, "=> ��ȭ($): ", k38_usd, "�޷��� ������(��) : ",k38_ComPerOne);		
		System.out.printf("=======================================================\n");	
	}
}
//�޷��� �����ᰡ [�޷��� ������ : 3.714630]�� ��µǴ� �����߻�
//���࿡���� ������ 0.714630�� ���� �� ����.