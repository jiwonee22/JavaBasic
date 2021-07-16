package java09_api;

public class StringBuilderEx {
	public static void main(String[] args) {
		
		System.out.println("---StringBuilder 생성-------");
		
		StringBuilder sb; //객체 변수 선언
		
//		sb = "Apple"; //에러, String타입처럼 사용할 수 없다
	
		sb = new StringBuilder(); //객체 생성
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity());
		
		System.out.println("---Apple 추가------");
		sb.append("Apple");
		
		sb.append(123);
		
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity());
		
		System.out.println(sb);
		
		//기본 capacity인 16을 넘는 값 추가
		System.out.println("---BananaBanana-----");
		
		sb.append("BananaBanana");
		
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity());
		
		System.out.println(sb);

		//capacity를 length만큼으로 맞춘다(줄인다)
		System.out.println("---trimToSize----");

		sb.trimToSize();
		
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity());
		
		System.out.println(sb);
		
		
		
		
	}
}
