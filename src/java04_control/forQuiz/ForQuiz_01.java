package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_01 {

	//- 구구단 중 입력받은 수의 단수를 출력하여라
	//ex) Input >> 4
	//
	//4 x 1 = 4
	//4 x 2 = 8
	//4 x 3 = 12
	//....

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input : ");
		int input = sc.nextInt();

		for(int i=1; i<=9; i++) {
			System.out.println(input + " x " + i + " = " + (input*i));
		}


	}
}
