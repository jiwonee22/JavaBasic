package java09_api;

//별도의 extends코드없이도 Object클래스를 상속받고 있다

public class Point implements Cloneable {
	
	private int x; //x좌표
	private int y; //y좌표
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	//toString() 자동 생성 단축키 : alt + shift + s , s
//	@Override
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		// p2.equals(p4); 로 호출한다면
		//  -> this == p2
		//  -> obj == p4
		
		if( this.x == ( (Point)obj ).getX() && this.y == ( (Point)obj).getY() ) {
			return true; //동등하다
		} else {
			return false; //동등하지 않다
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
