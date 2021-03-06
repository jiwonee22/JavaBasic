package java04_control.loop;

public class For_01 {
	
	public static void main(String[] args) {
		
		//반복문, Loop
		//	for문, while문, do-while문
		
		//------------------------------------------------------------
		
		//for문, for loop
		
//		for( 초기식; 조건식; 증감식 ) {
//			
//			// 조건식이 true라면 수행하는 코드 영역
//			// 반복적으로 수행하는 코드 영역
//			
//		}
		
		//------------------------------------------------------------
		
		int i;

		for( i=0; i<5; i++ ) { //i, 0~5, i++
		
			System.out.println("HI : " + i);
	
		}
		
		//초기식 : i=0 
		//조건식 : i<5
		//증감식 : i++
		
		//for문 읽는 방법
		//	i변수가 0부터 시작해서	(초기식)
		//	5보다 작은 동안에 		(조건식)
		//	1씩 증가하면서 반복한다	(증감식)
		
		//------------------------------------------------------------
		
		//for문의 수행 순서
		//	1. 초기식 수행
		//	2. 조건식 판별
		//		2-1. true일 때, 3번 항목 수행
		//		2-2. false일 때, for문 종료(반복문 중단)
		//	3. {}중괄호 코드 수행
		//	4. 증감식 수행
		//	5. 2번항목 수행
		
	}

}
