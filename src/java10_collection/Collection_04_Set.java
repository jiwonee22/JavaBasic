package java10_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_04_Set {
	public static void main(String[] args) {

//		Set set = new HashSet(); //기본 Set
		Set set = new LinkedHashSet(); // 데이터 순서 유지 Set
//		Set set = new TreeSet(); //정렬 상태 Set

		set.add(30);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);

		System.out.println(set);

		System.out.println("------------");

		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());

		}

		System.out.println("------------");

		System.out.println("크기 : " + set.size());
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("30이 존재? " + set.contains(30));
		System.out.println("30을 제거 : " + set.remove(30));

		System.out.println(set);

		System.out.println("------------");

		set.clear();
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println(set);

	}
}
