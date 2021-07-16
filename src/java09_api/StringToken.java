package java09_api;

import java.util.StringTokenizer;

import jdk.nashorn.internal.parser.Token;

public class StringToken {
	public static void main(String[] args) {
		
		String data1 = "Hi Hello Hola";
		
		String[] tokens = data1.split(" ");
		// " " 띄어쓰기를 구분자(deliminator)로 사용하여
		//	data1문자열을 토큰화한다
		
		//	-> 결과는 String[] 타입으로 반환한다
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(i + " : " + tokens[i]);
		}
		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("------------------");
		
		String data2 = "I!%am!%iron!%man";
		tokens = data2.split("!%");
		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("------------------");
		
		//구분자 : 공백문자
		StringTokenizer st1 = new StringTokenizer(data1);
		
		System.out.println("토큰의 개수 : " + st1.countTokens());
		
		//토큰이 존재하는 만큼 반복한다
		while(st1.hasMoreTokens()) {

			System.out.println(st1.nextToken());
			
		}
		
		System.out.println("------------------");
		
		StringTokenizer st2 = new StringTokenizer(data2, "!%");

		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());

//		System.out.println(st2.nextToken()); //에러, NoSuchElementException
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
