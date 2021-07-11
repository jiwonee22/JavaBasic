package java06_class.field;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;
		
//		System.out.println(mf01.num); //에러,private
		System.out.println(mf01.getNum());
		
		mf02.setNum(777);
		System.out.println(mf02.getNum());
		
		//----------------------------------------------
		
//		System.out.println(mf03.getNum()); //인스턴스화 안함, 객체X, 실제 변수공간이 없음
		
		//** NullPointerException
		//		-> null참조값을 이용해 멤버에 접근하려고 하면 발생한다
		//		-> 예외가 뜨면 ".(참조연산자)" 왼쪽을 확인하면 된다		
		//		-> 엄청 자주 보이는 예외!! -> 꼭 기억하세요!!
		
		System.out.println();
		System.out.println("----- 클래스변수 테스트 -----");
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
		System.out.println(mf04.city);
		System.out.println(mf05.city);

		mf04.city = "Busan";
		 
		System.out.println("--- Busan 대입 후 ---");
		
		System.out.println(mf04.city);
		System.out.println(mf05.city);
		
		System.out.println("--- 클래스명으로 접근 ---");

		//클래스변수는 객체가 아닌 클래스명을 통해 접근한다
		
		System.out.println(MemberField_02.city);
		MemberField_02.city = "Incheon";
		System.out.println(MemberField_02.city);
		
		//-------------------------------------------
		
		System.out.println();
		System.out.println("----- 지역변수 테스트 -----");
		
		MemberField_03 mf06 = new MemberField_03();
		
		mf06.method(111); //메소드 호출
		
	}
}
