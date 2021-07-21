package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		//성능 평가, Performance Evaluation

		//	1. 알고리즘(로직) 시작 전 현재시간 체크 -> start
		
		//		->알고리즘 수행
		
		//	2. 알고리즘(로직) 완료 후 현재시간 체크 -> end
		
		//	3. 두 시간의 차이를 구한다 -> 수행 시간 ( end - start )
		
		
		long start = System.currentTimeMillis(); //현재시간을 밀리초로 반환한다
		
		//로직 작성
		
		long end = System.currentTimeMillis(); //현재시간을 밀리초로 반환한다
		
		System.out.println( end-start );
		System.out.println( (end-start)/(double)1000 ); 
		
		System.out.println("-----------------------------------");
		
		//입력 대상 파일
		File file = new File("./src/java13_io/fileStream", "Source.txt");

		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; //2차 스트림, 성능 향상 보조스트림

		//파일 입력관련 보조 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼 ( 주 목적 : 데이터 관리의 편리성 )
		int len = -1; //입력 데이터의 길이

		try {
			//1차 스트림 생성
			fis = new FileInputStream( file );
			
			start = System.currentTimeMillis(); //현재시간을 밀리초로 반환한다
			//파일 입력
			while( (len = fis.read(buf)) != -1 ) { //약 0.11초 정도
			}
			end = System.currentTimeMillis(); //현재시간을 밀리초로 반환한다
			
			System.out.println( end-start );
			System.out.println( (end-start)/(double)1000 ); 

			System.out.println("---------------------------------");
			
			//2차 스트림 생성
			bis = new BufferedInputStream( new FileInputStream( file ) );
			
			start = System.currentTimeMillis(); //현재시간을 밀리초로 반환한다
			//파일 입력
			while( (len = bis.read(buf)) != -1 ) { //약 0.03초 정도
			}
			end = System.currentTimeMillis(); //현재시간을 밀리초로 반환한다
			
			System.out.println( end-start );
			System.out.println( (end-start)/(double)1000 ); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기 (생성된 순서의 역순으로 close() 해야한다)
				if(bis!=null)	bis.close(); //내부적으로 1차스트림도 같이 close() 된다 
//				if(fis!=null)	fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}












