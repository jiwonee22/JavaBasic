package java01_variables;

public class VariablesEx_04 {

	public static void main(String[] args) {
		
		//변수 선언 - double형 height변수
		double height; //사람의 키
		
		//변수에 값 대입;
		height = 200.5;
		
		//변수의 값 출력
		System.out.println("height 변수의 값은 " + height + "cm 입니다.");
		// + 기호 : 문자열 연결 가능
		
		//--------------------------------------------------------------------
		
		double data;
		
		data =  height + 100; //덧셈
		
		System.out.println("data : " + data);
		
		//---------------------------------------------------------------------
		
		char alpha;
		
		alpha = 'T';
		
		System.out.println(alpha);
		
		//---------------------------------------------------------------------
		
		boolean isRight;
		
		isRight = false; //거짓
		
		System.out.println(isRight);
	
	}
	
}
