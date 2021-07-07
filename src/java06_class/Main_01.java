package java06_class;

//실행 클래스 - 메인 메소드가 정의되어 있는 클래스
//	-> 프로그램의 시작
//	-> 실행 가능하다

public class Main_01 {
	public static void main(String[] args) {
		System.out.println("main() 실행 테스트");
	
		//----------------------------------------
		
		//**모든 클래스는 각각의 데이터타입으로 생각한다
		//	-> 클래스는 참조형 데이터타입이다
		
		//----------------------------------------
		
		//Class_01 타입의 변수인 c01 선언
		Class_01 c01; //객체 변수
		
		// Class_01 타입의 인스턴스를 생성하고,
		//참조값을 c01 변수에 저장(대입)
		c01 = new Class_01(); //인스턴스화, 객체생성
		
		//멤버필드에 값 대입하기
		c01.num = 100;
		c01.data = "Apple";
		
		//c01객체의 멤버필드 num, data 값 출력하기
		System.out.println( c01.num );
		System.out.println( c01.data );
		
		//------------------------------------------
		System.out.println("----------");
		
		//객체 변수 출력하기
		//	-> 레퍼런스(참조값)가 기본으로 출력된다		
		System.out.println( c01 );
		

		//------------------------------------------
		System.out.println("----------");
		
		//c01객체변수를 이용해 멤버 메소드 호출하기
		//	-> 메소드 이름 뒤에 ()괄호를 붙여서 사용한다
		c01.display();
		
		//------------------------------------------
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		c05.num = 500;
		
		
		
	}
}
