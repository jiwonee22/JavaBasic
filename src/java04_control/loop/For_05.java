package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//1���� 10������ ������ ���ϱ� -> 55
		
		int sum = 0; //���� ���
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		
		System.out.println("���� : " + sum);
		
		//--------------------------------------------------------------------
		
		//����! - � ���� �ݺ������� ����(����)��ų���ΰ�
		
		//�ݺ�Ƚ�� : 10��
		//�ݺ����� : 1 ~ 10
		
		//�ʱ�� : int i=1;	(i����, �ݺ������� ���۰����� �����Ѵ�)
		//���ǽ� : i<=10;	(i����, �ݺ������� ���� or �ݺ� Ƚ��)
		//������ : i++		(1�� ����)	
		
		int total = 0;
		
		for ( int i=1; i<=10; i++ ) { //i, 1~10, x10
			
//			total = total + i;
			total += i;
			
		}	
		
		System.out.println("���� ��� : " + total);
	}
}
