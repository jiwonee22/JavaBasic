package selfstudy.backjoon;

import java.util.Scanner;

public class Main_1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		sc.close();
		
		int Y = X;

		int count = 0;

		while(true) {
			

			X = (( X % 10 ) * 10 ) + (((X / 10) + (X % 10)) % 10 );
			
			count++;
			
			if(X == Y) break;
	
		}
		
		System.out.println(count);

	}

}
