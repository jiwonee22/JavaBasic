package selfstudy.study;

import java.util.Scanner;

public class TimesTable {
	public static void main(String[] args) {
		
		
//		- 구구단 중 입력받은 수의 단수를 출력하여라
//	    ex) Input >> 4
//
//	        4 x 1 = 4
//	        4 x 2 = 8
//	        4 x 3 = 12
//	        ....
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(dan + " x " + i + " = " + dan * i); 
			
		}
		
		
		
	}

}
