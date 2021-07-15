package java09_api;

public class ObjectEx {
	public static void main(String[] args) {

		Object obj = new Object();
		Point p1 = new Point(10, 20);

		//객체변수를 출력하면 참조값을 출력한다
		//	-> println메소드는 객체의 toString()을 호출하여
		//	 리턴값을 출력한다
		System.out.println( obj );
		System.out.println( p1 );
		
		System.out.println("\n---toString()-------");
		System.out.println( obj.toString() );
		System.out.println( p1.toString() );
		
		
		
		System.out.println("\n---equals()-------");
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2; //얕은 복사
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		
		// ==연산자 비교
		//	-> 동일성 비교, identity
		//	-> 같은 객체인지 비교한다
		//	-> 참조값(주소)를 비교한다
		//	-> 참조하는 대상이 같은지 비교한다
		System.out.println();
		System.out.println("p2==p3 : " + (p2==p3));
		System.out.println("p2==p4 : " + (p2==p4));
		
		
		//equals()메소드 비교
		//	-> 동등성 비교, equality
		//	-> 객체의 값(변수)가 같은 값을 가지는지 비교한다
		System.out.println();
		System.out.println("p2.equals(p3) :" + p2.equals(p3));
		System.out.println("p2.equals(p4) :" + p2.equals(p4));
		
		
		
		System.out.println("\n---hashCode()-------");
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		System.out.println();
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		
		
		System.out.println("\n---clone()-------");
		
		Point p_ori = new Point(33, 44);
		
		Point p_clone1 = p_ori; //얕은 복사
		
		Point p_clone2 = new Point( p_ori.getX(), p_ori.getY() ); //깊은 복사
		
		//------------------------------------------------------------------------
		
		//clone()메소드를 이용한 깊은 복사
		Point p_clone3 = null;
		
		try {
			
			p_clone3 = (Point)p_ori.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println( p_clone3 );
		
	}
}





















