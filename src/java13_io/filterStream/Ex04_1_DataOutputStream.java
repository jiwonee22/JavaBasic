package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream", "DataTest.txt");
		
		//데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			//File -> FileOutputStream -> BufferedOutputStream -> DataOutputStream
			// 파일 -> 파일출력(쓰기모드) -> 성능향상 -> 자료형 유지 -> 사용(출력)
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		
			//자료형을 유지하며 출력하기
			dos.writeBoolean(true); // 1Byte
			dos.writeChar('가'); // 2Byte
			dos.writeInt(123); //4Byte
			dos.flush();
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
