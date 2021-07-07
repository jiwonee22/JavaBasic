package java03_scanner;

public class FormattedDouble {
	public static void main(String[] args) {
		
		//소수점 자릿수를 지정하여 출력한다
		
		//방법 1.
		//	System.out.printf() 를 사용한다
		//	( printf - print formatted)
		
		//	서식문자를 이용하여 출려간 문자열의 서식을 지정한다
		
		//	서식문자 종류
		//		%d - 10진수정수 형식지정
		//		%f - 실수 형식
		//		%s - 문자열 형식
		//		%c - 단일문자 형식
		
		System.out.printf("%d",1234);
		System.out.println(); //줄바꿈, 개행

		//7글자가 들어갈 자리를 확보하고 데이터 1234를 그 자리에 넣어서 출력한다(오른쪽정렬)
		System.out.printf("%7d", 1234);
		System.out.println();
		
		System.out.printf("%5s%5s%5s", "kor", "eng", "math");
		System.out.println();
		System.out.printf("%5d%5d%5d", 100, 99 ,97);
		System.out.println();
		
		//소숫점 이하 자릿수를 지정할 때 사용할 수 있다 - %.2f (소수점이하 2자리 확보)
		System.out.printf("%.3f", 123.5465);
		System.out.println();
		System.out.printf("%.3f", 123.4);
		System.out.println();

		//------------------------------------------------------------------------------------------
		
		//방법 2. 
		//	String.format("서식문자포함하는문자열", 데이터, ...)
		//	 -> 서식문자를 적용한 문자열 결과를 리턴한다
		
		String str = String.format("%7.2f", 123.4567);
		System.out.println(str);
		
		System.out.println(String.format("%3d점",41));
		System.out.println(String.format("%3d점",100));
		
		//------------------------------------------------------------------------------------------

		//방법 3.
		//	수학적 계산으로 소수점이하 자리수 유지하기
		
		//	123.45678
		//		x100 -> 12345.678
		//		소수부분 반올림 -> 12346
		//		/100 -> 123.46
		
		double avg = 34.8765;
		
		double result = Math.round( avg * 100 ) / (double)100;
		System.out.println(result);
		
		//** Math.round(실수)
		// 주어진 실수(double, float)의 소수부분을 반올림하여
		// 정수(long, int)타입으로 반환한다
		
	}
}
