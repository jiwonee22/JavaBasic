package java08_abstract.interfaceEx;

abstract class TestClass { //추상 클래스
	int num; //멤버필드, 인스턴스 변수

	public void method() { //멤버 메소드, 일반 메소드
	}

	public abstract void method1(); //멤버 메소드, 추상메소드
	public abstract void method2(); //멤버 메소드, 추상메소드
}

//--------------------------------------------------------------

interface TestInterface { //인퍼테이스
	//상수 필드 & 추상 메소드만 멤버로 가질 수 있다
	
	//--------------------------------------------------------------

	//상수 필드
	// -> public static final 키워드를 붙인 필드만 선언 가능
	
	public static final int NUM1 = 123; //선언과 동시에 초기화 필수!
	
	int NUM2 = 345;
	public int NUM3 = 456;
	static int NUM4 = 5767;
	
	// -> 인터페이스에서 필드는 public static final 을 붙여주는 것이 좋다!
	
	//--------------------------------------------------------------------
	
	//인터페이스는 일반 메소드를 멤버로 가질 수 없다
//	public void method() { //일반 메소드
//}

	//추상메소드
	public abstract void out();
	
	//abstract 키워드 없이 메소드를 작성해도 추상메소드로 처리된다 (하지만 쓰는게 더 좋음)
	public void display();
}


class Test extends TestClass{

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}

}

//--------------------------------------------------------------

//인터페이스 구현하기

class Test2 implements TestInterface {
	
	@Override
	public void out() {
	
	}@Override
	public void display() {
	}

}

class Test3 extends TestClass implements TestInterface {
	
	
	//
	@Override
	public void out() {
	}
	
	@Override
	public void display() {
		
	}
	
	//
	@Override
	public void method1() {
		
	}
	@Override
	public void method2() {
		
	}
	
	
}


public class InterfaceEx_01 {
	public static void main(String[] args) {
		
		
		//인터페이스의 상수 필드
		System.out.println(TestInterface.NUM1);
		System.out.println(TestInterface.NUM2);
		System.out.println(TestInterface.NUM3);
		System.out.println(TestInterface.NUM4);

		//인터페이스를 상속받은 클래스의 상수 필드
		System.out.println(Test3.NUM1);
		System.out.println(Test3.NUM2);
		System.out.println(Test3.NUM3);
		System.out.println(Test3.NUM4);
		
	}
}

























