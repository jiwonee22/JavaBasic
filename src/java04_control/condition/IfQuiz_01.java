package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01 {
	//	+ 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
	//		>> Input Number : -3
	//		>> 음수입니다
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("\t>> Input Number : ");
		int input = sc.nextInt();

		if ( input < 0 ) {
			System.out.println( "\t>> 음수입니다");
		}
		
		if ( input > 0) {
			System.out.println( "\t>> 양수입니다");
		} 
		
		if ( input == 0 ) {
			System.out.println( "\t>> 0입니다");
		}
		
	}

}
