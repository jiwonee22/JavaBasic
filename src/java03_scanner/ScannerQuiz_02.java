package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	//�л� ���� ���� ���α׷�
	//	�̸�, ����, ����, ����, ����, ����
	//	6���� ������ ������ �� �ִ� ������ �����
	//	������ ����� ������ ����� ����Ѵ�
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		//-----------------------------------------
		
		//�̸� �Է�
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine(); //�̸�
//		System.out.println("[TEST] name : " + name);
		
		//���� �Է�
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();	//����
//		System.out.println("[TEST] age : " + age);

		//���� �Է�
		System.out.print("������ �Է��ϼ���(M/F) : ");
		sc.nextLine(); //�Է� ���� ����
		char gender = sc.nextLine().charAt(0); //���۹��� �߻���!
//		System.out.println("[TEST] gender : " + gender);
		
		//���� �Է�
		System.out.print("���� ������? : ");
		int kor = sc.nextInt(); //����
		
		//���� �Է�
		System.out.print("���� ������? : ");
		int eng = sc.nextInt(); //����
		
		//���� �Է�
		System.out.print("���� ������? : ");
		int math = sc.nextInt(); //����
//		System.out.println("[TEST] ������ : " + kor + ", " + eng + ", " + math);
		
		//���� ���ϱ�
		int total = kor + eng + math;

		//��� ���ϱ�
		double avg = total /(double)3;
		
		System.out.println("===== ��� =====");
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		System.out.print(name + "\t"
				+ age + "\t"
				+ gender + "\t"
				+ kor + "\t"
				+ eng + "\t"
				+ math + "\t"
				+ total + "\t");
		System.out.printf("%.2f", avg);
		
		
		
		
//		
//		//1. ���� ����
//		String name;
//		int age;
//		char gender;
//		int korean;
//		int english;
//		int mathematics;
//		int sum;
//		
//		double average;
//		
//		Scanner in = new Scanner(System.in);
//		
//		//2. ������ �Է�
//		System.out.print("Input Name : ");
//		name = in.nextLine();
//		
//		System.out.print("Input Age : ");
//		age = in.nextInt();
//	
//		in.nextLine();
//		
//		System.out.print("Input Korean : ");
//		korean = in.nextInt();
//		
//		System.out.print("Input English : ");
//		english = in.nextInt();
//
//		System.out.print("Input Mathematics : ");
//		mathematics = in.nextInt();
//		
//		//3. ������ �־��� ���
//	
//		sum = korean + english + mathematics;
//		average = sum / (double)3;
//		
//		//4. ��� ���
//		
//		System.out.println("===== ��� =====");
//		System.out.println("�̸�	����	����	����	����	����	����	���");
//		System.out.println(name + age + korean + english + mathematics + sum + average);
//		
//		

	}

}
