package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {

		
		//Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다(복사한다)

		//49,520,690 bytes
		
		//입력대상 파일
		File src = new File("./src/java13_io/fileStream", "Source.txt");
		//출력대상 파일
		File dest = new File("./src/java13_io/fileStream", "Destination.txt");

//		System.out.println("[TEST] src : " + src.exists());
//		System.out.println("[TEST] dest : " + dest.exists());

		//입출력 스트림 객체 변수
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[4096]; //임시 저장소
		int len = -1; //입출력 길이, 1회 반복할 때 마다 입력한 데이터의 길이
		int total = 0; //총 입출력된 데이터의 길이(크기)
		
		
		
		try {
			//파일 입출력 스트림 생성
			fis = new FileInputStream(src); //Source.txt에 대한 입력 스트림 생성
			fos = new FileOutputStream(dest); //Destination.txt에 대한 출력 스트림 생성
			
			while ((len = fis.read(buf)) != -1) { //파일 입력
				fos.write(buf, 0, len); //파일 출력
				fos.flush(); //출력 스트림 비우기
				
				//콘솔창에서 복사되는 상황 확인하기
//				System.out.print(new String(buf, 0, len));
				
				total += len;
				
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일 입력/출력 스트림을 생성할 수 없습니다");
//			e.printStackTrace();
		
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기/쓰기 실패");
//			e.printStackTrace();
			
		} finally {
			try {
				//파일 입출력 스트림 닫기
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] 입력/출력 스트림 닫기에 실패했습니다");
				e.printStackTrace();
			}
		}
		
		System.out.println(">> " + total + "바이트 복사 완료");
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		

	}
}
