package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = {3,2,5,4,1};

		//--- 원본 출력 ---
		System.out.println("--- 정렬 전 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		//-----------------


		//--- 버블 정렬 ---

		for(int i=0; i<arr.length-1; i++) { //ROUND 반복, length-1번

			for(int j=0; j<arr.length-1-i; j++) { //각 ROUND, i, 0~length-2

				if(arr[j] > arr[j+1]) { //왼쪽:arr[1] 오른쪽:arr[2]

					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;

				}
			}

		}

		//-----------------


		//--- 정렬된 이후 출력 ---
		System.out.println("--- 정렬 후 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		//-----------------

//		Arrays.sort(arr);
		


	}
}
