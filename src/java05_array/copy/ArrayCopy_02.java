package java05_array.copy;

public class ArrayCopy_02 {
	public static void main(String[] args) {
		
		//�迭 �����ϱ� - ���� ����
		
		int [] arr1 = {10, 20, 30}; //����, Source
		int [] arr2;				//�纻, Destination
		
		//--- ���� ����, Deep Copy ---
		//	���� ����� ���빰�� ���ο� ������ �����ϴ� ��
		
		//	���������Ϳ� �и��� ��������� ������ �ȴ�
		//----------------------------
		
		//1. ����� ������ ���� �����Ѵ�
		arr2 = new int[arr1.length];
		
		//2. �����͸� �����Ѵ�(for�� �̿�)
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i]; //�纻 <- ����
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		
		arr1[1] = 888; //arr1�� 1��° ��Ҹ� �����͸� ������
	
		System.out.println();
		System.out.println("--- 1��° ��Ұ� ���� �� ---");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		
	}
}
