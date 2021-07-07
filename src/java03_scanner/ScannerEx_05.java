package java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		
		//Scanner를 이용한 char 입력
		//	Scanner에는 char를 입력받는 기능이 없다
		
		//	String은 char형을 여러 개 모아놓은 데이터타입이다
		//	String으로 입력받고, 그 중에서 한 글자(char)를 떼어낸다
		
		//---------------------------------------------------------------		
	
		Scanner sc = new Scanner(System.in); //입력 객체
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); //문자열을 입력받아 str변수에 저장
		System.out.println("[TEST] str : " + str);
		
		//str문자열의 0번째 문자를 alpha변수에 저장
		char alpha = str.charAt(0);
		System.out.println("[TEST] alpha : " + alpha);
		
		//---------------------------------------------------------------		
		System.out.println("----------------");
		System.out.print("성별 입력 : ");
		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
		
//		System.out.println("입력한 성별 : " + gender);
		
		//---------------------------------------------------------------		

//		char gender = sc.nextLine().charAt(0);

		
	}

}
