package java04_control.loop;

public class For_04 {
	public static void main(String[] args) {

		//	"Hello"를 7번 출력하시오

		//반복횟수 : 7번
		//반복구간 : 0 ~ 6
		
		//초기식 : int i=0;		(i변수, 반복구간의 시작값으로 대입한다)
		//조건식 : i<7; 		(i변수, 반복구간의 끝값 or 반복 횟수)
		//증감식 : i++			(1씩 증가)	
		
		for( int i=0; i<7; i++ ) { // i, 0~6, x7
			System.out.println("Hello");
		}
		
		//i변수가 0부터 7보다 작은 동안에 1씩 증가하면서 반복한다

	}
}
