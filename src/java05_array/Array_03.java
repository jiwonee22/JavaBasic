package java05_array;

public class Array_03 {
	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

		//�迭�� ��� ����
		//	== �迭�� ����
		//	-- �迭�� ũ��

		System.out.println("�迭�� ���� : " + arr.length);

		//----------------------------------------------------------
		
		System.out.println("-------------");
		
		//i, 0 ~ length-1, length ��
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
		//	0���� �۰ų�, length���� ũ�ų� ���� �ε����� �������� �� �߻��Ѵ�
		
//		arr[-7] = 999;
		//ArrayIndexOutOfBoundsException

		//-----------------------------------------
		
//		int[] arr2 = new int[-10];
		//NegativeArraySizeException
		//	�迭�� ũ�⸦ ������ �����Ͽ� �����Ϸ��� �� �� �߻��Ѵ�
		
	}
}
