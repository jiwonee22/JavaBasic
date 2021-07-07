package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {

		//break;
		//	제어문을 중단시키는 역할을 수행하는 코드

		//	if문 안에서 사용은 가능하지만
		//	if문을 중단시키지는 않는다

		// -> for, while, do-while, switch를 중단시킴

		//	제어문이 중첩되었을 경우 가장 가까운 제어문
		//	한 개만 중단시킨다

		for(int i=0; i<100; i++) { //i, 0~99, x100
			System.out.println(i);

			if( i >= 5 ) { //추가적인 조건식으로 사용한다
				break; //for문을 중단시킨다
			}

		}

		//----------------------------------------------------------
		System.out.println("----------------");

		//continue;
		//	반복문에서 사용하는 기타제어문
		//	다음 반복으로 넘어간다

		for(int i=0; i<10; i++) { //i, 0~99, x10
			
			if( i%2 == 0 ) { //짝수일 경우
				continue; //다음 반복으로 넘어가기
			}

			System.out.println(i);
		}

		// for문에서는 증감문으로 넘어간다		
		// while, do-while에서는 조건문으로 넘어간다
		
		// -> 반복수행코드({}중괄호)를 넘긴다

	}
}
