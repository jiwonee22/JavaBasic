package java04_control.condition;

public class IfEx_02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if( num == 15 ) {
			System.out.println("HI");
		}
		System.out.println("Hello");
		
		//-------------------------------------------------------------------------------
		
		// {}중괄호는 여러 개의 코드를 묶어주는 역할을 한다
		// 코드 실행 순서에는 영향을 주지 않는다
		
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");	
		}
		
		//-------------------------------------------------------------------------------

		//	제어문은 해당 제어문 다음에 오는 코드 한 개 또는 {}중괄호 를
		//제어한다(영향을 준다)
		
		if( false ) {
			System.out.println("코드 11111"); //실행안됨
		}
		System.out.println("코드 22222");
		
		//-------------------------------------------------------------------------------
		System.out.println("---------------");
		
		//제어문의 ()괄호 뒤에 ; 을 붙이지 않도록 조심하세요!
		
		if( false ) {
			System.out.println("HI");
			System.out.println("HELLO");
			System.out.println("HOLA");
			
		}
		
	}
}

