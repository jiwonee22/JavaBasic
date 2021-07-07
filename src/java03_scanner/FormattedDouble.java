package java03_scanner;

public class FormattedDouble {
	public static void main(String[] args) {
		
		//�Ҽ��� �ڸ����� �����Ͽ� ����Ѵ�
		
		//��� 1.
		//	System.out.printf() �� ����Ѵ�
		//	( printf - print formatted)
		
		//	���Ĺ��ڸ� �̿��Ͽ� ����� ���ڿ��� ������ �����Ѵ�
		
		//	���Ĺ��� ����
		//		%d - 10�������� ��������
		//		%f - �Ǽ� ����
		//		%s - ���ڿ� ����
		//		%c - ���Ϲ��� ����
		
		System.out.printf("%d",1234);
		System.out.println(); //�ٹٲ�, ����

		//7���ڰ� �� �ڸ��� Ȯ���ϰ� ������ 1234�� �� �ڸ��� �־ ����Ѵ�(����������)
		System.out.printf("%7d", 1234);
		System.out.println();
		
		System.out.printf("%5s%5s%5s", "kor", "eng", "math");
		System.out.println();
		System.out.printf("%5d%5d%5d", 100, 99 ,97);
		System.out.println();
		
		//�Ҽ��� ���� �ڸ����� ������ �� ����� �� �ִ� - %.2f (�Ҽ������� 2�ڸ� Ȯ��)
		System.out.printf("%.3f", 123.5465);
		System.out.println();
		System.out.printf("%.3f", 123.4);
		System.out.println();

		//------------------------------------------------------------------------------------------
		
		//��� 2. 
		//	String.format("���Ĺ��������ϴ¹��ڿ�", ������, ...)
		//	 -> ���Ĺ��ڸ� ������ ���ڿ� ����� �����Ѵ�
		
		String str = String.format("%7.2f", 123.4567);
		System.out.println(str);
		
		System.out.println(String.format("%3d��",41));
		System.out.println(String.format("%3d��",100));
		
		//------------------------------------------------------------------------------------------

		//��� 3.
		//	������ ������� �Ҽ������� �ڸ��� �����ϱ�
		
		//	123.45678
		//		x100 -> 12345.678
		//		�Ҽ��κ� �ݿø� -> 12346
		//		/100 -> 123.46
		
		double avg = 34.8765;
		
		double result = Math.round( avg * 100 ) / (double)100;
		System.out.println(result);
		
		//** Math.round(�Ǽ�)
		// �־��� �Ǽ�(double, float)�� �Ҽ��κ��� �ݿø��Ͽ�
		// ����(long, int)Ÿ������ ��ȯ�Ѵ�
		
	}
}
