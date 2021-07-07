package java04_control.loop;

public class For_08 {
	public static void main(String[] args) {

		// 제어문 중첩시켜 사용하기

		//if중첩

		int num = 11;

		if( num>=1 ) {
			System.out.println("1보다 크거나 같다");

			if ( num <= 100) {
				System.out.println("1보다 크거나 같다");
								
				System.out.println("100보다 작거나 같다");
				
			}//if ( num <= 100) end
			
			System.out.println("1보다 크거나 같다");
			
		}//if( num>=1 ) end
		
		//----------------------------------------------------------------------------
		System.out.println("---------------------");
		
		//for문과 if문 중첩
		for ( int i=0; i<10; i++ ) { // i, 0~9, 10번
			
			if ( i%2==0 ) { //짝수인 경우
				 System.out.println("짝수 : " + i);
			} //if ( i%2==0 ) end
			
			
			
		} //for ( int i=0; i<10; i++ ) end
		//----------------------------------------------------------------------------
		System.out.println("-------------------------");
		
		for( int i=0; i<10; i+=2 ) { //i, 0 2 4 6 8, 5번
			System.out.println("짝수 : " + i);
		} //for( int i=0; i<10; i+=2 ) end
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
