package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {

		//반복문에서는 i 변수를 많이 사용한다
		//	**iterate의 첫 글자를 사용하는 것이다

		for( int i=0; i<10; i++ ) {
			System.out.println( i ); //0~9
		}

		//i변수가 0부터; 10보다 작은 동안에; 1씩 증가하면서 반복한다

		//반복횟수 : 10번
		//반복구간 : 0 ~ 9

		//** for문의 초기식에서 선언된 변수는 for문이 종료되면 제거된다
		//		System.out.println( i );

		//------------------------------------------------------------------
		System.out.println("--------");

		int i;

		for( i=0; i<10; i++ ) {
			System.out.println( i );
		}

		System.out.println( "반복문이 종료된 이후 : " + i );

	}

}
