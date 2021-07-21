package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class TryWithResources {
	public static void main(String[] args) {
		
		//try-with-resources 구문
		
		//	-> 예외처리 구문
		//	-> try블록에 자원 객체를 전달하고, try블록이 종료되면 자동으로 자원을 해제해주는 구문
		
		//	-> 입출력객체를 사용할 때 finally 블록을 사용하지 않아도 자동으로 close()해준다
		
		//	-> JDK 1.7 추가
		
		//-------------------------------------------------------------------
		
		byte[] buf = "AppleBanana".getBytes(); //출력할 데이터
		
		try (OutputStream os = System.out) {
			
			os.write(buf, 0, buf.length); //데이터 출력
			os.flush(); //출력 버퍼 비우기
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		//try-with-resources 구문에서 지정된 객체는 try{} 블록이 종료된 이후에
		// 자동으로 close()를 호출한다
		//	-> AutoClose
		//	-> JDK 1.7부터 가능하다

	}
}
