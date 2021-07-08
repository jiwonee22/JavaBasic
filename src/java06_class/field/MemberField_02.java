package java06_class.field;

public class MemberField_02 {

	//멤버 필드 -> 인스턴스 변수
	private int num;
	
	//멤버 필드 -> 클래스 변수, static변수, 정적변수
//	private static String city = "Seoul";
	public static String city = "Seoul";
	
	private int data1 = 100;
	
	//정적 멤버 메소드 (곧바로 호출하게 준비됨)
	public static void test() {
//		System.out.println( data1 ); //에러
	}
	
	//정적메소드에서 인스턴스변수 사용할 수 없음
	//	-> 인스턴스변수가 만들어지기 전에 실행준비가 완료돼야함
	//----------------------------------------------------
	
	private static int data2; //정적 변수
	
	public static void setData2(int data2) {
		MemberField_02.data2 = data2;
	}
	
	public static int getData2() {
		return data2;
	}
	
	//정적메소드에서는 정적멤버필드만 사용할 수 있다
	
	//----------------------------------------------------
	
	private static int data3; //정적 변수
	
	public void test2() { //일반 멤버메소드
		System.out.println( data3 ); //정적 변수 사용
	}
	
	//일반 메소드에서 정적변수를 사용하는 것은 문제가 없다
	
	
}
