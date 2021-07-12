package java07_inherit;

class Parent5 {
	public void display() {
		System.out.println("부모 클래스");
	}
}

//final 클래스는 자식클래스를 만들 수 없다
//final class Child5 extends Parent5 {
class Child5 extends Parent5 {
	@Override
	public final void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
}

class GrandChild extends Child5 {
	
	// final 메소드는 오버라이딩할 수 없음
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
	
}

public class InheritEx_05 {
	public static void main(String[] args) {
		
		GrandChild gc = new GrandChild();
		gc.display();
		
	}
}
