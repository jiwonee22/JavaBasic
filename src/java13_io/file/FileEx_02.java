package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//class File의 생성자
		
		//	File(String path, String filename) - 파일경로, 파일 이름
		
		//	File(String filepath) - 파일경로 + 파일 이름
		
		//	**File객체는 파일을 다루지만, 폴더만 다룰 수도 있다.
		
		//	File(File path, String filename) - 파일경로, 파일이름
		
		//--------------------------------------------------------------
		
		//절대 경로, Absolute Path
		File file1 = new File("D:\\workspace\\JavaBasic\\src\\java13_io\\file", "Hello");
		
		System.out.println(file1.length()); //파일의 크기
		System.out.println(file1.exists()); //파일의 존재 유무
	
		System.out.println("----------------------------------------");
		
		//상대 경로, Relative Path
		File flie2 = new File("./src/java13_io/file", "Hello");
		
		System.out.println(file1.length()); //파일의 크기
		System.out.println(file1.exists()); //파일의 존재 유무
		
	}
}
