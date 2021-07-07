package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		//������ �� �����ϱ�
		int num1 = 100;
		int num2;
		
		num2 = num1; //num1�� ���� num2�� �����
//		num2 = 100; //num1������ Ȱ��
		
		System.out.println("num1 : num2 = " + num1 + " : " + num2);
		
		System.out.println("--------------------------------------");
		
		//�迭 �����ϱ�
		int[] arr1 = {10, 20, 30};
		int[] arr2;
		
		arr2 = arr1; //�迭 ����
		
		//--- ���� ����, Shallow Copy ---
		//	���� ����� ������(�ּҰ�)�� ����Ǵ� ����
		
		//	 �����͸� �����ϰ� �ִ� ����(new�� ������ ����)�� ������� �ʴ´�
		
		//	 ����, �纻 ������ ���� �� �� ���� �޸� ������ �����ϰ� �ְ� �ȴ�
		
		//----------------------------------------------------------------------
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		
		arr1[1] = 999; //arr1�� 1��° ��Ҹ� �����͸� ������
	
		System.out.println();
		System.out.println("--- 1��° ��Ұ� ���� �� ---");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}

	
	}
}
