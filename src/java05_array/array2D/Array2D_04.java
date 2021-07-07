	package java05_array.array2D;
	
	import java.util.Scanner;
	
	public class Array2D_04 {
		public static void main(String[] args) {
			
			//new  연산자
			//	동적 할당 연산자
			
			//	**할당
			//		변수 공간이 생성되는 것
			//		데이터를 저장할 수 있는 공간 생성
			
			//	**정적 할당
			//		변수 선언
			
			//	**동적 할당
			//		new연산자를 이용하여 공간 생성
			//		프로그램 실행 중에 생성된다
			
			//	**정적, static
			//		실행되기 직전
			
			//	**동적, dynamic
			//		실행 중
			
			//--------------------------------------------------
			
			int num; //int형 변수 선언 -> 정적 할당
		
			int[] arr; //int[]형 변수 선언 -> 정적 할당
			
			//	메인 메소드에서 정적할당된 변수들은
			//Stack 메모리 영역에 생성된다
			//	-> 기본값 초기화하지 않음 (쓰레기 값 저장됨)
			
			//--------------------------------------------------
			
			arr = new int[5]; //int[5] 배열 공간 생성 -> 동적 할당
			
			//동적할당된 저장공간들은 Heap메모리 영역에 생성된다
			//	-> 기본값으로 초기화함
			
			//--------------------------------------------------
			
	//		int[] arr2 = new int[-8]; //NegativeArraySizeException
			
			//배열을 생성하는 코드는 동적할당이다
			//	-> 컴파일 시점에는 에러인지 알 수 없고 실행 이후에 예외(에러)인지 알게 된다
			
			//--------------------------------------------------
	
			int[][] arr3 = new int[3][];
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<arr3.length; i++) {
				System.out.print(i + "행 배열의 크기는? ");
				int len = sc.nextInt();
				
				arr3[i] = new int[len];
			}
			
			for(int i=0; i<arr3.length; i++) {
				for(int j=0; j<arr3[i].length; j++) {
					System.out.print( arr3[i][j] + " ");
				}
				System.out.println();
			}
			
			
			
			
		}
	}
