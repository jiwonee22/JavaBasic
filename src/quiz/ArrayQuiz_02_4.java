package quiz;

public class ArrayQuiz_02_4 {
	public static void main(String[] args) {

		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

		int[] over_arr = new int [arr.length]; //�ߺ��� �迭
		int[] ret_arr = new int[arr.length]; //�ߺ��� �ƴ� �� �迭

		int overCnt = 0; //�ߺ����� ����
		int retCnt = 0; //�ߺ��� �ƴ� ���� ����		

		for(int i=0; i<arr.length; i++) { //���ذ�

			boolean isOverlap = false; //�ߺ����̸� true


			//�̹� �ߺ������� �Ǻ��� �������� Ȯ��
			for(int j=0; j<over_arr.length; j++) {
				if(arr[i] == over_arr[j]) {
					isOverlap = true;
					break;
				}
			}

			//������ �ߺ������� �Ǻ��� ���ڶ�� �ǳʶ�
			if( isOverlap ) {
				continue;

			} else {

				// ���غ��� ���� �ε���(���ذ��� ������ ��ҵ�)��
				//�ߺ����� �ִ��� Ȯ���Ѵ�
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] == arr[j]) { //�ߺ��� �߰�
						isOverlap = true; 
						break;
					}

				}

			}

			//���� ó��
			if(isOverlap) {
				over_arr[overCnt++] = arr[i];
			} else {
				ret_arr[retCnt++] = arr[i];

			}

		}
		
		
		//--- ���� ���� ---
		for(int i=0; i<over_arr.length-1; i++) {
			for(int j=0; j<over_arr.length-1-i; j++) {
				//0�� �������� ����
				
				if(over_arr[j] > over_arr[j+1] && over_arr[j+1] != 0) {
					int tmp = over_arr[j];
					over_arr[j] = over_arr[j+1];
					over_arr[j+1] = tmp;
				}
				
			}
		}
		
		for(int i=0; i<ret_arr.length-1; i++) {
			for(int j=0; j<ret_arr.length-1-i; j++) {
				//0�� �������� ����
				
				if(ret_arr[j] > ret_arr[j+1] && ret_arr[j+1] != 0) {
					int tmp = ret_arr[j];
					ret_arr[j] = ret_arr[j+1];
					ret_arr[j+1] = tmp;
				}
				
			}
		}
		
		
		//-----------------
		
		
		
		
		

		//--- ���� ��� ---
		System.out.print("Overlap : ");
		for(int i=0; i<overCnt; i++) {
			System.out.print(over_arr[i] + " ");
		}

		System.out.println();

		System.out.print("Return : ");
		for(int i=0; i<retCnt; i++) {
			System.out.print(ret_arr[i] + " ");
		}

		System.out.println();
	}
}
