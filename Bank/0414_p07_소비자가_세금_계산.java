package p0414;

//�Һ��ڰ� ���ݰ��1
public class p07_�Һ��ڰ�_����_��� {
	//k38_netprice �Լ��� int�� return�ϱ⶧���� void ��� int�� ���´�.
	public static int k38_netprice(int k38_price, double k38_rate) {
		return (int)(k38_price / (1+k38_rate));		//������ ����
	}

	public static void main(String[] args) {
		int k38_price = 1234;		//��ǰ����
		double k38_tax_rate = 0.1;	//���ݺ���

		int k38_netprice = k38_netprice(k38_price, k38_tax_rate);	//�Լ���� �������� ����=> �� �����ؾ���.
		int k38_tax = k38_price - k38_netprice;	//���ݰ��
		
		//���
		System.out.printf("****************************************************\n");
		System.out.printf("%-12s%15s%12s","*","�Һ��ڰ�, ��������, ���� ���","*\n");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("�Һ��ڰ���: %d,    ��������: %d,     ����: %d\n", k38_price, k38_netprice, k38_tax);
		System.out.printf("****************************************************\n");
	}
}
