package java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		
		//Scanner�� �̿��� char �Է�
		//	Scanner���� char�� �Է¹޴� ����� ����
		
		//	String�� char���� ���� �� ��Ƴ��� ������Ÿ���̴�
		//	String���� �Է¹ް�, �� �߿��� �� ����(char)�� �����
		
		//---------------------------------------------------------------		
	
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); //���ڿ��� �Է¹޾� str������ ����
		System.out.println("[TEST] str : " + str);
		
		//str���ڿ��� 0��° ���ڸ� alpha������ ����
		char alpha = str.charAt(0);
		System.out.println("[TEST] alpha : " + alpha);
		
		//---------------------------------------------------------------		
		System.out.println("----------------");
		System.out.print("���� �Է� : ");
		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
		
//		System.out.println("�Է��� ���� : " + gender);
		
		//---------------------------------------------------------------		

//		char gender = sc.nextLine().charAt(0);

		
	}

}
