package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = {3,2,5,4,1};

		//--- ���� ��� ---
		System.out.println("--- ���� �� ---");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		//-----------------


		//--- ���� ���� ---

		for(int i=0; i<arr.length-1; i++) { //ROUND �ݺ�, length-1��

			for(int j=0; j<arr.length-1-i; j++) { //�� ROUND, i, 0~length-2

				if(arr[j] > arr[j+1]) { //����:arr[1] ������:arr[2]

					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;

				}
			}

		}

		//-----------------


		//--- ���ĵ� ���� ��� ---
		System.out.println("--- ���� �� ---");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		//-----------------

//		Arrays.sort(arr);
		


	}
}
