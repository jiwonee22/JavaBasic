package java06_class.method;

public class Method_02 {
		
		//�Ű�����(parameter) - ��������(argument)
		
		//��ȯ������(return)
	
		//------------------------------------------------------------
		
		//�Ű�����X, ��ȯ������X
		
		public void method1() {
			System.out.println("Hello");
		}
		

		//------------------------------------------------------------
		
		//�Ű�����O, ��ȯ������X
		
		public void method2( int parameter ) {
			System.out.println("���޵� �� : " + parameter);
		}
		
		
		//------------------------------------------------------------
		
		//�Ű�����X, ��ȯ������O
		
		public int returnNum() {
			
			return 123;
		}
		
		
		//------------------------------------------------------------
		
		//�Ű�����O, ��ȯ������O
		
		public int plus(int n1, int n2) {
			return n1 + n2;
		}
	
		
}
