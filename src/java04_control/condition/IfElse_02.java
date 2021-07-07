package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		//	입력한 숫자가 짝수/홀수 판별하는 코드 작성
		
		if (input % 2 == 1) { 
			System.out.println("홀수입니다");
		} else {
			System.out.println("짝수입니다");
		}
		
	}

}
