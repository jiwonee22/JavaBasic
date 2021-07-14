package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//Class Random
		//	java.util 패키지
		
		Random ran; //랜덤 객체 변수
		
		ran = new Random();
		
		System.out.println(ran.nextInt());
		
		System.out.println("------------------");
		
		System.out.println(ran.nextInt()); //약 -21억 ~ 약 21억
		System.out.println(ran.nextBoolean()); //true 또는 false
		System.out.println(ran.nextDouble()); //0.0이상 ~  1.0미만
		
		System.out.println("------------------");
		
		System.out.println(ran.nextInt(100)); //0~99 (100개중에 랜덤)
		System.out.println(ran.nextInt(100) + 1); // 0~99 +1 -> 1~100 (100개중 랜덤)
		
		System.out.println("------------------");
		
		System.out.println(ran.nextInt(3) + 5); //0~2 +5 -> 5~7 (3개중 랜덤)
		
		
		
	}

}
