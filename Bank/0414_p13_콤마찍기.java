package p0414;

import java.text.DecimalFormat;

public class p13_�޸���� {

	public static void main(String[] args) {
		int k38_MyWon = 1000000; // ���࿡ 100���� �ְ� �޷��� ȯ���� ��.
		double k38_MoneyEx = 1238.21; // �޷�ȯ��
		double k38_commission = 0.003; // ȯ�� ������ 0.3%

		// ���� ȯ���� �޶� ���� ����
		double k38_ComPerOne = k38_MoneyEx * k38_commission;	//1�޷��� ������
		
		//*************ȯ�������� �ٽɺ� 1 ***********
		// ���� ����� ���������� ����� ����ó������.
		// ��ü�ݾ��� (ȯ��+1�޷� �� ������)�� ����
		// ȯ���޷�
		int k38_usd = (int) (k38_MyWon / (k38_MoneyEx + k38_ComPerOne));  //(k38_MoneyEx + k38_ComPerOne)�� �߰��ߴ�!
		double k38_totalcom = k38_usd * k38_ComPerOne;		//�Ѽ�����
		
		//*************ȯ�������� �ٽɺ� 2 ***********
		//������� �޾ƾ��� ���̶� �ø�ó��! => int ���� Ȱ��
		//double totalcom�� ������ ������ ���� �ٸ��� if������ +1�ؼ� �ø� ex) 1238.3 != 1238 => �ø��ؼ� 1239
		//double totalcom�� ������ ������ ���� ������ else�� ���� ex) 1238.0 = 1238 =>�״�� 1238
		//����ȯ ���� ������ int k38_i_totalcom ���� ����
		int k38_i_totalcom;
		if (k38_totalcom != (double)((int)k38_totalcom)) {
			k38_i_totalcom = (int)k38_totalcom + 1;
		} else {
			k38_i_totalcom = (int)k38_totalcom;
		}
	
		//DecimalFormat Ŭ���� ���
		//DecimalFormat Ŭ������ int, double ���� ���ڸ� printf�� ����� �� %s �� �Է¹���.
		DecimalFormat k38_df = new DecimalFormat ("###,###,###,###,###");	//DecimalFormat �ν��Ͻ�ȭ
				
		//�ܾ� ���
		int k38_remain = (int) (k38_MyWon - (k38_usd * k38_MoneyEx) - k38_i_totalcom);	
		
		//���
		//DecimalFormat Ŭ���� �������, %d ������ ��� %s�� ����
		System.out.printf("=======================================================\n");
		System.out.printf("%29s","������ ����ȯ��\n");
		System.out.printf("-------------------------------------------------------\n");	
		System.out.printf("%-5s%-12d\n%-10s%-15d%-5s%-2f\n", "�� ������(��):",k38_i_totalcom, "=> ��ȭ($): ", k38_usd, "�޷��� ������(��): ",k38_ComPerOne);		
		System.out.printf("======================================================\n");			
		System.out.printf("%-5s%-12s\n%-10s%-7s\n%-5s%-2s\n%-5s%-2s\n", "�� ��ȭȯ���ݾ�(��): ", k38_df.format(k38_MyWon), "=> ��ȭ($): ", k38_df.format(k38_usd), "=> ������¡��(��): ",k38_df.format(k38_i_totalcom), "=> �ܵ�(��): ",k38_df.format(k38_remain));		
		System.out.printf("======================================================\n");		
	}
}
