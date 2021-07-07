package java04_control.star;

public class Star_06 {
	public static void main(String[] args) {

		for(int i=0; i<5; i++) { //i, 0~4, 5번

			for(int j=i+1; j<i+6; j++) { //j, 1~5, 5번
				System.out.print(j);
			}
			
			System.out.println();
		
		}
	}
}
