package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {

		//break;
		//	����� �ߴܽ�Ű�� ������ �����ϴ� �ڵ�

		//	if�� �ȿ��� ����� ����������
		//	if���� �ߴܽ�Ű���� �ʴ´�

		// -> for, while, do-while, switch�� �ߴܽ�Ŵ

		//	����� ��ø�Ǿ��� ��� ���� ����� ���
		//	�� ���� �ߴܽ�Ų��

		for(int i=0; i<100; i++) { //i, 0~99, x100
			System.out.println(i);

			if( i >= 5 ) { //�߰����� ���ǽ����� ����Ѵ�
				break; //for���� �ߴܽ�Ų��
			}

		}

		//----------------------------------------------------------
		System.out.println("----------------");

		//continue;
		//	�ݺ������� ����ϴ� ��Ÿ���
		//	���� �ݺ����� �Ѿ��

		for(int i=0; i<10; i++) { //i, 0~99, x10
			
			if( i%2 == 0 ) { //¦���� ���
				continue; //���� �ݺ����� �Ѿ��
			}

			System.out.println(i);
		}

		// for�������� ���������� �Ѿ��		
		// while, do-while������ ���ǹ����� �Ѿ��
		
		// -> �ݺ������ڵ�({}�߰�ȣ)�� �ѱ��

	}
}
