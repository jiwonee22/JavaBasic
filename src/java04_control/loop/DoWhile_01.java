package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {

		//do-while loop

//		do {
//
//			//반복 수행 코드 영역
//
//
//		} while (조건식);

		//처음 do키워드를 만나면 조건검사없이 반복코드를 수행한다
		//이후 조건 검사를 하고 true라면 반복, false라면 중단
		
		//	-> 최초 1회를 무조건 실행하고 다음부터 반복하는 Loop
		
		//-----------------------------------------------------------
		
		do {
			System.out.println("HELLO");
		} while ( false );
		
		//-----------------------------------------------------------
		
		//무한루프
		do {
			System.out.println("HELLO");
		} while ( true );
		
	}
}
