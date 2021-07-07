package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_04 {

	//	- 입력받은 두수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하라.
	//		최소공배수 = 공배수 중에서 가장 작은 정수
	//		최대공약수 = 공약수 중에서 절대치가 가장 큰 수

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Input Number1 : ");
//		int input1 = sc.nextInt();
//
//		System.out.print("Input Number2 : ");
//		int input2 = sc.nextInt();
//
//		int i = 1;
//		int j = 1;
//
//		for(i=1; i<=input2; i++) {
//
//			for(j=1; j<=input1; j++) {
//
//
//				if((input1*i) == (input2*j)) {
//
//					System.out.println("최소 공배수 = " + input1*i);
//				}
//
//			}
//
//		}
		
		
		//최소 공배수
		//	1. 두 숫자 입력받기
		//	2. 둘 중에 큰 숫자 찾기
		//	3. 큰 숫자를 시작으로 1씩 증가시키며 무한 반복
		//	4. 두 숫자로 나눈 나머지가 0일 때 중단
		//	->최소 공배수 발견
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number1 : ");
		int n1 = sc.nextInt();

		System.out.print("Input Number2 : ");
		int n2 = sc.nextInt();
		
		int lcm=0; //최소공배수
		
		int max = n1>n2 ?n1 :n2; //둘 중에 큰 수 저장
		
		for(int i=max; true; i++) {
			if(i%n1 == 0 && i%n2 == 0) {
				lcm = i;
				
				break;				
			}
		}
		
		System.out.println("최소공배수: " + lcm);

		int gcd=0;
		
		int min = n1<n2 ?n2 :n1; //둘중에 작은 수 저장
		
		for(int i=min; i>=1; i--) {
			if(n1%i == 0 && n2%i == 0) {
				gcd = i;
				
				break;
			}
		}
		
		System.out.println("최대공약수: " + gcd);
		
		//------------------------------------------------------------------------
		
		

		System.out.print("Input Number1 : ");
		int input1 = sc.nextInt();

		System.out.print("Input Number2 : ");
		int input2 = sc.nextInt();
		
		for(int i=1; i<= (input1*input2); i++) {
			
			if(i%input1 == 0 && i%input2 ==0) {
				
				System.out.println("최소공배수 = " + i);
				break;
			}
			
		}
		
		for(int i = input1; i>=1; i--) {
			
			if(input1%i == 0 && input2%i == 0) {
				
				System.out.println("최대공약수 = " + i);
				break;
			}
		}
		
		
	}

}