package java04_control.condition;

import java.util.Scanner;

public class IfElseifElse {
	public static void main(String[] args) {
		// if ~ else if ~ else

//		if( 조건식1 ) {
//			//조건식1 이 참일 때 수행하는 코드 영역
//		} else if ( 조건식2 ){
//			//조건식1 이 거짓이고
//			//조건식2 가 참일 때 수행하는 코드 영역
//		} else if ( 조건식3 ) {
//			//조건식1 이 거짓이고
//			//조건식2 가 거짓이고
//			//조건식3 이 참일 때 수행하는 코드 영역
//		} else {
//			//조건식1, 2, 3 모두 거짓일 때 수행하는 코드 영역
//		}

		//** else만 사용하는 제어문은 if문의 마지막으로만 올 수 있다
		//** else if구문은 작성 개수에 제한이 없다
		//** else, else if구문은 필수가 아니다(없어도 된다)
		//** if문 없이 else, else if만 따로 작성할 수 없다

		//----------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in); //입력 객체

		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
	
		if ( input == 10 ) {
			System.out.println("10 입니다");
		} else if ( input == 20 ) {
			System.out.println("20 입니다");
		} else if ( input == 30 ) {
			System.out.println("30 입니다");
		} else {
			System.out.println("10, 20, 30 모두 아닙니다");
		}

	}
}
