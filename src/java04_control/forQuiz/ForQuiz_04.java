package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_04 {

	//	- �Է¹��� �μ��� �ּ� ������� �ִ� ������� ���ϴ� ���α׷��� �ۼ��϶�.
	//		�ּҰ���� = ����� �߿��� ���� ���� ����
	//		�ִ����� = ����� �߿��� ����ġ�� ���� ū ��

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Input Number1 : ");
//		int input1 = sc.nextInt();
//
//		System.out.print("Input Number2 : ");
//		int input2 = sc.nextInt();
//
//		int i = 1;
//		int j = 1;
//
//		for(i=1; i<=input2; i++) {
//
//			for(j=1; j<=input1; j++) {
//
//
//				if((input1*i) == (input2*j)) {
//
//					System.out.println("�ּ� ����� = " + input1*i);
//				}
//
//			}
//
//		}
		
		
		//�ּ� �����
		//	1. �� ���� �Է¹ޱ�
		//	2. �� �߿� ū ���� ã��
		//	3. ū ���ڸ� �������� 1�� ������Ű�� ���� �ݺ�
		//	4. �� ���ڷ� ���� �������� 0�� �� �ߴ�
		//	->�ּ� ����� �߰�
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number1 : ");
		int n1 = sc.nextInt();

		System.out.print("Input Number2 : ");
		int n2 = sc.nextInt();
		
		int lcm=0; //�ּҰ����
		
		int max = n1>n2 ?n1 :n2; //�� �߿� ū �� ����
		
		for(int i=max; true; i++) {
			if(i%n1 == 0 && i%n2 == 0) {
				lcm = i;
				
				break;				
			}
		}
		
		System.out.println("�ּҰ����: " + lcm);

		int gcd=0;
		
		int min = n1<n2 ?n2 :n1; //���߿� ���� �� ����
		
		for(int i=min; i>=1; i--) {
			if(n1%i == 0 && n2%i == 0) {
				gcd = i;
				
				break;
			}
		}
		
		System.out.println("�ִ�����: " + gcd);
		
		//------------------------------------------------------------------------
		
		

		System.out.print("Input Number1 : ");
		int input1 = sc.nextInt();

		System.out.print("Input Number2 : ");
		int input2 = sc.nextInt();
		
		for(int i=1; i<= (input1*input2); i++) {
			
			if(i%input1 == 0 && i%input2 ==0) {
				
				System.out.println("�ּҰ���� = " + i);
				break;
			}
			
		}
		
		for(int i = input1; i>=1; i--) {
			
			if(input1%i == 0 && input2%i == 0) {
				
				System.out.println("�ִ����� = " + i);
				break;
			}
		}
		
		
	}

}