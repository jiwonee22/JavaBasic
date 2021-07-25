package selfstudy;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}	

		//iterator은 1회용이라 다 쓰고나면 다시 얻어와야 한다.
//		it = list.iterator(); //새로운 iterator객체를 얻는다.
//
//		for(int i=0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);	
//		}

		//for문으로 작성할 경우 list컬렉션에만 사용가능. 객체지향에 적합한 방식이 아니다.

	}
} // main
