package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		// 2~9단 구구단
		
		//	1. 바깥쪽 for문 :  2~9단 반복
		//		dan변수, 2~9, 8번
		
		//	2. 안쪽 for문 : 각 단에서 구구단 반복
		//		i변수, 1~9, 9번
				
		for(int dan=2; dan<=9; dan++) {
			System.out.println("---- " + dan + "단 ----");

			for(int i=1; i<=9; i++) {
				
				System.out.println(dan + " x " + i + " = " + (dan*i));
				
			}
			System.out.println();
		}
		
	}
}
