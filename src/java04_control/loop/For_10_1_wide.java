package java04_control.loop;

public class For_10_1_wide {
	public static void main(String[] args) {
		
		
		for(int dan=2; dan<=9; dan++) {//dan변수, 2~9, 8번

			for(int i=1; i<=9; i++) {//i변수, 1~9, 9번
				
				System.out.print(dan + " x " + i + " = " + (dan*i) + "\t");
				
			}
			
			System.out.println(); //각 단 출력한 후 줄바꿈
		}
		
	}
}
