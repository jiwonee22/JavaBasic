package java04_control.condition;

import java.util.Scanner;

public class IfEx_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		if ( input == 10 ) {
			System.out.println("�Է��� ���� 10�̴�");
		}
		
		if ( input != 10) {
			System.out.println("�Է��� ���� 10�� �ƴϴ�");
		}
		
		if ( input>=1 && input <=100 ) {
			System.out.println("�Է��� ���� 1~100 ������ ����");
		}
		
	}
}
