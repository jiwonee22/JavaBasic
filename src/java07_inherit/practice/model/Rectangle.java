package java07_inherit.practice.model;

public class Rectangle extends Point {
	//멤버필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
//		super.x = x;
//		super.y = y;
		super(x,y);
		
		this.width = width;
		this.height = height;
		
	}
	
	//메소드
	@Override
	public void draw() {
		System.out.print("좌표 : ");
		super.draw();
		System.out.printf("면적 : %.1f\n", width * (double)height);
		System.out.printf("둘레 : %.1f\n", 2 * (width + (double)height));
		
		
	}

	//getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
