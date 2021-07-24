package selfstudy;

class Person {
	long id;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	} 

	Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {
	public static void main(String[] args) {



		Person p1 = new Person(00001);
		Person p2 = new Person(00001);

		if(p1.equals(p2)) {
			System.out.println("같은 사람입니다");

		} else {
			System.out.println("다른 사람입니다");
		}



	}
}