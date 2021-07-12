package java07_inherit.practice.model;

public class Circle extends Point {
	//멤버필드
	private int radius;
	
	//생성자
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
//		super.x = x;
//		super.y = y;
		super(x,y); //수퍼 생성자 호출
		
		this.radius = radius;
		
	}
	
	//메소드
	@Override
	public void draw() {
		//중심점
		System.out.print("중심점 : ");
		super.draw();
		
		//원의 면적
		System.out.print("원의 면적 : ");
		System.out.printf("%.1f", (radius * radius * Math.PI));
		System.out.println();
		
		//원의 둘레
		System.out.print("원의 둘레 : ");
		System.out.printf("%.1f", (radius * 2 * Math.PI));
		System.out.println();
	}
	
	//getter, setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
