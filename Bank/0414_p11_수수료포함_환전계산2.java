package p0414;
//���������� ȯ�����2
//���� ������ ����� �޷��� ȯ��
//(1�޷��� ��ȭ�ݾ� + 1�޷��� ������)�� �Ǽ������� ���
public class p11_����������_ȯ�����2 {

	public static void main(String[] args) {
		int k38_MyWon = 1000000; // ���࿡ 100���� �ְ� �޷��� ȯ���� ��.
		double k38_MoneyEx = 1238.21; // �޷�ȯ��
		double k38_commission = 0.003; // ȯ�� ������ 0.3%

		// ���� ȯ���� �޶� ���� ����

		// ���� ����� ���������� ����� ����ó������.
		// ��ü�ݾ��� ȯ���� ����
		// ȯ���޷�
		int k38_usd = (int) (k38_MyWon / k38_MoneyEx);	//��ȭ �Ѿ�/ȯ��
		double k38_ComPerOne = k38_MoneyEx * k38_commission;	//1�޷��� ������
		double k38_totalcom = k38_usd * k38_ComPerOne;		//�Ѽ�����
		
		//�ռ� �߻��� ������ �Ҽ������� ���� ������ �ø�ó���� �ذ��Ѵ�!
		//������� �޾ƾ��� ���̶� �ø�ó��!
		//double totalcom�� ������ ��ȯ�� ���� �ٸ��� if������ +1�ؼ� �ø� ex) 1238.3 != 1238 => �ø��ؼ� 1239
		//double totalcom�� ������ ��ȯ�� ���� ������ else�� ���� ex) 1238.0 = 1238 =>�״�� 1238
		//����ȯ ���� ������ int i_totalcom ���� ����
		int k38_i_totalcom;
		if (k38_totalcom != (double)((int)k38_totalcom)) {
			k38_i_totalcom = (int)k38_totalcom + 1;
		} else {
			k38_i_totalcom = (int)k38_totalcom;
		}
		
		//�ܾ� ���
		int k38_remain = (int) (k38_MyWon - (k38_usd * k38_MoneyEx) - k38_i_totalcom);
		
		//���
		System.out.printf("=======================================================\n");
		System.out.printf("%29s","������ ����ȯ��\n");
		System.out.printf("-------------------------------------------------------\n");	
		System.out.printf("%-5s%-12d\n%-10s%-15d%-5s%-2f\n", "�� ������(��):",k38_i_totalcom, "=> ��ȭ($): ", k38_usd, "�޷��� ������(��): ",k38_ComPerOne);		
		System.out.printf("======================================================\n");			
		System.out.printf("%-5s%-12d\n%-10s%-7d\n%-5s%-2d\n%-5s%-2d\n", "�� ��ȭȯ���ݾ�(��): ",k38_MyWon, "=> ��ȭ($): ", k38_usd, "=> ������¡��(��): ",k38_i_totalcom, "=> �ܵ�(��): ", k38_remain);		
		System.out.printf("======================================================\n");				
	}
}
