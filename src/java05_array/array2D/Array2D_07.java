package java05_array.array2D;

import java.util.Scanner;

public class Array2D_07 {
	public static void main(String[] args) {

		//�л� ���� ���� ���α׷�

		//1~3�г�
		//2����
		//4���� �л�
		//3����		
		//����

		int[][][][] sco = new int[3][2][4][3];

		//--------------------------------------------------------------

		//1~3�г��� ���� �����ϱ�
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];

		//--------------------------------------------------------------

		//QUIZ.
		//	2���� ����, ����, ���� ������ ó���Ѵ�
		//	�л����� ������ �Է¹ް� ������ ����� ����Ͽ� ����Ѵ�

		//----- ���� ��� -----

		//2���� ����, ����, ���� ������ ������ �迭
		int[][] score = new int[2][3];

		int[] sum = new int[2];//���� �迭
		double[] avg = new double[2];//��� �迭
		
		
		//--- 2�� �л����� 3���� ���� �Է¹ޱ� ---
		Scanner sc = new Scanner(System.in);
		
		String[] subject = { "����", "����", "����" };

		for(int i=0; i<score.length; i++) { //i��° �л�		0~1
			for(int j=0; j<score[i].length; j++) { //j��° ����	0~2

				System.out.print((i+1) + "�� �л��� " + subject[j] + " ���� : ");
				score[i][j] =  sc.nextInt();
				
			}
			System.out.println();
		}
		
		//TEST
//		for(int i=0; i<score.length; i++) { //i��° �л�		0~1
//			for(int j=0; j<score[i].length; j++) { //j��° ����	0~2
//				
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
				
		//----------------------------------------
		
		
		
		//--- ���� ����ϱ� ---
		
		for(int i=0; i<sum.length; i++) { //i��° �л�		0~1
			for(int j=0; j<score[i].length; j++) { //j��° ����	0~2
				
				sum[i] += score[i][j];
			}	
		}
		
		//TEST
//		for(int i=0; i<sum.length; i++) { //i��° �л�	
//			System.out.print(sum[i] + " ");
//		}

		//---------------------

		
		//--- ��� ����ϱ� ---
		
		for(int i=0; i<avg.length; i++) { //i��° �л�
			avg[i] = sum[i] / (double)3;
		}
		
		//TEST
//		for(int i=0; i<avg.length; i++) { //i��° �л�
//			System.out.print(avg[i] + " ");
//		}
		
		
		//---------------------
		
		//--- ���� ��� ---
		// ex)	��ȣ	����	����	����	����	���
		//		1��		xxx		xxx		xxx		xxx		xxx.xx
		//		2��		xxx		xxx		xxx		xxx		xxx.xx
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		for(int i=0; i<score.length; i++) { //i��° �л�		0~1
			System.out.print((i+1) + "��"); //��ȣ
		
			for(int j=0; j<score[i].length; j++) { //j��° ����	0~2
				System.out.print("\t" + score[i][j]); //������ ����
				
			}
			
			System.out.print("\t" + sum[i]); //����
			System.out.println("\t" + String.format("%.2f", avg[i])); //���
		}

		//-----------------



	}

	
}






