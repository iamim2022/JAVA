package p0414;

//�Һ��ڰ� ���ݰ�� 2
public class p08_�Һ��ڰ�_���ݰ��2 {
	public static void main(String[] args) {
		//�ѱ��� ĭ�� ���߷��� �����=> d2coding ��Ʈ ����
		String[] k38_item = {"���� (���)","��ǹ�","�����","���ڼ���","���ı�"};
		int[] k38_price = {1000,2000,30000,2500,1450}; //��ǰ����(�ܰ�)
		int[] k38_amount = {100,2,1,3,5}; //����
		double k38_tax_rate = 0.1;	//�ΰ��� 10%
		int k38_total_sum = 0;
		
		//������ ���
		System.out.printf("===============================================\n");
		System.out.printf("%24s","���ų���\n");
		System.out.printf("-----------------------------------------------\n");	
		System.out.printf("%-5s\t%-7s\t%-5s\t%-5s\t%-5s\n", "", "�׸�","�ܰ�","����","�հ�");
		
		//�迭 ���� ������ֱ�
		for (int i = 0; i < k38_item.length; i++) {
			int k38_sum = k38_price[i] * k38_amount[i]; //1000*100, 2000*2, 3000*1, 2500*3, 1450*5 
			k38_total_sum = k38_total_sum + k38_sum;	//total_sum�� total_sum�� sum�� ���Ѱ����� ��� ���� => �迭 sum���� �� ���� ���� �ȴ�.
				//total_sum = 148750
			//���پ� ����ϰ� \n���� ����
			System.out.printf("%-5s\t%-7s\t%-5s\t%-5s\t%-5s\n", i + 1, k38_item[i], k38_price[i], k38_amount[i],k38_sum);
		}
		
		//������ ���2
		System.out.printf("-----------------------------------------------\n");	
		System.out.printf("���ұݾ� : \t\t\t\t%d\n", k38_total_sum);
		
		//������ ���
		//�Һ��ڰ� = ������ * (1+����) => ��, �ΰ���10%�� ������ �Һ��ڰ��� 110%�� �����̴�.
		//������ = �Һ��ڰ� / (1+����)
		int k38_total_net_price = (int)(k38_total_sum / (1+k38_tax_rate));	//������ => 135227.2727 => 135227
		System.out.printf("�����ݾ� : \t\t\t\t%d\n", k38_total_net_price);	//�����ݾ� = ������ 
		
		//���� ���
		//int���� �Ҽ������ϴ� ����. 
		int k38_tax = k38_total_sum - k38_total_net_price;  // 148750 - 135227 = 13523
		System.out.printf("��    �� : \t\t\t\t%d\n", k38_tax);
		System.out.printf("===============================================\n");
	}

}
