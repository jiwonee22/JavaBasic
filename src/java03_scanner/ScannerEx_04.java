package java03_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//**Scanner��ü�� ����� ������ �Է� ���� ������ �����ؾ��Ѵ�
		
		//	nextLine() �� ����ϱ� ������ nextLine() �� �ƴ�
		//	�ٸ� next~~() ����� ����ߴٸ� �� �߰��� nextLine()�� 
		//	�ѹ� �� ������־�� �Ѵ�
		
		//	-> �Է¹��ۿ� �����ִ� '\n'���๮�ڸ� ���ִ� ������ �Ѵ�
		
		//--------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		System.out.println("---�Է�---");
		System.out.print("Input Number : ");
		int num = sc.nextInt(); //������ �Է¹ޱ�
		
		sc.nextLine(); //���� ���� ('\n' ����)
//		sc.skip("[\\r\\n]+"); //���ۿ� ���� '\r' '\n' �� �����ϴ� ���
		
		System.out.print("Input String : ");
		String str = sc.nextLine(); //���ڿ� �Է¹ޱ�
		
		System.out.println("---���---");
		System.out.println("���� : " + num);
		System.out.println("���ڿ� : " + str);
		
		
	}
}