package java04_control.selection;

public class Switch_03 {
	public static void main(String[] args) {

		//switch의 비교대상은 정수형만 사용 가능하다
		
		//--------------------------------------------------------
		
		//논리형(boolean) 데이터 사용 불가
		boolean b = true;
		
//		switch ( b ) {
//		}
		
		//--------------------------------------------------------
	
		//실수형 데이터 사용 불가
		double d = 3.14;
		
//		switch ( d ) {
//		}	
		
		//--------------------------------------------------------
		
		//switch에서 char형 사용하기
		char alpha = 'B'; //정수로 처리된다
		
		switch ( alpha ) {
		case 'A':
			System.out.println("A예요");
			break;
		
		case 'B':
			System.out.println("B입니다");
			break;
		
		case 'C':
			System.out.println("C요");
			break;
		
		default:
			System.out.println("A, B, C 다 아님");
		}
	}

}
