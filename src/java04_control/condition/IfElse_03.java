package java04_control.condition;

public class IfElse_03 {
	public static void main(String[] args) {

		int num = 88;

		if( num>0 && num<=100 ) {
			System.out.println("1~100사이의 정수");
		}

		System.out.println("-----------");

		//들여쓰기 자동 정렬 단축키 : ctrl + i
		//	-> 정렬할 코드들보다 위, 아래로 몇 줄 더 선택해서 사용한다.

		// 전체코드 선택 : ctrl + a
		// 들여쓰기 정렬 : ctrl + i

		if ( num>0 ) {
			System.out.println("0보다 크다");

			if ( num<=100 ) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");
			} // if ( num<=100 ) end

			System.out.println("0보다 크다");
			
		} else {
			System.out.println("0보다 크지 않다");

			if ( num==0 ) {
				System.out.println("0과 같다");
			} else {
				System.out.println("0과 같지 않다");
				System.out.println("0보다 작다");
			}
		}

	}
}
