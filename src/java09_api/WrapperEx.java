package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		int i1 = 10; //int타입변수 (기본형)
		
		//Integer타입 (참조형)
		Integer iVal1 = new Integer( 20 ); //박싱, Boxing
		Integer iVal2 = new Integer( i1 ); //박싱, Boxing
		
		Integer iVal3 = new Integer( "30" ); //String -> Integer
		
		System.out.println( iVal1 );
		System.out.println( iVal2 );
		System.out.println( iVal3 );
		
		System.out.println("----------");
		
		//Integer -> int
		int i2 = iVal2.intValue(); //언박싱, Unboxing
		
		System.out.println("----------");
		
		//오토 박싱, Auto Boxing
		
		Integer iVal4 = 1234;
		Double dVal1 = 123.4567;
		
		System.out.println("----------");
		
		//오토 언박싱, Auto Unboxing
		
		int i4 = iVal4;
		double d1 = dVal1;
		
		System.out.println("----------");
		
		//자료형에 대한 정보
		
		System.out.println("BYTES: " + Integer.BYTES); // 4 B
		System.out.println("SIZE: " + Integer.SIZE); // 32 bit
		
		System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);//최소값
		System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);//최대값
		
		System.out.println("----------");
		
		//문자열 파싱(parsing)
		//	**parse - 추출하다
		
		//	문자열에서 원하는 형식의 데이터를 추출하는 것
		
		//String -> int
		int num1 = Integer.parseInt( "1234" );
		System.out.println( num1 );
	
		//String -> double
		double d = Double.parseDouble( "3.14" );
		System.out.println( d );
		
		System.out.println("----------");

		//java.lang.NumberFormatException 발생
		//	-> 파싱하려는 문자열이 숫자형식(NumberFormat)이 아닐 경우 발생하는 예외
//		int num2 = Integer.parseInt( "123ABC" );
		
	}
}





















