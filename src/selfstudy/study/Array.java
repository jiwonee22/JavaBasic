package selfstudy.study;

public class Array {
	public static void main(String[] args) {
		
		int[][] arr1 = new int[5][5];

		int k = 1;
				
		//Q1.
		System.out.println("Q1.");
		System.out.println();
		//입력 (여기 고쳐서 해결할 것!)
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				arr1[i][j] = k++;

			}
		}


		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr1.length; i++) { //i행
			for (int j = 0; j < arr1[i].length; j++) { //j열
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		System.out.println();
		
		//-----------------------------------------------------------
		
		int[][] arr2 = new int[5][5];

		k = 1;
		
		//Q2.
		System.out.println("Q2.");
		System.out.println();
		//입력 (여기 고쳐서 해결할 것!)
		for (int i = 0; i < arr2.length; i++) {
			for (int j = arr2[i].length-1; j>=0; j--) {

				arr2[i][j] = k++;

			}
		}


		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr2.length; i++) { //i행
			for (int j = 0; j < arr2[i].length; j++) { //j열
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		
		//-----------------------------------------------------------
		
		int[][] arr3 = new int[5][5];
		
		k = 1;
		
		//Q3.
		System.out.println("Q3.");
		System.out.println();
		//입력 (여기 고쳐서 해결할 것!)
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {

				arr3[j][i] = k++;

			}
		}
		
		
		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr3.length; i++) { //i행
			for (int j = 0; j < arr3[i].length; j++) { //j열
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		
		//-----------------------------------------------------------
		
		int[][] arr4 = new int[5][5];
		
		k = 1;
		
		//Q4.
		System.out.println("Q4.");
		System.out.println();
		//입력 (여기 고쳐서 해결할 것!)
		for (int i = 0; i < arr4.length; i++) { 
			for (int j = arr4[i].length-1; j>=0; j--) { 

				arr4[j][i] = k++;

			}
		}
		
		
		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr4.length; i++) { //i행
			for (int j = 0; j < arr4[i].length; j++) { //j열
				System.out.print(arr4[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		
		//-----------------------------------------------------------
		
		int[][] arr5 = new int[5][5];
		
		k = 1;
		
		//Q5.
		System.out.println("Q5.");
		System.out.println();
		//입력 (여기 고쳐서 해결할 것!)
		for(int l=0; l<9; l++) {
			if(l%4 == 1) {
				for (int i = 0; i < arr5.length; i++) {
					for (int j = 0; j < arr5[i].length; j++) {

						arr1[i][j] = k++;

					}
				}
			}
			
		}
		
		
		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr5.length; i++) { //i행
			for (int j = 0; j < arr5[i].length; j++) { //j열
				System.out.print(arr5[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
