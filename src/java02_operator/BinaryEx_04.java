package java02_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		
		//���׿����� - ��
		//		&&		||		!
		//		AND		OR		NOT
		
		//		!�����ڴ� ���� ������
		
		//		|, vertical bar, ���� �� (shift + \)
		
		//		���� Ÿ��(boolean) �������� ���踦 ������ ����� ��ȯ�ϴ� ������
		
		//		AND ������ �ǿ����ڰ� ��� true�� �� ����� true
		//		OR ������ �ǿ����ڰ� �� �� �ϳ��� true�� �� ����� true
		
		//		NOT ������ �ǿ������� ���� ������(�ݴ�� �ٲ�)
		
		//-----------------------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2)); //false
		System.out.println("true||false : " + (b1||b2)); //true
		
		//-----------------------------------------------------------------------------
		
		int num = 77;
		
		System.out.println(num >= 1);	//true
		System.out.println(num <= 100);	//true
		
		System.out.println(num >= 1 && num <= 100); //true
		System.out.println(77 >= 1 && 77 <= 100); //����Ȱ��	
		System.out.println(true && 77<=100); //77>=1 ���� ����
		System.out.println(true && true); //77<=100 ���� ����
		System.out.println(true); //true && true ���� ����
		//	-> num������ 1���� ũ�ų� ���� �׸��� 100���� �۰ų� ���� �����ΰ�?
		
		//	-> num�� ���� 1~00 ������ �����ΰ�
		
		
		//-----------------------------------------------------------------------------

//		System.out.println(1 <= num <= 100); //�߸��� ���
//		System.out.println(1 <= 77 <= 100); //���� Ȱ��
//		System.out.println(true <= 100); //1 <= 77 ���� ����
//		System.out.println(true <= 100); //boolean�����Ϳ� int���� <=(ge) ������ �� ����
		
		//-----------------------------------------------------------------------------
		System.out.println("-----------");
		
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		//-----------------------------------------------------------------------------
		System.out.println("-----------");

		System.out.println(!(num >= 1 && num <= 100)); //1~100������ ������ �ƴѰ�?
		
		// !�������������� ����
		//	���迬���ڴ� �ݴ�� ��ȯ�Ѵ�
		//	�������ڴ� && -> ||, || -> &&
		
//		System.out.println(!(num >= 1) !(&&) !(num <= 100)); //�й��Ģ
		
		System.out.println(num < 1 || num > 100);
		//	-> num������ 1���� �۰ų� 100���� ū��?

		
		
		
	}
	
}
