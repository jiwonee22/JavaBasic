package java06_class;

public class Main_02 {
	public static void main(String[] args) {
		
		//** 기본값
//		int형 - 0
//		double형 - 0.0
//		boolean형 - false
//		char - '\0' (null 문자)
//		
//		float - 0.0f
//		long - 0L
		
		//------------------------------------
		
		//**참조형의 기본값
		
		//	null
		//	 참조대상이 없는 상태
		
		//------------------------------------
		
		Class_02 cl = null; //객체 변수 선언
		
		cl = new Class_02(); //객체 생성, 인스턴스화
		
		//멤버 필드값 출력
		System.out.println( cl.num4 ); //public
		System.out.println( cl.num3 ); //protected
		System.out.println( cl.num2 ); //default, package
		
//		System.out.println( cl.num1 ); //private, 에러
		
		
	}
}
