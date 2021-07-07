package java05_array;

public class Array_04 {
	public static void main(String[] args) {
		
		//문자열, String
		//	char형들의 집합인 char[](문자 배열)의 개념을 사용한다
		
		//	하지만, char[]과 String은 같은 데이터타입이 아니다
		
		//---------------------------------------------------------
		
		String str = "Apple";
		
		char[] chArr = {'A', 'P', 'P', 'L', 'E'};
		
		//---------------------------------------------------------
		
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("char형 배열의 길이 : " + chArr.length);
		
		System.out.println("-----------------");
		
		System.out.println("문자열의 세번째 글자 : " + str.charAt(2));
		System.out.println("배열의 네번째 글자 : " + chArr[3]);

		System.out.println("-----------------");

		// toCharArray() : String을 char[]로 변환하여 반환하는 기능
		char[] converted = str.toCharArray();
		
		System.out.println("배열의 네번째 글자 : " + converted[3]);

	}
}
