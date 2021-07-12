package java07_inherit.practice.model;

public class Point {
	//멤버필드
	protected int x;
	protected int y;
		
	//생성자
	public Point() {
		//기본 좌표는 (0,0)으로 한다
//		this.x = 0;
//		this.y = 0;
//		비워놔도 됨
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드
	public void draw() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	//getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}


