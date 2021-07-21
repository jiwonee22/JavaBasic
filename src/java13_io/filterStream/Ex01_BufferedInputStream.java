package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedInputStream {
	public static void main(String[] args) {

		File file = new File("./src/java13_io/fileStream", "Source.txt");
		System.out.println("[TEST] exists : " + file.exists());

		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; //2차 스트림, 성능 향상 보조스트림

		//파일 입력관련 보조변수
		byte[] buf = new byte[102];
		int len = -1; //입력 데이터의 길이

		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(file); //1차, File객체 -> FileInputStream
			bis = new BufferedInputStream(fis); //2차, FileInputStream ->BufferedInputStream

			//파일 입력
			while((len = bis.read(buf))!= -1) {
				System.out.print(new String(buf, 0, len));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기 (생성된 순서의 역순으로 close() 해야한다)
				if(bis!=null) bis.close(); //내부적으로 1차스트림도 같이 close() 된다
//				if(fis!=null) fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}
}
