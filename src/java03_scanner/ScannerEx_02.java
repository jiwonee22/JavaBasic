package java03_scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		//문자열(String) 입력받기
		
		//1. 입력객체 변수 선언 (java.util.Scanner)
		Scanner input;
			
		//2. 입력객체 생성 (new)
		input = new Scanner( System.in );
		
		//3. 문자열 입력받기 (String)
		System.out.println("문자열을 입력하세요");
		System.out.print("문자열을 입력하세요 : ");
		String str = input.nextLine();
		
		//4. 입력받은 문자열 출력하기
		System.out.println("입력한 내용 : " + str);
		
	}
}
