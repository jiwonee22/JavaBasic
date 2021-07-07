package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	
//	+ 삼각형넓이 구하기
//	 - 삼각형넓이 = (밑변 * 높이)/2
//	 - 밑변과 높이를 입력받아 계산

	public static void main(String[] args) {
		
		//1. 필요한 변수 선언 (+데이터타입)
		//	밑변 int
		//	높이 int
		//	삼각형넓이 double
		//	입력객체 Scanner
		
		int base; //밑변
		int height; //높이
		
		double area; //넓이
		
		Scanner in = new Scanner(System.in); //키보드 입력 객체
		
		//2. 데이터 입력
		// 밑변, 높이
		
		System.out.print("밑변의 길이를 입력하세요 : ");
		base = in.nextInt();
		
		System.out.print("높이의 길이를 입력하세요 : ");
		height = in.nextInt();
		
//		System.out.println("[TEST] base : " + base);
//		System.out.println("[TEST] height : " + height);		
	
		
		//3. 문제에 주어진 계산
		
		area = base * height / (double)2;
		
//		System.out.println("[TEST] area : " + area);
		
		//4. 결과 출력
		System.out.println("밑변 : " + base
				+ ", 높이 : " + height
				+ "인 삼각형의 넓이는 "
				+ area + " 입니다");
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("밑변 : ");
//		int base = sc.nextInt();
//		
//		System.out.print("높이 : ");
//		int height = sc.nextInt();
//		
//		System.out.println("-----------");
//		
//		double area = base * height * 0.5;
//		System.out.println("넓이 : " + area);

		
		
		
		
	}
	
}
