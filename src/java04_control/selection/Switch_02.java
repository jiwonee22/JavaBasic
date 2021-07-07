package java04_control.selection;

public class Switch_02 {
	public static void main(String[] args) {

		int num = 20;
		if ( num == 10 ) {
			System.out.println("num은 10");
		} else if ( num == 20 ) {
			System.out.println("num은 20");
		} else if ( num == 30 ) {
			System.out.println("num은 30");
		} else {
			System.out.println("num은 10, 20, 30 다 아님");
		}

		System.out.println("----------");

		switch( num ) {
		case 10:
			System.out.println("num은 10");
			break;
		case 20:
			System.out.println("num은 20");
			break;
		case 30:
			System.out.println("num은 30");
			break;
		default:
			System.out.println("num은 10, 20, 30 다 아님");
		}
		
		//------------------------------------------------------------
		
		System.out.println("-------------");
		
		int score = 88;
		
		if( score >= 90 ) {
			System.out.println("A등급");
			
		} else if( score >= 80 ) {
			System.out.println("B등급");
			
		}
		
		System.out.println("-------------");
		
		//switch는 범위비교를 할 수 없다 -> if문 써야한다
//		switch( score ) {
//		case >=90: //에러
//		case >=80: //에러
//		}
		
		//------------------------------------------------------------
		//비교대상으로 연산식을 넣을 수 있다
		//	-> 연산결과를 이용해 비교한다

		switch( score / 10 ) { //score을 10으로 나눈 몫, 10의 자리 숫자
		case 10:
		case 9:
			System.out.println("A등급");
			break;

		case 8:
			System.out.println("B등급");
			break;
		}
		
	}
}
