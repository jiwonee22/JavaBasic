package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력
		//	-> 2~9단 전부 출력
		
		int i=2;
		while (i<10) {
			
			int j=1;
			System.out.println();
			
			while (j<10) {
				System.out.print(i + " X "+ j + " = " + (i*j) + "\t");
				
				j++;
			}
			System.out.println();

			i++;			
		}
	
	}
}
