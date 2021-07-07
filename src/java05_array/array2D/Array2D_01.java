package java05_array.array2D;

public class Array2D_01 {
	public static void main(String[] args) {
		
		//2차원 배열
		
		int num; //int형 변수 -> 정수값 1개 저장
		
		int[] arr1D; //int형 배열 -> int형 변수 여러 개(묶음)
		
		int[][] arr2D; //int형 2차원 배열 -> int형 배열 여러 개(묶음)
		
		//-------------------------------------------------------------
		
		//2차원 배열 생성
		int[][] arr = new int[2][3];
		// -> 2행 3열짜리 int형 변수공간으로 이루어진 표가 생성된다
		
		arr[1][2] = 555; //1번째 행, 2번째 열
		System.out.println( arr[1][2] );
			
		//-------------------------------------------------------------
		
		int[] arr2; //추천
		int arr3[];
		
		int[][] arr4; //추천
		int[] arr5[];
		int arr6[][];
		
				
	}

}
