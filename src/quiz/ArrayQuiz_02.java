package quiz;

public class ArrayQuiz_02 {
	public static void main(String[] args) {

		//		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		//		 �迭�� ����� �� ������ Ǫ�ÿ�
		//
		//
		//		 - arr �迭�� invert_arr��� �迭�� �Ųٷ� �Է��Ͻÿ�
		//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
		//
		//
		//		 - arr �迭��
		//		  (¦����° �ε��� ������ ��) - (Ȧ����° �ε��� ������ ��)��
		//		  ���Ͻÿ�
		//		  	=> -5
		//
		//
		//		 - arr �迭�� ���ڵ� �� ���� ���ڰ� 1���� �ǰ��Ͽ�
		//		  rank_arr��� �迭�� ������ �Է��Ͻÿ�
		//		 	=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
		//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
		//
		//
		//		 - arr �迭�� ��ҵ� �� �ߺ��� ���� over_arr�� �ְ� �ߺ�����
		//		  ���� ���� ret_arr�� �Է��Ͻÿ�
		//		 	** over_arr, ret_arr�� ���̰� 10�� �迭�� �ۼ��Ѵ�
		//		 	
		//		 	����Ѵٸ� (���ĵ� �� �� ������ �ص� ��)
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
		System.out.print("(¦����° �ε��� ������ ��) - (Ȧ����° �ε��� ������ ��) : ");
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





