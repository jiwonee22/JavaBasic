package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {
	
//	 + �� ���� �Է� �޾� ū ���� ����Ͻÿ�
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 �� �� ū ��
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\t>> Input Number1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("\t>> Input Number2 : ");
		int input2 = sc.nextInt();
		
		if ( input1 > input2 ) { 
			System.out.println("\t>> " + input1 + "��(��) �� ū ��");
		} else if ( input1 < input2 ) {
			System.out.println("\t>> " + input2 + "��(��) �� ū ��");
		} else {
			System.out.println("\t>> " + "�� ���ڰ� " + input1 + "(��)�� �����ϴ�" );
		}
	}

}
