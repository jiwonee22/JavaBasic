package java03_scanner;


//import선언
import java.util.Scanner; //java.util.Scanner를 Scanner라고 사용하겠다는 선언


public class ScannerEx_01 {
	public static void main(String[] args) {
		
		//스캐너 클래스
		//	class Scanner
		
		//	키보드로  입력한 내용을 받아들이는 기능
		
		//-------------------------------------------------------------

		
		int num; //int형 변수 선언
		num = 123; //변수값 대입
		
		//-------------------------------------------------------------

		
		//클래스는 데이터타입으로 사용된다
		//참조형타입(Reference)으로 사용한다
		
		//클래스를 사용할 때(지칭할 때)에는 패키지까지 포함해서 명시해야한다
		//	**패키지: 클래스들을 모아놓은 저장소 역할을 함
		
		java.util.Scanner input;
		// java.utiㅣ.Scanner - 데이터타입, Scanner참조형 타입
		// input - 변수명(식별자)
		
		//-------------------------------------------------------------
		
		//참조형 변수 사용 방법
		//	[클래스명] [변수명] = new [클래스명] ( [필요한데이터] );
		
		Scanner in; //입력기능 변수 선언
		in = new Scanner ( System.in ); //입력기능 생성
		
//		Scanner in = new Scanner ( System.in );
		
		//-------------------------------------------------------------
		
		int data; //정수형 변수 선언
		data = in.nextInt(); //정수값을 키보드로부터 입력받아 data변수에 대입한다
//		data = 12345;
		
		System.out.println("입력된 값 : " + data);
		
		//-------------------------------------------------------------

		double dData = in.nextDouble();
		System.out.println("실수 입력 값 : " + dData);
		

		in.close(); //입력 변수 닫기, 키보드를 연결해서 사용 후 안전하게 제거한다.
					//main 종료전 마지막에 써줘야 함
					//하지만 키보드는 너무 기본 장치라 굳이 안써도 됨
	}
}
