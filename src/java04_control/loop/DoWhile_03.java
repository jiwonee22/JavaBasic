package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력객체

		int input; //입력값
		
		//--------------------------------------------------------
		
		//숫자를 입력하면 그 값을 다시 출력해주는 프로그램
		// (99를 입력하면 종료한다)
		
		// (99를 입력하지 않으면 반복한다)
//		
//		do {
//			System.out.println("Input Number(종료=99) : ");
//			input = sc.nextInt();
//			
//			System.out.println("입력한 값 : " + input);
//			System.out.println();
//		
//		} while( input != 99 );
//		
//		System.out.println(" + + + 프로그램 종료 + + +");
		
		//------------------------------------------------------
		
		while ( true ) { //무한루프
		
			System.out.println("Input Number(종료=99) : ");
			input = sc.nextInt();
			
			System.out.println("입력한 값 : " + input);
			System.out.println();
			
			//입력값이 99일 때 무한루프 중단시키기
			if( input == 99) {
				break;	//반복문 중단코드
			}
		
		}
		
		System.out.println(" + + + 프로그램 종료 + + +");
		
	}

}
