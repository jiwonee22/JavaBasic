package java07_inherit.practice2.product;

public class Computer extends Product {
	
	//멤버필드
	
	//생성자
	public Computer(String model, int price) {
		super(model, price);
	}
	
	//메소드
	@Override
	public void out() {
		System.out.println("Computer : " + model + ", " + price);
	}
	
	//getter, setter
	
}
