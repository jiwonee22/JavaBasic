package java05_array;

public class Array_04 {
	public static void main(String[] args) {
		
		//���ڿ�, String
		//	char������ ������ char[](���� �迭)�� ������ ����Ѵ�
		
		//	������, char[]�� String�� ���� ������Ÿ���� �ƴϴ�
		
		//---------------------------------------------------------
		
		String str = "Apple";
		
		char[] chArr = {'A', 'P', 'P', 'L', 'E'};
		
		//---------------------------------------------------------
		
		System.out.println("���ڿ��� ���� : " + str.length());
		System.out.println("char�� �迭�� ���� : " + chArr.length);
		
		System.out.println("-----------------");
		
		System.out.println("���ڿ��� ����° ���� : " + str.charAt(2));
		System.out.println("�迭�� �׹�° ���� : " + chArr[3]);

		System.out.println("-----------------");

		// toCharArray() : String�� char[]�� ��ȯ�Ͽ� ��ȯ�ϴ� ���
		char[] converted = str.toCharArray();
		
		System.out.println("�迭�� �׹�° ���� : " + converted[3]);

	}
}
