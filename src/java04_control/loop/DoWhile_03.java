package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�Է°�ü

		int input; //�Է°�
		
		//--------------------------------------------------------
		
		//���ڸ� �Է��ϸ� �� ���� �ٽ� ������ִ� ���α׷�
		// (99�� �Է��ϸ� �����Ѵ�)
		
		// (99�� �Է����� ������ �ݺ��Ѵ�)
//		
//		do {
//			System.out.println("Input Number(����=99) : ");
//			input = sc.nextInt();
//			
//			System.out.println("�Է��� �� : " + input);
//			System.out.println();
//		
//		} while( input != 99 );
//		
//		System.out.println(" + + + ���α׷� ���� + + +");
		
		//------------------------------------------------------
		
		while ( true ) { //���ѷ���
		
			System.out.println("Input Number(����=99) : ");
			input = sc.nextInt();
			
			System.out.println("�Է��� �� : " + input);
			System.out.println();
			
			//�Է°��� 99�� �� ���ѷ��� �ߴܽ�Ű��
			if( input == 99) {
				break;	//�ݺ��� �ߴ��ڵ�
			}
		
		}
		
		System.out.println(" + + + ���α׷� ���� + + +");
		
	}

}
