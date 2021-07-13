package java08_abstract.interfaceEx;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();
		
		System.out.println("-----------------");
		
		Parent p; //부모타입 객체변수
		p = new Child(); //부모타입 <- 자식타입
		
		p.out(); //자식 인스턴스 메소드 호출(동적바인딩)
		
		System.out.println("-----------------");
		
		//** extends한 클래스는 부모 타입이다
		//** implements한 인터페이스는 부모 타입이다
		
		Inter_01 i01; //인터페이스 객체 변수
		i01 = new Child();
		
		i01.out(); //동적 바인딩
		
		System.out.println("--------------------");
		
		Inter_02 i02 = new Child();
		i02.out(); //동적 바인딩
		
		
	}
}


//**자바는 다중 상속을 금지하고 있다
//	-> extends키워드로 한 개의 클래스만 상속받을 수 있다

//class P1 {
//	public void display() {
//		System.out.println("P1");
//	}
//}
//
//class P2 {
//	public void display() {
//		System.out.println("P2");
//	}
//}
//
//class Children extends P1, P2 { //다중상속
//	
//	@Override
//	public void dispaly() {
//		-> P1, P2 부모 클래스 중 어떤 메소드를 상속 받는가?
//	}
//}