package java02_operator;

public class BinaryEx_01 {

	public static void main(String[] args) {
		
		// ���׿����� - ���
		// + - * / %
		//---------------------------------------------------------
		
		int num1 = 17, num2 = 4; //�ǿ�����
		
		int result; //���� ��� ���� ����
		
		result = num1 + num2;
//		result = 17 + 4; //������ �� Ȱ��
//		result = 21; //���� ����
		// -> result ������ 21���� ����
		
		System.out.println("���� ��� : " + result);
		System.out.println(num1 + "�� " + num2 +"�� �հ� : " + result);
		
		System.out.println("------------");
		
		// %
		// ������ ������
		// modular operator
		// mod ������
		
		result = num1 % num2; // num1�� num2�� ���� ������
		result = 17 % 4;
		System.out.println("������ ���� ��� : " + result);

		System.out.println();
		System.out.println("--- ��� ������ ---");
		System.out.println("num1 + num2 = " + num1 + num2); // �߸��� ���
		
//		System.out.println("num1 + num2 = " + 17 + 4); // ���� Ȱ��
//		System.out.println("num1 + num2 = 17" + 4); // ���ڿ� ���� ����
//		System.out.println("num1 + num2 = 174"); // ���ڿ� ���� ����
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2)); // 4.25�� �ƴ� 4�� ���� (��)
		System.out.println("num1 % num2 = " + (num1 % num2)); // ������
		
		// ��������� �ݵ�� �ǿ����ڵ��� ���� ������ Ÿ���� �� ���� �����ϴ�
		// ��������� ������� �ǿ������� ������Ÿ�԰� ����
		
		System.out.println("---------");
		
		System.out.println( "17 / 4 = " + (17/4)); // int/int -> int
		System.out.println( "17.0 / 4.0 = " + (17.0/4.0)); // double/double -> double
		
		System.out.println("---------");

		System.out.println((double)num1 / (double)num2);
//		System.out.println((double)17 / (double)4); // ���� Ȱ��
//		System.out.println(17.0 / 4.0); // ����ȯ
//		System.out.println(4.25); // ������ (double / double)
		
		System.out.println("---------");
		System.out.println(num1 / (double)num2); // 		int / (double)int
		System.out.println(17 / (double)4); // ���� Ȱ��	int / (double)int
		System.out.println(17 / 4.0); // ��������ȯ			int / double
		System.out.println(17.0 / 4.0); // �ڵ�����ȯ		double / double
		System.out.println(4.25); // ������

		System.out.println("-----�߸��� ���-----");
		System.out.println((double)(num1 / num2));
//		System.out.println((double)(17 / 4)); // ���� Ȱ��	(double)(int / int)
//		System.out.println((double)(4)); // ������			(double)(int)
//		System.out.println(4.0); // ��������ȯ				double
		
		System.out.println("---------");
		
		double dNum = 3.14;
		
		System.out.println("dNum / 2 = " + (dNum/2));
		System.out.println("dNum % 2 = " + (dNum%2));
		
		
		//**�ε��Ҽ��� ���� ����
		
		
	}
	
}
