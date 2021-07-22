package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex05_1_ObjectOutputStream {
	public static void main(String[] args) {

		//파일 객체
		File file = new File("./src/java13_io/filterStream", "ObjectTest");

		//객체 출력 스트림
		ObjectOutputStream oos = null;


		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

			//출력될 데이터 객체
			Point p1 = new Point(11,22);
			Point p2 = new Point(111,222);
			Point p3 = new Point(1111,2222);
			
			//객체 출력
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);

			oos.flush(); //버퍼 비우기
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(oos != null)	oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}