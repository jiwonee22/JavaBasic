package selfstudy.study;

import java.util.Scanner;

public class GCMLCM {
	public static void main(String[] args) {
		
//		- 입력받은 두수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하라.
//		    최소공배수 = 공배수 중에서 가장 작은 정수
//		    최대공약수 = 공약수 중에서 절대치가 가장 큰 수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int A = sc.nextInt();
		
		sc.nextLine();//버퍼비우기
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int B = sc.nextInt();
		
		int max;
		int min;
		
		if(A >= B) {
			max = A;
			min = B;
		} else {
			max = B;
			min = A;
		}
		
		//A, B중 큰 수를 max에 저장하고 작은 수를 min에 저장해서 문제를 푼다
		
		//최대공약수
		for(int i=max; i>=1; i--) {
			
			if((max%i) == 0 && (min%i) == 0) {
				System.out.print(A + "와 " + B + "의 최대공약수 : " + i);
				
				break;
			}
			
		}
		
		System.out.println();
		
		//최소공배수
		for(int i=max; i<=max*min; i++) {
			
			if((i%max) == 0 && (i%min) == 0) {
				System.out.print(A + "와 " + B + "의 최소공배수 : " + i);
				
				break;

			}
			
		}
		

	}
}
