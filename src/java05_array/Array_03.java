package java05_array;

public class Array_03 {
	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

		//배열의 요소 개수
		//	== 배열의 길이
		//	-- 배열의 크기

		System.out.println("배열의 길이 : " + arr.length);

		//----------------------------------------------------------
		
		System.out.println("-------------");
		
		//i, 0 ~ length-1, length 번
		for(int i=0; i<arr.length; i++) {
			System.out.println( arr[i] );
		}
		
		System.out.println("-------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println( arr[i] );
		}

		//-------------------------------------------------
		
//		arr[33] = 999;
		//ArrayIndexOutOfBoundsException
		//	0보다 작거나, length보다 크거나 같은 인덱스로 접근했을 때 발생한다
		
//		arr[-7] = 999;
		//ArrayIndexOutOfBoundsException

		//-----------------------------------------
		
//		int[] arr2 = new int[-10];
		//NegativeArraySizeException
		//	배열의 크기를 음수로 지정하여 생성하려고 할 때 발생한다
		
	}
}
