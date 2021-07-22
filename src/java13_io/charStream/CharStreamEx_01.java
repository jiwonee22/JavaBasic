package java13_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {
		
		//문자 스트림, Character Stream
		//	문자(char, 2B) 단위로 통신하는 스트림
		
		//	기본 스트림은 1B 단위로 통신하기 때문에
		//	바이트 스트림을 문자스트림으로 변환해서 사용한다
		
		// Class InputStreamReader
		//		바이트 입력 스트림 -> 문자 입력 스트림
		//		InputStream -> Reader
		
		// Class OutputStreamWriter
		//		바이트 출력 스트림 -> 문자 출력 스트림
		//		OutputStream -> Writer
		
		//-----------------------------------------------------------
		
		//문자스트림을 이용하여 키보드의 입력을 모니터로 출력하기
		
		Reader reader = new InputStreamReader(System.in); //입력스트림
		Writer writer = new OutputStreamWriter(System.out); //출력스트림
		
		//스트림 보조 변수
		char[] cbuf = new char[1024]; //임시 저장소(버퍼)
		int len = -1; //입력한 데이터의 길이
		
		try {
			//입력할 데이터가 남아있으면 계속 반복
			while((len = reader.read(cbuf)) != -1) {
				
				writer.write(cbuf, 0, len); //입력한 데이터 출력
				writer.flush(); //버퍼 비우기				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try { 
				//스트림 닫기
				if (reader != null)	reader.close();
				if (writer != null)	writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
