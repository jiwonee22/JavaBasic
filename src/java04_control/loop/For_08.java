package java04_control.loop;

public class For_08 {
	public static void main(String[] args) {

		// ��� ��ø���� ����ϱ�

		//if��ø

		int num = 11;

		if( num>=1 ) {
			System.out.println("1���� ũ�ų� ����");

			if ( num <= 100) {
				System.out.println("1���� ũ�ų� ����");
								
				System.out.println("100���� �۰ų� ����");
				
			}//if ( num <= 100) end
			
			System.out.println("1���� ũ�ų� ����");
			
		}//if( num>=1 ) end
		
		//----------------------------------------------------------------------------
		System.out.println("---------------------");
		
		//for���� if�� ��ø
		for ( int i=0; i<10; i++ ) { // i, 0~9, 10��
			
			if ( i%2==0 ) { //¦���� ���
				 System.out.println("¦�� : " + i);
			} //if ( i%2==0 ) end
			
			
			
		} //for ( int i=0; i<10; i++ ) end
		//----------------------------------------------------------------------------
		System.out.println("-------------------------");
		
		for( int i=0; i<10; i+=2 ) { //i, 0 2 4 6 8, 5��
			System.out.println("¦�� : " + i);
		} //for( int i=0; i<10; i+=2 ) end
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
