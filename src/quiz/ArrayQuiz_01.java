package quiz;

import java.util.Scanner;

public class ArrayQuiz_01 {
	public static void main(String[] args) {
	
	
//	5���� �ǹ��� �ο��� �Է� �޵��� ������ ��ü �ο��� �������� �ϰ� �Ͽ���.
//	���� �� ������ ������ �����Ѵ�. (������� �ο��� 12000�� �̴�.)
//
//	- �ʿ��� �迭
//	 1. �� ���� ��� �ο��� ��� �迭 arr[6]
//	   // 1~5�� �� ���ο� (������ �迭������ �Է¹��� �ο��� �� ������ ���) 
//	 2. �� ���� ������ �迭 arr2[6]
//	   // 1~5�� �� �� ������ �ݾ� (������ �迭������ �������� �� �հ�ݾ����� ���)
//
//	----------------------- �Է� (�Է½� for���� �̿��Ѵ�.)
//	1���� ��� �ο��� ? 4
//	2���� ��� �ο��� ? 5
//	3���� ��� �ο��� ? 11
//	4���� ��� �ο��� ? 2
//	5���� ��� �ο��� ? 8
//	----------------------- ��� (��½� for ���� �̿��Ѵ�.)
//	1���� �� ������ : 48000��
//	2���� �� ������ : 60000��
//	3���� �� ������ : 132000��
//	4���� �� ������ : 24000��
//	5���� �� ������ : 96000��
//
//	�ǹ��� ��� �� �ο��� 30���Դϴ�.
//	�������� �� �ݾ��� 360000�� �Դϴ�.
		
		System.out.println("---------------- �Է�");
		
		Scanner sc1 = new Scanner(System.in); //�Է°�ü
		
		final int COST = 12000;
		
		int arr[];
		arr = new int[6];
		
		for(int i=0; i<5; i++) {
			
			System.out.print((i+1) + "���� ��� �ο��� ? " );
			arr[i] = sc1.nextInt();
			
		}
		
		System.out.println("---------------- ���");
		
		int total=0;
		
		for(int i=0; i<5; i++) {
		
			total += arr[i];
			arr[5] += arr[i];
		}
		
		
		for(int i=0; i<5; i++) {
			
			System.out.println((i+1) + "���� �� ������ : " + (COST*arr[i]) + "��");
	
		}
		
		System.out.println();
		System.out.println("�ǹ��� ��� �� �ο��� " + total + "���Դϴ�.");
		System.out.println("�������� �� �ݾ��� " + (total*COST) + "�� �Դϴ�.");
		
	//--------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		//--- ��� ���� ---
		//	���� ���Ǵ� ��
		//	�������� ���Ǵ� ��
		final int FLOOR = 5;
		final int FEE = 12000;
		
		//--- ���� ���� ---
		int [] people = new int[FLOOR+1]; // �� �� �ο� + �� �ο�
		int [] expense = new int[FLOOR+1]; // �� �� ������ + �� ������
		
		Scanner sc2 = new Scanner(System.in); //�Է°�ü
		//-----------------
		
		//--- �� ���� �ο� �Է� ---
		System.out.println("- - - �� ���� �ο� �Է� - - -");
		
		for(int i=0; i<FLOOR; i++) {
			System.out.print(" >> " + (i+1) + "���� �ο���? ");
			people[i] = sc2.nextInt();
			
		
			//�� �ο� �� �հ� ���
			people[FLOOR] += people[i];
			
		}
		
		System.out.println();
		System.out.println("- - - �� ���� ������ ��� - - -");
		
		for(int i=0; i<FLOOR; i++) {
			expense[i] = people[i] * FEE;
			System.out.println((i+1) + "���� �� ������ : " + expense[i] + "��");
			
			//�� ������ �հ� ���
			expense[FLOOR] += expense[i];

			
		}
		System.out.println();
		System.out.println("�ǹ��� ��� �� �ο��� " + people[FLOOR] + "���Դϴ�.");
		System.out.println("�������� �� �ݾ��� " + expense[FLOOR] + "�� �Դϴ�.");
		
		//-------------------------
		
		
		
		
	}

	
	
	
	
	
}