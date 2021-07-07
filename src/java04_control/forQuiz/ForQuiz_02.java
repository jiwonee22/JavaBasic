package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_02 {

	//	- 어떤 수의 약수를 구하는 프로그램을 작성하여라
	//	약수 = 어떤 수를 정수로 나눌 수 있는 수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number : ");
		int input = sc.nextInt();

		int i=1;

		for(i=1; i<=input; i++) {

			if(input%i == 0) {
				System.out.print(i + " ");
			}

		}
		
		for(i=1; i<=input; i++) { //i, 1~input
			
			boolean flag = false; //플래그
			
			if(input%i == 0) {//약수 발견
				flag = true;
				
			}
			
			if (flag) {//i가 약수(true)라면 출력
				System.out.print(i + " ");
			}
		}
	}

}
