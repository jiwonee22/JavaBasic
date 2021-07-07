package java04_control.selection;

import java.util.Scanner;

public class SwtichQuiz_Menu01 {
//	- 메뉴 만들기
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World 출력
//		2. 이름 출력
//		3. 성별 출력
//		4. 종료
//	===============================
//
//	  >> _
//
//	 -> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성
	public static void main(String[] args) {
		
		//메뉴 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		//-----------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //입력객체

		int select = 0; //메뉴 선택 변수
		
		System.out.println("===============================");
		System.out.println("\tM  e  n  u");
		System.out.println("===============================");
		System.out.println("\t1. Hello World 출력");
		System.out.println("\t2. 이름 출력");
		System.out.println("\t3. 성별 출력");
		System.out.println("\t4. 종료");
		System.out.println("===============================");
		System.out.println();
		System.out.print("\t>> ");
		
		
		//try~catch구문 ("예외처리" 파트에서 배움)
		//	예외가 발생한 상황을 정상적인 흐름으로 되돌려놓음
		try {
			//	문제가 있을 수 있는 코드를 작성하는 영역
			select = sc.nextInt(); //메뉴 선택
			
		} catch(Exception e) {
			//	try쪽에서 예외가 발생하면 실행되는 영역
		
			System.out.println();
			System.out.println("\t>> 숫자를 입력하세요!");
			
			select = EXIT_MENU;
		}
		
		System.out.println();
		System.out.print("\t>> ");

		switch ( select ) {
		case HELLO_MENU: //1.Hello World
			System.out.println("Hello World");
			break;

		case NAME_MENU: //2.이름
			System.out.println("Alice");
			break;

		case GENDER_MENU: //3.성별
			System.out.println("여");
			break;
			
		case EXIT_MENU: //4.종료
			System.out.println("Good Bye~");
			break;
			
		default:
			System.out.println("메뉴를 잘못 선택하셨습니다");
		}
		
	}
	
	
}
