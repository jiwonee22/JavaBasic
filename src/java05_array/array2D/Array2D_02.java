package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1차원 배열의 선언과 동시에 초기화
		int[] arr1D = { 1,2,3,4,5 };
		
		//2차원 배열의 선언과 동시에 초기화
		int[][] arr2D = { 
				{ 1,2,3 }, 
				{ 4,5,6 }, 
				{ 7,8,9 } 
			};
		// -> 3행 3열의 2차원 배열 생성
		// -> 3x3배열, 3 by 3 array
		
		//-------------------------------------------------------------------------------
		
		arr2D = new int[4][3]; //4x3배열 새로 생성
		
		for(int i=0; i<4; i++) { //i행, 0~3
			for(int j=0; j<3; j++) { //j열, 0~2
				
				arr2D[i][j] = (i+1)*10 + (j+1);
				
			}
		}
		
		//2차원 배열의 모든 값 출력
		for(int i=0; i<4; i++) { //i행, 0~3
			for(int j=0; j<3; j++) { //j열, 0~2
				
					System.out.print(arr2D[i][j] + " ");
		
			}
		}
		
		
	}
}
