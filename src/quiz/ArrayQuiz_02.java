package quiz;

public class ArrayQuiz_02 {
	public static void main(String[] args) {

		//		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		//		 배열이 선언된 뒤 문제를 푸시오
		//
		//
		//		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
		//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
		//
		//
		//		 - arr 배열의
		//		  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
		//		  구하시오
		//		  	=> -5
		//
		//
		//		 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
		//		  rank_arr라는 배열에 순위를 입력하시오
		//		 	=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
		//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
		//
		//
		//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
		//		  않은 값은 ret_arr에 입력하시오
		//		 	** over_arr, ret_arr은 길이가 10인 배열로 작성한다
		//		 	
		//		 	출력한다면 (정렬도 할 수 있으면 해도 됨)
		//		 	=> over_arr : 9, 10
		//		 	=> ret_arr : 3, 8, 13, 17, 21, 27


		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

		//------------------------------------------------------------------

		int[] invert_arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

		for(int i=0; i<(invert_arr.length/2); i++) {


			int tmp = invert_arr[i];
			invert_arr[i] = arr[invert_arr.length-1-i];
			invert_arr[invert_arr.length-1-i] = tmp;

		}

		System.out.print("inver_arr : ");
		for(int i=0; i<invert_arr.length; i++) {
			System.out.print(invert_arr[i] + " ");
		}		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		//------------------------------------------------------------------

		int even_number = 0;

		int odd_number = 0;

		for(int i=0; i<arr.length; i+=2) { 

			even_number += arr[i];
		}

		for(int i=1; i<arr.length; i+=2) {

			odd_number += arr[i];
		}
		System.out.print("(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합) : ");
		System.out.println(even_number - odd_number);
		System.out.println("-------------------------------------------");

		//------------------------------------------------------------------

		int[] arr2 = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		int[] rank_arr = new int[arr.length];
	

		for(int i=0; i<arr2.length-1; i++) {

			for(int j=0; j<arr2.length-1-i; j++) {

				if(arr2[j] > arr2[j+1]) {

					int tmp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = tmp;

				}
			}
		}

//		for(int i=0; i<arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {

				if( arr[i] == arr2[j]) {
					rank_arr[i] = arr.length-j;
				}

			}


		}

		for(int i=0; i<rank_arr.length; i++) {
			System.out.print(rank_arr[i] + " ");
		}

		System.out.println();
		System.out.println("-------------------------------------------");

		//------------------------------------------------------------------


		
	}
}





