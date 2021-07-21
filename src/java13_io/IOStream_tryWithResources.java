package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream_tryWithResources {
	public static void main(String[] args) {
		
		//키보드 입력 -> 프로그램 -> 모니터 출력
		
		
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		try { 
			InputStream is = System.in; //표준 입력 스트림
			OutputStream os = System.out; //표준 출력 스트림
			
			while( (len = is.read(buf)) != -1 ) {
				
				//입력받은 데이터를 모니터로 출력한다
				os.write(buf, 0, len);
				os.flush();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
		
		
	}
}
