package java01_variables;

public class VariablesQuiz {

	public static void main(String[] args) {
		
		//1. 변수에 알맞은 타입 찾기
		
		//이름 - String
		//성별 - int
		//나이 - 남/여, char
		//키 - double

		
		//2. 변수 선언
		String name; //이름
		int age; //나이
		char gender; //성별
		double height; //키
		
		
		//3. 변수에 값 대입
		name = "Alice";
		age = 99;
		gender = '남';
		height = 222.66;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		System.out.println("----------------------------");
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 키 : " + height);
	
		System.out.println("----------------------------");
		
		//** println - 주어진 문자열을 출력하고 개행(줄바꿈)
		//** print - 주어진 문자열을 출력(줄바꿈 X)
		
		System.out.print("이름 : " + name);
		System.out.print("\n나이 : " + age);
		System.out.println();
		
		System.out.print("성별 : " + gender);
		
		//** 개행문자(줄바꿈문자) - \n


	}

}
