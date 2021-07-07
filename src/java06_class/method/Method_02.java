package java06_class.method;

public class Method_02 {
		
		//매개변수(parameter) - 전달인자(argument)
		
		//반환데이터(return)
	
		//------------------------------------------------------------
		
		//매개변수X, 반환데이터X
		
		public void method1() {
			System.out.println("Hello");
		}
		

		//------------------------------------------------------------
		
		//매개변수O, 반환데이터X
		
		public void method2( int parameter ) {
			System.out.println("전달된 값 : " + parameter);
		}
		
		
		//------------------------------------------------------------
		
		//매개변수X, 반환데이터O
		
		public int returnNum() {
			
			return 123;
		}
		
		
		//------------------------------------------------------------
		
		//매개변수O, 반환데이터O
		
		public int plus(int n1, int n2) {
			return n1 + n2;
		}
	
		
}
