package java06_class.field;

public class MemberField_03 {

	//--- 멤버 필드 ---
	private int num1 = 777; //인스턴스 변수
	private static int num2 = 888; //클래스 변수
	//-----------------
	
	//일반 메소드
	public void method(int param) { //param - 매개변수, 지역변수
		
		System.out.println( num1 );
		System.out.println( num2 );
		
		//------------------------------------------------------
		
		int num1 = 101;
		int num2 = 202;
		
		System.out.println( num1 ); //지역변수
		System.out.println( num2 ); //지역변수
		
		//------------------------------------------------------
		
		System.out.println( this.num1 ); //멤버필드
		
//		System.out.println( this.num2 ); //멤버필드
		
		//정적 멤버필드는 정적인 방법으로 접근한다
		//	-> 클래스명 이용해서 접근
		System.out.println( MemberField_03.num2 ); //정적 멤버필드
		
	}
	
}













