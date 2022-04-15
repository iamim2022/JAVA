package p0414;

public class p06_�ܼ����ݰ�� {
//�ܼ����ݰ��
	// �Լ�����
	public static int k38_taxcal(int k38_val, int k38_rate) {
		int k38_ret;

		//�Ҽ������� ������� double������ ����ȯ�ؼ� ���. 100.0�� ���� �ƶ�.
		//double�� ��� ���� int�� ��� ���� ������ if ����� k38_ret ���
		//�ٸ��� else ����� k38_ret ���
		// 100 + 1�� �ϴ� ���� : �Ҽ��� ���ϰ��� ������ �ø��ϱ� �����̴�.
		if (((double) k38_val * (double) k38_rate / 100.0) == k38_val * k38_rate / 100) {
			k38_ret = k38_val * k38_rate / 100;		//����� �׳� / 100�̴�!!
		} else {	//k38_val, k38_rate�� �Ǽ������� ����� ���� ���������� ����� ���� �ٸ��� �ø�ó��!
			k38_ret = k38_val * k38_rate / 100 + 1;	
		}
		return k38_ret;		//�Լ� k38_taxcal�� k38_ret���� ����
	}
	
	// ����
	public static void main(String[] args) {
		int k38_val = 271; // ���� ���ǰ�
		int k38_rate = 3; // ���� 3%

		//�Լ��� static�̶� new ���� �ٷ� �Լ�����
		//static�� �ƴ϶�� k38_taxcal aa = new k38_taxcal �ؼ� ���������� aa�� ����߾����.
		int tax = k38_taxcal(k38_val, k38_rate);

		//������
		System.out.printf("**********************************************\n");
		System.out.printf("*                �ܼ� ���ݰ��               *\n");
		System.out.printf("���� ���ݰ��: %f\n", k38_val * k38_rate / 100.0);
		
		// �ϳ��� double�� �����ϸ� �Ǽ��� ǥ��
		System.out.printf("��������: %d    ����:%d      �����԰���: %d\n", k38_val, tax, k38_val + tax);
		System.out.printf("**********************************************\n");
	}
}
