package java03_scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		//���ڿ�(String) �Է¹ޱ�
		
		//1. �Է°�ü ���� ���� (java.util.Scanner)
		Scanner input;
			
		//2. �Է°�ü ���� (new)
		input = new Scanner( System.in );
		
		//3. ���ڿ� �Է¹ޱ� (String)
		System.out.println("���ڿ��� �Է��ϼ���");
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = input.nextLine();
		
		//4. �Է¹��� ���ڿ� ����ϱ�
		System.out.println("�Է��� ���� : " + str);
		
	}
}
