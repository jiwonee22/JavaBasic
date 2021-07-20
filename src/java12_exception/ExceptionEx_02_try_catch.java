package java12_exception;

public class ExceptionEx_02_try_catch {
	public static void main(String[] args) {
		
		int[] arr = new int[5];

		int i=0;
		
		try {
			while(true) {
	
				arr[i] = i+1; //배열에 값 대입
	
				System.out.println(arr[i]);
				
				i++;

			}
		
		} catch(ArrayIndexOutOfBoundsException e) {
			
//			System.out.println("[예외발생] 인덱스를 벗어난 상황!!");
			System.err.println("[예외발생] 인덱스를 벗어난 상황!!"); //빨간 글씨로 출력됨
			
			//System.err - 표준 에러 출력
			
	
			//기본으로 사용되는 예외 처리 구문
			//	-> 예외가 발생한 상황의 스택트레이스를 출력한다
			e.printStackTrace();
		}
		
		
	}
}