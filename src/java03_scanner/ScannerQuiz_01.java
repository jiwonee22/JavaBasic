package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	
//	+ �ﰢ������ ���ϱ�
//	 - �ﰢ������ = (�غ� * ����)/2
//	 - �غ��� ���̸� �Է¹޾� ���

	public static void main(String[] args) {
		
		//1. �ʿ��� ���� ���� (+������Ÿ��)
		//	�غ� int
		//	���� int
		//	�ﰢ������ double
		//	�Է°�ü Scanner
		
		int base; //�غ�
		int height; //����
		
		double area; //����
		
		Scanner in = new Scanner(System.in); //Ű���� �Է� ��ü
		
		//2. ������ �Է�
		// �غ�, ����
		
		System.out.print("�غ��� ���̸� �Է��ϼ��� : ");
		base = in.nextInt();
		
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		height = in.nextInt();
		
//		System.out.println("[TEST] base : " + base);
//		System.out.println("[TEST] height : " + height);		
	
		
		//3. ������ �־��� ���
		
		area = base * height / (double)2;
		
//		System.out.println("[TEST] area : " + area);
		
		//4. ��� ���
		System.out.println("�غ� : " + base
				+ ", ���� : " + height
				+ "�� �ﰢ���� ���̴� "
				+ area + " �Դϴ�");
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�غ� : ");
//		int base = sc.nextInt();
//		
//		System.out.print("���� : ");
//		int height = sc.nextInt();
//		
//		System.out.println("-----------");
//		
//		double area = base * height * 0.5;
//		System.out.println("���� : " + area);

		
		
		
		
	}
	
}
