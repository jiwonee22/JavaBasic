package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01 {
	//	+ ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
	//		>> Input Number : -3
	//		>> �����Դϴ�
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("\t>> Input Number : ");
		int input = sc.nextInt();

		if ( input < 0 ) {
			System.out.println( "\t>> �����Դϴ�");
		}
		
		if ( input > 0) {
			System.out.println( "\t>> ����Դϴ�");
		} 
		
		if ( input == 0 ) {
			System.out.println( "\t>> 0�Դϴ�");
		}
		
	}

}
