package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number : ");
		int input = sc.nextInt();

		if ( input % 3 == 0 && input != 0 ) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}

// 		이렇게 작성해도 됨
//		if ( !(input % 3 == 0 && input != 0) ) {
//			System.out.println("3의 배수가 아닙니다");
//		}

	}
}
