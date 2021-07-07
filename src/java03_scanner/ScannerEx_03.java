package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		
		//문자열 입력 처리 기능(메소드)
		//	nextLine(), next()
		
		//--------------------------------------------------
		
		//import 최적화 단축키 : ctrl + shift + o
		
		Scanner sc = new Scanner(System.in); //키보드 입력 객체
		
		//문자열 변수
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//문자열 입력 받기
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		str1 = sc.next();
		str2 = sc.next();
		
		System.out.println("---출력---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//nextLine()
		//	개행문자(엔터값)을 기준으로 입력한 한 줄을 하나의 문자열로 판단한다
		
		//next()
		//	공백문자(white space)를 기준으로 하나의 문자열로 판단한다
		
		
		
		
	}
}
