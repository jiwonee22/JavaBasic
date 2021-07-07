package java05_array.array2D;

public class Array2D_05 {
	public static void main(String[] args) {
	
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println("길이 : " + arr.length);
		
		System.out.println("----------------------");
		
		arr = new int[3];
		System.out.println("길이 : " + arr.length);

		//-------------------------------------------------------
		
		//GC, Garbage Collector
		//	-> 가비지 콜렉터
		
		//	동적할당 메모리영역(힙 영역)을 관리한다

		//	아무도 참조하고 있지 않은
		//	동적할당 메모리공간을 해제한다
		
		//	JVM안에 포함되어있다
		
		
	}
}
