package java01_variables;

public class VariablesEx_06 {

	public static void main(String[] args) {
	
		System.out.println(777); //int�� ���ͷ� ��� 777
		
		//------------------------------------------------------------------
		
		//������ ���ȭ (�̸��ִ� ���)
		final int MAX;
		
		MAX = 100; //�ѹ��� ���� ����
//		MAX = 200; //����, �ٽ� ���� �Ұ�
//		MAX = 300; //����, �ٽ� ���� �Ұ�
		
		//���������� �̸��ִ� ����� �̸��� ��� �빮�ڷ� �ۼ��Ѵ�
		// -> �Ϲ� ������ �����ϱ� ����
		
		//����̸��� �ܾ� ������ Snake Case�� �����Ѵ� (_ �̿�)
		// e.g.) final int MAX_PEOPLE_COUNT = 30;
		
		//------------------------------------------------------------------
		
		// e.g.) �л����� ������ ���ϴ� ���α׷�
		//		 ��ü �ο��� 50�� -> 49 -> 52
				 
		final int STUDENT_TOTAL_NUM = 52;

		System.out.println("�л� " + STUDENT_TOTAL_NUM + "�� ���� ��հ�");
		double average = 1000 / STUDENT_TOTAL_NUM;
		
		System.out.println("��� : " + average);
		
	}
	
}
