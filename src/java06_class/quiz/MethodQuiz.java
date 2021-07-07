package java06_class.quiz;

public class MethodQuiz {

	public void print100() {
		for(int i=0; i<100; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println();
	}
	
	public void printHello( int num ) {
		for(int i=0; i<num; i++) {
			System.out.print("Hello ");			
		}
		System.out.println();
	}
	
	public void printText( int cnt, String text ) {
		for(int i=0; i<cnt; i++) {
			System.out.print(text + " ");
		}
		System.out.println();
	}
	
}
