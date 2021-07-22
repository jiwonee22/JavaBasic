package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java13_io/fileStream", "output");
		System.out.println("[TEST] exists : " + file.exists());
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
	
		try {
		
			
			fos = new FileOutputStream(file); //스트림생성
			
			
			//파일 출력 - 프로그램의 데이터를 파일로 출력(저장)한다
			String str = "Cherry";
			fos.write(str.getBytes(), 0, str.length());
			fos.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일을 찾을 수 없습니다");
//			e.printStackTrace();
		
		} catch (IOException e) {
			System.out.println("[ERROR] 파일로 데이터를 출력할 수 없습니다");
//			e.printStackTrace();

		} finally {
			try {
				
				if(fos!=null) fos.close(); //스트림 닫기
			
				//** FileOutputStream을 생성할 때 예외가 발생하면
				//	fos변수에는 null이 저장되어있는 상태가 된다
				//		-> fos.close()를 호출할 때, NullPointerException이 발생하게 됨
					
					
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
