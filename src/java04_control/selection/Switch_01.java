package java04_control.selection;

public class Switch_01 {
	public static void main(String[] args) {

		//switch��, ���ù�
		//	-> switch-case��

		//		switch( �񱳴�� ) {
		//		
		//		case ��1 :
		//		
		//		case ��2 :
		//			
		//		case ��3 :
		//			
		//			...
		//			
		//		default:	



		//	�񱳴���� ��(����)�� case�� ������ ���� ������
		//	�ش� case��������ġ���� �ڵ尡 ����ȴ�

		//	case�� ������ �� �߿��� ���� ���� ������
		//	default: ���� �����Ѵ�
		//	default: �� ���� ����


		//--------------------------------------------------------

		int num = 20;

		switch( num ) {
		case 10:
			System.out.println("num�� 10�Դϴ�");
			break;
			
		case 20:
			System.out.println("num�� 20�Դϴ�");
			break;
			
		case 30:
			System.out.println("num�� 30�Դϴ�");
			break;
			
		default:
			System.out.println("num�� 10, 20, 30 ��� �ƴմϴ�");
		}

		//case������ �������� break; �ڵ带 �����ؼ� ����Ѵ�



	}
}
