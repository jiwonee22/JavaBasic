package java04_control.selection;

import java.util.Scanner;

public class DoWhile_Menu {
	public static void main(String[] args) {

		//�޴� ��ȣ ���
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;

		//-----------------------------------------------------

		Scanner sc = new Scanner(System.in); //�Է°�ü

		int select = 0; //�޴� ���� ����

		do {
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World ���");
			System.out.println("\t2. �̸� ���");
			System.out.println("\t3. ���� ���");
			System.out.println("\t4. ����");
			System.out.println("===============================");
			
			System.out.println();
			System.out.print("\t>> ");

			try {
				//	������ ���� �� �ִ� �ڵ带 �ۼ��ϴ� ����
				select = sc.nextInt(); //�޴� ����

			} catch( Exception e ) {
				//	try�ʿ��� ���ܰ� �߻��ϸ� ����Ǵ� ����

				System.out.println();
				System.out.println("\t>> ���ڸ� �Է��ϼ���!");

				select = EXIT_MENU;
			}

			switch ( select ) {
			case HELLO_MENU: //1.Hello World
				System.out.println("Hello World");
				break;

			case NAME_MENU: //2.�̸�
				System.out.println("Alice");
				break;

			case GENDER_MENU: //3.����
				System.out.println("��");
				break;

			case EXIT_MENU: //4.����
				System.out.println("Good Bye~");
				break;

			default:
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�");
			} //switch end

			//����޴��� �������� ������ �ݺ�
		} while ( select != EXIT_MENU ) ;
		
	} //main end

} //class Dowhile_Menu end


