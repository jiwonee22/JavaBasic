package java04_control.loop;

import java.util.Scanner;

public class For_06 {
	//구구단 2단을 출력하기
	
	//출력 예시)
	//	2 x 1 = 2
	//	2 x 2 = 4
	//	2 x 3 = 6
	//	2 x 4 = 8
	//	2 x 5 = 10
	//	2 x 6 = 12
	//	2 x 7 = 14
	//	2 x 8 = 16
	//	2 x 9 = 18

	public static void main(String[] args) {
		
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");

		//반복횟수 : 9번
		//반복구간 : 1 ~ 9
		//초기식 : int i=1;	(i변수, 반복구간의 시작값으로 대입한다)
		//조건식 : i<=9;	(i변수, 반복구간의 끝값 or 반복 횟수)
		//증감식 : i++		(1씩 증가)	
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		int i;
		for ( i=1; i<=9; i++) { //i, 1~9, x9
			System.out.println( input + " x " + i + " = " + (input*i) );
		}
		
	}
		
}
