package java04_control.condition;

import java.util.Scanner;

public class IfElseifElse {
	public static void main(String[] args) {
		// if ~ else if ~ else

//		if( ���ǽ�1 ) {
//			//���ǽ�1 �� ���� �� �����ϴ� �ڵ� ����
//		} else if ( ���ǽ�2 ){
//			//���ǽ�1 �� �����̰�
//			//���ǽ�2 �� ���� �� �����ϴ� �ڵ� ����
//		} else if ( ���ǽ�3 ) {
//			//���ǽ�1 �� �����̰�
//			//���ǽ�2 �� �����̰�
//			//���ǽ�3 �� ���� �� �����ϴ� �ڵ� ����
//		} else {
//			//���ǽ�1, 2, 3 ��� ������ �� �����ϴ� �ڵ� ����
//		}

		//** else�� ����ϴ� ����� if���� ���������θ� �� �� �ִ�
		//** else if������ �ۼ� ������ ������ ����
		//** else, else if������ �ʼ��� �ƴϴ�(��� �ȴ�)
		//** if�� ���� else, else if�� ���� �ۼ��� �� ����

		//----------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in); //�Է� ��ü

		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
	
		if ( input == 10 ) {
			System.out.println("10 �Դϴ�");
		} else if ( input == 20 ) {
			System.out.println("20 �Դϴ�");
		} else if ( input == 30 ) {
			System.out.println("30 �Դϴ�");
		} else {
			System.out.println("10, 20, 30 ��� �ƴմϴ�");
		}

	}
}
