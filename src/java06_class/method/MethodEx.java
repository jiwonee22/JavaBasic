package java06_class.method;

public class MethodEx {
	public static void main(String[] args) {
		
		Method_01 m01 = new Method_01(); //객체 생성
		
		//메소드호출의 return값을 result 변수에 대입한다
		int result = m01.add( 11 , 22 ); //메소드 호출
		
		System.out.println("덧셈의 결과 : " + result);
		
		//-----------------------------------------------
		
		//메소드 호출의 return값을 곧바로 출력에 사용하기
		System.out.println("덧셈의 결과 : " + m01.add( 111, 222 ));
		
		
		System.out.println("--- Method_02 -----------------");
		
		Method_02 m02 = new Method_02();
		
		m02.method1();
		
		m02.method2( 111 );
		
		System.out.println("반환된 값 : " + m02.returnNum());
		
		System.out.println("덧셈 결과 : " + m02.plus(100, 200));
	}
}
