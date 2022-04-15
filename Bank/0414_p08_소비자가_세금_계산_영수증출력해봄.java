package p0414;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//�Һ��ڰ� ���ݰ�� 2
public class p08_�Һ��ڰ�_����_���_����������غ� {
	public static void main(String[] args) {
		//�ѱ��� ĭ�� ���߷��� �����=> d2coding ��Ʈ ����
		String[] k38_item = {"���� (���)","��ǹ�","�����","���ڼ���","���ı�"};
		int[] k38_price = {1000,2000,30000,2500,1450}; //��ǰ����(�ܰ�)
		int[] k38_amount = {100,2,1,3,5}; //����
		double k38_tax_rate = 0.1;	//�ΰ��� 10%
		int k38_total_sum = 0;
		
		//������ ���
		System.out.printf("=================================================================\n");
		System.out.printf("%33s","���ų���\n");
		System.out.printf("-----------------------------------------------------------------\n");	
		System.out.printf("%-5s\t%-14s\t%-8s\t%-5s\t%-5s\n", "", "�׸�","�ܰ�(��)","����","�հ�(��)");

		//DecimalFormat Ŭ���� ���
		//DecimalFormat Ŭ������ int, double ���� ���ڸ� printf�� ����� �� %s �� �Է¹���.
		DecimalFormat k38_df = new DecimalFormat ("###,###,###,###,###");	//DecimalFormat �ν��Ͻ�ȭ		
		
		//�迭 ���� ������ֱ�
		for (int i = 0; i < k38_item.length; i++) {
			int k38_sum = k38_price[i] * k38_amount[i]; //1000*100, 2000*2, 3000*1, 2500*3, 1450*5 
			k38_total_sum = k38_total_sum + k38_sum;	//k38_total_sum�� k38_total_sum�� sum�� ���Ѱ����� ��� ���� => �迭 sum���� �� ���� ���� �ȴ�.
				//k38_total_sum = 148750
			//���پ� ����ϰ� \n���� ����
			System.out.printf("%-5s\t%-13s\t%-8s\t%-5s\t%-5s\n", i + 1, k38_item[i], k38_df.format(k38_price[i]), k38_df.format(k38_amount[i]), k38_df.format(k38_sum));
		}
		
		//������ ���2
		System.out.printf("-----------------------------------------------------------------\n");		
		System.out.printf("���ұݾ� : \t\t\t\t\t%15s\n",k38_df.format(k38_total_sum));
		
		//������ ���
		//�Һ��ڰ� = ������ * (1+����) => ��, �ΰ���10%�� ������ �Һ��ڰ��� 110%�� �����̴�.
		//������ = �Һ��ڰ� / (1+����)
		int k38_total_net_price = (int)(k38_total_sum / (1+k38_tax_rate));	//������ => 135227.2727 => 135227
		System.out.printf("�����ݾ� : \t\t\t\t\t%15s\n", k38_df.format(k38_total_net_price));	//�����ݾ� = ������ 
		
		//���� ���
		//int���� �Ҽ������ϴ� ����. 
		int k38_tax = k38_total_sum - k38_total_net_price;  // 148750 - 135227 = 13523
		System.out.printf("��    �� : \t\t\t\t\t%15s\n", k38_df.format(k38_tax));
		System.out.printf("=================================================================\n");
		
		//��¥ �� �ð� ��� CalendarŬ����, SimpleDateFormatŬ���� Ȱ��
		Calendar k38_cal = Calendar.getInstance();		//Calendar Ŭ���� �ν��Ͻ�ȭ�ؼ� ��밡���ϰ� ����.
		SimpleDateFormat k38_sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		//System.out.printf("��������ð� : %s\n", sdt.format(cal.getTime()));	//getTime()�� ���� ��¥,�ð� ���
		System.out.printf("%37s%3s\n", "��������½ð� : ",	k38_sdt.format(k38_cal.getTime()));
		System.out.printf("=================================================================\n");
	}
}
