package java07_inherit;

class Parent2{
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
	
}

class Child2 extends Parent2 {
//	public int num; //상속	
	private int num;
	
	public String name;
	
	@Override
	public void display() {
		num = 111;
		System.out.println("오버라이딩 메소드");
	}
	
	public void print() {
		System.out.println("자식 고유 메소드");		
	}
	
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
//		c.num = 222;
		c.display();
		
		System.out.println("-------------");
		
		Parent2 p = new Parent2();
		p.num = 888;
		p.display();
		
		System.out.println("-------------");

		// Parent2 <- Child2 형변환
		Parent2 pc = new Child2(); //동적할당
		
//		pc.name = "Apple";
//		pc.print();
		
		pc.display(); //동적 바인딩
		
		System.out.println("-------------");
		
		// Child2 <- Parent2 형변환
		//	인스턴스의 타입으로만 형변환할 수 있다
	
		((Child2)pc).print();
		
		// pc : Parent2 타입 (인스턴스는 Child2 타입)
		
		// (Child2)pc : Child2타입으로 형변환
	
		System.out.println("-------------");
		
		//자식클래스를 부모클래스타입으로 자동형변환한다
		
		//부모타입 객체변수에 자식타입 인스턴스를 저장한다
		
		//ClassCastException 발생
		//	부모클래스타입을 자식클래스타입으로 형변환할 수 없다
//		Child2 cp = (Child2)new Parent2();
		
		//** java.lang.ClassCastException 예외
		//	특정 클래스를 다른 클래스로 형변환하려고 할 때 발생한다
		
	}
}
