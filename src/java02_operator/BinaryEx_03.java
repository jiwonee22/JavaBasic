package java02_operator;

public class BinaryEx_03 {

	public static void main(String[] args) {

		//���׿����� - ����, ��
		
		//	<	less than			lt
		//	>	greater than		gt
		//	<=	less than equal		le
		//	=<	greater than equal	ge
		//	==	equal				eq
		//	!=	not equal			ne
		
		//	���� �ǿ����ڸ� �������� ������ �ǿ����ڸ� ���Ͽ�
		//	����� ��/�������� ��ȯ (booleanŸ������ ��ȯ�Ѵ�)
		
		//	-> true/false ��ȯ�Ѵ�
		
		//----------------------------------------------------------------
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1==num2 : " + (num1==num2)); //false
//		System.out.println("num1==num2 : " + (10==20)); //false
		
		System.out.println("num1!=num2 : " + (num1!=num2)); //true
//		System.out.println("num1!=num2 : " + (10!=20)); //true
		
		
		System.out.println("num1<num2 : " + (num1<num2)); //true
		System.out.println("num1>num2 : " + (num1>num2)); //false
		
		System.out.println("num1<=num2 : " + (num1<=num2)); //true
		System.out.println("num1>=num2 : " + (num1>=num2)); //false
		
		//---------------------------------------------------------------

		boolean result = num1==num2;
		System.out.println("��� : " + result);
		
	}

}
