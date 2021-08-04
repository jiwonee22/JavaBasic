package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {

		//출력 대상 파일
		File file = new File("./src/java13_io/filterStream", "BufferedOut.txt");

		//파일 출력 스트림 객체
		FileOutputStream fos = null; //1차 스트림
		BufferedOutputStream bos = null; //2차 스트림, 성능 향상 보조 스트림

		try {
			//파일 출력 스트림 생성
			fos = new FileOutputStream(file, true);
			//**FileOutputStream 생성자의 두번째 매개변수(boolean)
			//	true - 추가 모드로 설정한다
			//	false - 기본값. 쓰기 모드로 설정한다
			//	-> 따로 지정하지 않으면 false, 쓰기모드
			bos = new BufferedOutputStream(fos);

			String data = "CheeryBananaAppleorange";

			//파일 출력
			bos.write(data.getBytes(), 0, data.getBytes().length);
			bos.flush(); //출력 버퍼 비우기


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { 
				//스트림 닫기
				if(bos!=null)	bos.close();
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}






	}
}
