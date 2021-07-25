package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_08_Queue {
	public static void main(String[] args) {
		
		Queue queue = new LinkedList();
		//Queue는 인터페이스, 객체 생성이 불가능하다
		
	
		//큐에 데이터 넣기 - 인큐(Enqueue)
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		System.out.println(queue);
		
		System.out.println("------------");
		
		//큐에서 데이터 꺼내기 및 제거 - 데크(Dequeue)
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println("------------");
		
		System.out.println(queue.peek()); //삭제X
		System.out.println(queue);
		
		
		
	}
}
 