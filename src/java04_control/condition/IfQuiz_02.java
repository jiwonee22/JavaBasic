package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number : ");
		int input = sc.nextInt();

		if ( input % 3 == 0 && input != 0 ) {
			System.out.println("3�� ����Դϴ�");
		} else {
			System.out.println("3�� ����� �ƴմϴ�");
		}

// 		�̷��� �ۼ��ص� ��
//		if ( !(input % 3 == 0 && input != 0) ) {
//			System.out.println("3�� ����� �ƴմϴ�");
//		}

	}
}
