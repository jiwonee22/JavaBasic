package java04_control.loop;

public class DoWhile_02 {
	public static void main(String[] args) {
		
		//메뉴
		//	최초 1회 메뉴 선택이 있어야 다음 작업을 알 수 있다
		
//		do {
//			//1. 메뉴 보여주기
//			//2. 메뉴 선택하기
//		} while (종료메뉴 선택하지 않으면 true);
		
		//-----------------------------------------------------------------
		
		int i=0; //초기식
		do {
			System.out.println(i);
			
			i++; //증감식
		} while(i<5); //조건식		//i, 0~4, x5
		
	}
	
	
	
}
