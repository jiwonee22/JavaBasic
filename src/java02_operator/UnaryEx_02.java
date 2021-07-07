package java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) {
		
		//단항연산자 - 증감
		//	++ : 증가 연산자
		//	-- : 감소 연산자
		
		//	피연산자로 적용한 변수의 값을 1 증가(감소)시킨다
		
		//---------------------------------------------------------
		
		int num;
		
		num = 15; // 변수의 값을 15로 초기화
		System.out.println( num ); //원본값
		System.out.println( num-- ); //감소연산, 후위 감소, 후치 감소
		System.out.println( num ); // 감소연산 후
		
		System.out.println("-----------");
		
		num = 15; // 변수의 값을 15로 초기화
		System.out.println( num ); //원본값
		System.out.println( --num ); //감소연산, 전위 감소, 전치 감소
		System.out.println( num ); // 감소연산 후
		
		//** 전위 증감연산자는 변수의 값을 활용하기 전에 증감 시킨다
		//** 후위 증감연산자는 변수의 값을 활용하고난 후 에 변수의 값을 증감시킨다
		
		//---------------------------------------------------------
		System.out.println("-----------");

		num = 13;
		
		System.out.println( num++ -10 + ++num );
		
	}
}
