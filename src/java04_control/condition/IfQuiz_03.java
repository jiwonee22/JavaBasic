package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {
	
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\t>> Input Number1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("\t>> Input Number2 : ");
		int input2 = sc.nextInt();
		
		if ( input1 > input2 ) { 
			System.out.println("\t>> " + input1 + "이(가) 더 큰 수");
		} else if ( input1 < input2 ) {
			System.out.println("\t>> " + input2 + "이(가) 더 큰 수");
		} else {
			System.out.println("\t>> " + "두 숫자가 " + input1 + "(으)로 같습니다" );
		}
	}

}
