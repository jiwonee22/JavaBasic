package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		//	-> 파일의 정보를 관리하는 클래스
		
		//	-> 파일의 내용을 가지고 있는 건 아니다
		
		//	-> 파일의 경로와 이름을 저장하고 있다
		
		//	-> 파일 입출력 스트림의 입출력 대상으로 지정할 수 있다
		
		//------------------------------------------------------------
		
		//**파일의 경로를 지정할 때 폴더를 나타내는 문자는 '/' 를 사용한다
		//	-> "\\" - 역슬래시 2번을 사용할 수 있다
		//	-> "/" - 슬래시 1번을 사용할 수 있다
		
		//	-> "/", "\\" 둘 다 허용한다
		
		File file = new File("C:/Users/유지원/Documents/test.txt");
		
		System.out.println("File info : " + file); //경로 + 파일명
		
		System.out.println("length : " + file.length()); //파일의 크기
		System.out.println("exists : " + file.exists()); //파일의 존재 유무

		
		
	}
}
