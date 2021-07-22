package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex05_2_ObjectInputStream {
	public static void main(String[] args) {
		
		//파일 객체
		File file = new File("./src/java13_io/filterStream", "ObjectTest");
		
		//객체 입력 스트림
		ObjectInputStream ois = null;
		
		try {
			//스트림 생성
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			//객체 입력
			Object obj1 = ois.readObject();
			System.out.println(obj1);
			
			Point obj2 = (Point)ois.readObject();
			Point obj3 = (Point)ois.readObject();
			
			System.out.println(obj2);
			System.out.println(obj3);
			

			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				if(ois != null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
