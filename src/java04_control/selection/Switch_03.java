package java04_control.selection;

public class Switch_03 {
	public static void main(String[] args) {

		//switch�� �񱳴���� �������� ��� �����ϴ�
		
		//--------------------------------------------------------
		
		//����(boolean) ������ ��� �Ұ�
		boolean b = true;
		
//		switch ( b ) {
//		}
		
		//--------------------------------------------------------
	
		//�Ǽ��� ������ ��� �Ұ�
		double d = 3.14;
		
//		switch ( d ) {
//		}	
		
		//--------------------------------------------------------
		
		//switch���� char�� ����ϱ�
		char alpha = 'B'; //������ ó���ȴ�
		
		switch ( alpha ) {
		case 'A':
			System.out.println("A����");
			break;
		
		case 'B':
			System.out.println("B�Դϴ�");
			break;
		
		case 'C':
			System.out.println("C��");
			break;
		
		default:
			System.out.println("A, B, C �� �ƴ�");
		}
	}

}
