package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		//for문 중첩, 2중 for문
		//	바깥쪽 반복문의 반복되는 변수의 진행에 맞춰
		//	안쪽 반복문의 반복되는 변수의 진행과정을 고려해야한다
		
		for( int i=0; i<3; i++ ) { //i, 0~2, 3번
			
			for ( int j=0; j<3; j++ ) { //j, 0~2, 3번
				System.out.println("i:"+i+",j:"+j); // -> 9번
			}
			
			System.out.println("------------"); // -> 3번

		}
	
	}

}
