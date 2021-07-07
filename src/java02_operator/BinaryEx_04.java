package java02_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		
		//이항연산자 - 논리
		//		&&		||		!
		//		AND		OR		NOT
		
		//		!연산자는 단항 연산자
		
		//		|, vertical bar, 수직 바 (shift + \)
		
		//		논리형 타입(boolean) 데이터의 관계를 따져서 결과를 변환하는 연산자
		
		//		AND 연산은 피연산자가 모두 true일 때 결과가 true
		//		OR 연산은 피연산자가 둘 중 하나라도 true일 때 결과가 true
		
		//		NOT 연산은 피연산자의 논리를 부정함(반대로 바꿈)
		
		//-----------------------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2)); //false
		System.out.println("true||false : " + (b1||b2)); //true
		
		//-----------------------------------------------------------------------------
		
		int num = 77;
		
		System.out.println(num >= 1);	//true
		System.out.println(num <= 100);	//true
		
		System.out.println(num >= 1 && num <= 100); //true
		System.out.println(77 >= 1 && 77 <= 100); //변수활용	
		System.out.println(true && 77<=100); //77>=1 연산 수행
		System.out.println(true && true); //77<=100 연산 수행
		System.out.println(true); //true && true 연산 수행
		//	-> num변수가 1보다 크거나 같고 그리고 100보다 작거나 같은 숫자인가?
		
		//	-> num의 값이 1~00 사이의 정수인가
		
		
		//-----------------------------------------------------------------------------

//		System.out.println(1 <= num <= 100); //잘못된 경우
//		System.out.println(1 <= 77 <= 100); //변수 활용
//		System.out.println(true <= 100); //1 <= 77 연산 수행
//		System.out.println(true <= 100); //boolean데이터와 int형을 <=(ge) 연산할 수 없다
		
		//-----------------------------------------------------------------------------
		System.out.println("-----------");
		
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		//-----------------------------------------------------------------------------
		System.out.println("-----------");

		System.out.println(!(num >= 1 && num <= 100)); //1~100사이의 정수가 아닌가?
		
		// !논리부정연산자의 적용
		//	관계연산자는 반대로 변환한다
		//	논리연산자는 && -> ||, || -> &&
		
//		System.out.println(!(num >= 1) !(&&) !(num <= 100)); //분배법칙
		
		System.out.println(num < 1 || num > 100);
		//	-> num변수가 1보다 작거나 100보다 큰가?

		
		
		
	}
	
}
