package java04_control.loop;

import java.util.Scanner;

public class For_06 {
	//������ 2���� ����ϱ�
	
	//��� ����)
	//	2 x 1 = 2
	//	2 x 2 = 4
	//	2 x 3 = 6
	//	2 x 4 = 8
	//	2 x 5 = 10
	//	2 x 6 = 12
	//	2 x 7 = 14
	//	2 x 8 = 16
	//	2 x 9 = 18

	public static void main(String[] args) {
		
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");

		//�ݺ�Ƚ�� : 9��
		//�ݺ����� : 1 ~ 9
		//�ʱ�� : int i=1;	(i����, �ݺ������� ���۰����� �����Ѵ�)
		//���ǽ� : i<=9;	(i����, �ݺ������� ���� or �ݺ� Ƚ��)
		//������ : i++		(1�� ����)	
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		int i;
		for ( i=1; i<=9; i++) { //i, 1~9, x9
			System.out.println( input + " x " + i + " = " + (input*i) );
		}
		
	}
		
}
