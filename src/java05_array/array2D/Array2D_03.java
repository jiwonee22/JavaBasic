package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		int[][] arr; //int�� 2���� �迭 ���� ����
		
		arr = new int[3][]; //�迭 ���� -> int[] �� �迭
		
		arr[0] = new int[4]; //�迭 ���� -> int�� �迭
		arr[1] = new int[2];
		arr[2] = new int[6];
		
		//-----------------------------------------
		
		System.out.println( arr.length ); //���� ����
		System.out.println("---------");
		
		System.out.println( arr[0].length); //0���� �� ����
		System.out.println( arr[1].length); //1���� �� ����
		System.out.println( arr[2].length); //2���� �� ����
		
		System.out.println("---------");
		
		for(int i=0; i<arr.length; i++) { //i��
			for(int j=0; j<arr[i].length; j++) { //j��
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
