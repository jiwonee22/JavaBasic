package java05_array.copy;

public class ArrayCopy_03 {
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
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
//		System.arraycopy( src, srcPos, dest, destPos, length )
		//	src : ���� �迭
		//	srcPos : ���� �迭���� ���簡 ���۵� �ε���
		//	dest : �纻 �迭
		//  destPos : �纻 �迭���� ���簡 ���۵� �ε���
		//	length : ���簡 �� ����� ����
	
		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		
		arr1[1] = 777; //arr1�� 1��° ��Ҹ� �����͸� ������
	
		System.out.println();
		System.out.println("--- 1��° ��Ұ� ���� �� ---");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		
	}
}
