package java05_array.quiz2D;

public class quiz2D_05 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int k = 1;

		for(int l=0; l<9; l++) {
			if(l%4 == 0) {
				
				for (int i = 0; i < arr.length-1; i++) { //i행, 0~4
					for (int j = 0; j < arr[i].length-1; j++) { //j열, 0~4

						arr[i][j] = k++;

					}
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) { //i행
			for (int j = 0; j < arr[i].length; j++) { //j열
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
