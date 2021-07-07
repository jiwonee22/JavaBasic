package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		int[][] arr; //int형 2차원 배열 변수 선언
		
		arr = new int[3][]; //배열 생성 -> int[] 형 배열
		
		arr[0] = new int[4]; //배열 생성 -> int형 배열
		arr[1] = new int[2];
		arr[2] = new int[6];
		
		//-----------------------------------------
		
		System.out.println( arr.length ); //행의 길이
		System.out.println("---------");
		
		System.out.println( arr[0].length); //0행의 열 길이
		System.out.println( arr[1].length); //1행의 열 길이
		System.out.println( arr[2].length); //2행의 열 길이
		
		System.out.println("---------");
		
		for(int i=0; i<arr.length; i++) { //i행
			for(int j=0; j<arr[i].length; j++) { //j열
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
