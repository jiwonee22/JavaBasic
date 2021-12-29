package selfstudy.study;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		
//		- 어떤 수의 약수를 구하는 프로그램을 작성하여라
//	    약수 = 어떤 수를 정수로 나눌 수 있는 수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("약수를 구하고 싶은 수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print(num + "의 약수 : ");
		
		if(num == 1) { System.out.println("1"); }
		
		else {
			System.out.print("1, ");
			
			for(int i=2; i<num; i++) {
				
				if(num%i == 0) {
					System.out.print(i + ", ");
				}
			}
			
			System.out.print(num);			
		}
		
	}
}
