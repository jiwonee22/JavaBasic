package java06_class.method;

public class MethodEx {
	public static void main(String[] args) {
		
		Method_01 m01 = new Method_01(); //��ü ����
		
		//�޼ҵ�ȣ���� return���� result ������ �����Ѵ�
		int result = m01.add( 11 , 22 ); //�޼ҵ� ȣ��
		
		System.out.println("������ ��� : " + result);
		
		//-----------------------------------------------
		
		//�޼ҵ� ȣ���� return���� ��ٷ� ��¿� ����ϱ�
		System.out.println("������ ��� : " + m01.add( 111, 222 ));
		
		
		System.out.println("--- Method_02 -----------------");
		
		Method_02 m02 = new Method_02();
		
		m02.method1();
		
		m02.method2( 111 );
		
		System.out.println("��ȯ�� �� : " + m02.returnNum());
		
		System.out.println("���� ��� : " + m02.plus(100, 200));
	}
}
