package java05_array.quiz2D;

public class quiz2D_06 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int k = 1;

		for (int i = 0; i < arr.length; i++) { //i행, 0~4
			if( i%2 == 0) {

				for (int j = 0; j < arr[i].length; j++) { //j열, 0~4

					arr[i][j] = k++;
				}
			} else {

				for (int j = arr[i].length-1; j >=0; j--) {

					arr[i][j] = k++;
				}
			}

		}

			//출력 (그대로 둘 것!)
			for (int i = 0; i < arr.length; i++) { //i행
				for (int j = 0; j < arr[i].length; j++) { //j열
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

		

	}
}


