package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		
		//���ڿ� �Է� ó�� ���(�޼ҵ�)
		//	nextLine(), next()
		
		//--------------------------------------------------
		
		//import ����ȭ ����Ű : ctrl + shift + o
		
		Scanner sc = new Scanner(System.in); //Ű���� �Է� ��ü
		
		//���ڿ� ����
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//���ڿ� �Է� �ޱ�
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		str1 = sc.next();
		str2 = sc.next();
		
		System.out.println("---���---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//nextLine()
		//	���๮��(���Ͱ�)�� �������� �Է��� �� ���� �ϳ��� ���ڿ��� �Ǵ��Ѵ�
		
		//next()
		//	���鹮��(white space)�� �������� �ϳ��� ���ڿ��� �Ǵ��Ѵ�
		
		
		
		
	}
}
