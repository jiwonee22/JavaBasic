package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_02 {

	//	- � ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���
	//	��� = � ���� ������ ���� �� �ִ� ��

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number : ");
		int input = sc.nextInt();

		int i=1;

		for(i=1; i<=input; i++) {

			if(input%i == 0) {
				System.out.print(i + " ");
			}

		}
		
		for(i=1; i<=input; i++) { //i, 1~input
			
			boolean flag = false; //�÷���
			
			if(input%i == 0) {//��� �߰�
				flag = true;
				
			}
			
			if (flag) {//i�� ���(true)��� ���
				System.out.print(i + " ");
			}
		}
	}

}
