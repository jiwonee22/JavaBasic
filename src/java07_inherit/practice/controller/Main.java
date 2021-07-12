package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
//		* 구현내용
//		Circle 배열 초기화 : 3개
//		Rectangle 배열 초기화 : 3개
//		각각 draw() 출력 처리
		
		
		Circle[] ci = new Circle[3];
		
		ci[0] =  new Circle();
		ci[1] =  new Circle(10,20,3);
		ci[2] =  new Circle(4,5,7);
				
		
		for(int i=0; i<ci.length; i++) {
			System.out.println("--- " + (i+1) + "번째 원 ---");
			ci[i].draw();
			System.out.println();
		}
		
		
		Rectangle[] rects = {
				new Rectangle()
				, new Rectangle(1,2,3,4)
				, new Rectangle(5,6,7,8)
		};
		
		for(int i=0; i<rects.length; i++) {
			System.out.println("--- " + (i+1) + "번째 사각형 ---");
			rects[i].draw();
			System.out.println();
		
		}
		
		//for-each 구문
		
		for(Circle c : ci) {
			c.draw();
		}
		
		for(Rectangle rt : rects) {
			rt.draw();
		}
		
	}
}
