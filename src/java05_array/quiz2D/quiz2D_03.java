package java05_array.quiz2D;

public class quiz2D_03 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int k = 1;


		//�Է� (���� ���ļ� �ذ��� ��!)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[j][i] = k++;

			}
		}

		
		//���2
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = 0; j < arr[i].length; i++) {
//				
//				arr[i][j] = k++;
//
//			}
//		}
		

		//��� (�״�� �� ��!)
		for (int i = 0; i < arr.length; i++) { //i��
			for (int j = 0; j < arr[i].length; j++) { //j��
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

