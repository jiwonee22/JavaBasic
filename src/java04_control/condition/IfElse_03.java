package java04_control.condition;

public class IfElse_03 {
	public static void main(String[] args) {

		int num = 88;

		if( num>0 && num<=100 ) {
			System.out.println("1~100������ ����");
		}

		System.out.println("-----------");

		//�鿩���� �ڵ� ���� ����Ű : ctrl + i
		//	-> ������ �ڵ�麸�� ��, �Ʒ��� �� �� �� �����ؼ� ����Ѵ�.

		// ��ü�ڵ� ���� : ctrl + a
		// �鿩���� ���� : ctrl + i

		if ( num>0 ) {
			System.out.println("0���� ũ��");

			if ( num<=100 ) {
				System.out.println("0���� ũ��");
				System.out.println("100���� �۰ų� ����");
			} // if ( num<=100 ) end

			System.out.println("0���� ũ��");
			
		} else {
			System.out.println("0���� ũ�� �ʴ�");

			if ( num==0 ) {
				System.out.println("0�� ����");
			} else {
				System.out.println("0�� ���� �ʴ�");
				System.out.println("0���� �۴�");
			}
		}

	}
}
