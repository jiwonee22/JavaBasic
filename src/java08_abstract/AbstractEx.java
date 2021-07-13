package java08_abstract;

//abstract 클래스, 추상클래스
abstract class Person { //부모 클래스
	protected String name; //이름
	
	public Person(String name) {
		this.name = name;
	}
	
	//추상메소드
	//	-> 호출할 수 없는 메소드
	public abstract void display();
	

}
	

class Professor extends Person{ //자식 클래스
	private String major; // 전공
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public void display() {
		System.out.println("[교수]" + name + ", " + major + "전공");
	}
}


class Student extends Person{ //자식 클래스
	private String subject; // 수강 과목
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("[학생]" + name + ", " + subject + "전공");
	}
}


public class AbstractEx {
	public static void main(String[] args) {
		
		Professor pf = new Professor("Alice", "컴퓨터");
		
		Student st = new Student("Bob", "자바");
		
		//------------------------------------------------------
		
		//추상클래스는 객체생성(인스턴스화)할 수 없다
		//	-> new연산자를 이용할 수 없다
//		person p = new Person("Claire");
		
		//------------------------------------------------------
		
		//추상 클래스로 객체변수는 선언할 수 있다

		Person p1 = new Professor("Claire", "인공지능");
		Person p2 = new Student("Dave", "알고리즘");
				
		p1.display();
		p2.display();
		//동적바인딩, 인스턴스가 Professor, Student라 가능
		//Person의 display메소드는 연결통로 역할만 함
		
	}
}
