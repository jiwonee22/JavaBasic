package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {

		//�ݺ��������� i ������ ���� ����Ѵ�
		//	**iterate�� ù ���ڸ� ����ϴ� ���̴�

		for( int i=0; i<10; i++ ) {
			System.out.println( i ); //0~9
		}

		//i������ 0����; 10���� ���� ���ȿ�; 1�� �����ϸ鼭 �ݺ��Ѵ�

		//�ݺ�Ƚ�� : 10��
		//�ݺ����� : 0 ~ 9

		//** for���� �ʱ�Ŀ��� ����� ������ for���� ����Ǹ� ���ŵȴ�
		//		System.out.println( i );

		//------------------------------------------------------------------
		System.out.println("--------");

		int i;

		for( i=0; i<10; i++ ) {
			System.out.println( i );
		}

		System.out.println( "�ݺ����� ����� ���� : " + i );

	}

}
