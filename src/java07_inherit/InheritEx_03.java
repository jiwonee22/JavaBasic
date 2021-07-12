package java07_inherit;

class Parent3 {
//	private int num = 111;
	protected int num = 111; //protected접근제한자 : 같은 패키지 + 상속관계의 클래스까지 허용
	
	
	public Parent3() {
			
		System.out.println("부모 디폴트 생성자");
		System.out.println(this.num);
	}
	
}

class Child3 extends Parent3 {
	private int num = 333;
	
	public Child3() {
		System.out.println("자식 디폴트 생성자");
		System.out.println("this.num : " + this.num); //멤버필드 num
		System.out.println("super.num : " + super.num); //상속받은 Parent3의 num
		
	}
	
}

public class InheritEx_03 {
	public static void main(String[] args) {
		
		Parent3 p = new Parent3();
		
		System.out.println("---------------------");
		
		Child3 c = new Child3();
		//Child3 우선확인, 그다음 Parent3
		
	}
}
