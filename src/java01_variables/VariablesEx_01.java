//패키지 선언 - 소스코드가 포함된 패키지를 나타낸다
package java01_variables;

//한 줄 주석 토글 단축키 : ctrl + shift + c

//클래스 정의 - 프로그램의 기본 구성요소 (객체지향에서 자세히 다룸)
public class VariablesEx_01 {

	//메인 메소드 정의 - 프로그램의 시작점
	public static void main(String[] args) {
//		System.out.println("동작 테스트");
		
		
		System.out.println(123);	//정수형 int
		System.out.println(3.14);	//실수형 double
		System.out.println('Q');	//문자형 char
		System.out.println(true);	//논리형 boolean
		
		//---------------------------------------------
		System.out.println((char)81); // Q 출력됨
		System.out.println((int)'가'); // 44032 출력됨
		System.out.println((int)'각'); // 44033 출력됨
		//---------------------------------------------
		
		System.out.println("반가워요!"); //문자열(String 타입) - 참조형

		
		
	} //main method end

} //class VariablesEx_01 end
