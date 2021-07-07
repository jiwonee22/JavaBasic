package java04_control.loop;

public class While_02 {
	public static void main(String[] args) {
		
//		초기식; //while구문이 시작되기 전에 작성한다
//		
//		while(조건식) {
//			
//			조건식이 참이면 반복수행할 코드
//			
//			
//			증감식;	//while문 안쪽에서 제일 마지막코드로 작성한다
//		}
		
		//----------------------------------------------------------
		
		//for문은 횟수가 정해져있거나, 정수값 반복일 때 주로 사용
		
		for(int i=0; i<10; i++) { //i, 0~9, x10
			System.out.println(i);
		}
	
		System.out.println("-----");
		
		//while문은 횟수가 정확히 정해져있지 않고, 
		//종료 조건은 존재할 때 주로 사용

		int i=0; //초기식, while문 이전에 작성
		
		while(i<10) { //조건식
			System.out.println(i); //반복 수행 코드
			
			i++; //증감식, while문 안쪽 제일 마지막
		}
			
	}
}
