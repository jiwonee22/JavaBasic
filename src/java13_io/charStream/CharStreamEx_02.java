package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		//입출력 문자 스트림
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //키보드
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true); //모니터
		
		//** PrintWriter의 생성자에 autoFlush 설정을 넣을 수 있다
		//	-> OutputStream이나 Writer를 첫번재 인자로 받는 생성자에서 설정한다
		//	-> 두번째 인자로 true를 넣으면 자동 flush()가 된다 (기본값 false)
		
		//	-> print(), println(), printf() 메소드로 출력할 때에만 AutoFlush한다
		
		
		//** 사용할 메소드
//		in.readLine()
//		out.println()
		
		//입력받은 문자열
		String str = null;
		
		try {
			//입력받을 문자열이 없을 때까지 반복(readLine의 EOF는 null)
			while((str = in.readLine()) != null) {
				out.println(str); //입력받은 문자열 출력
//				out.flush(); //버퍼 비우기 -> autoFush 적용함(PrintWrter 두번째 매개변수로 true)
				
			}

		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(in != null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//스트림 닫기, PrintWriter은 Close()할 때 try-catch 안해도 됨
			if(out != null)	out.close();
		}
		
		
	}
}
