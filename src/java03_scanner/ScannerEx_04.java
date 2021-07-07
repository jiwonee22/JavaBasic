package java03_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//**Scanner객체를 사용할 때에는 입력 버퍼 문제를 조심해야한다
		
		//	nextLine() 을 사용하기 직전에 nextLine() 이 아닌
		//	다른 next~~() 기능을 사용했다면 그 중간에 nextLine()을 
		//	한번 더 사용해주어야 한다
		
		//	-> 입력버퍼에 남아있는 '\n'개행문자를 없애는 역할을 한다
		
		//--------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		System.out.println("---입력---");
		System.out.print("Input Number : ");
		int num = sc.nextInt(); //정수값 입력받기
		
		sc.nextLine(); //버퍼 비우기 ('\n' 제거)
//		sc.skip("[\\r\\n]+"); //버퍼에 남은 '\r' '\n' 을 제거하는 기능
		
		System.out.print("Input String : ");
		String str = sc.nextLine(); //문자열 입력받기
		
		System.out.println("---출력---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
		
		
	}
}