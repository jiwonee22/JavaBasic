package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		//	�Է��� ���ڰ� ¦��/Ȧ�� �Ǻ��ϴ� �ڵ� �ۼ�
		
		if (input % 2 == 1) { 
			System.out.println("Ȧ���Դϴ�");
		} else {
			System.out.println("¦���Դϴ�");
		}
		
	}

}
