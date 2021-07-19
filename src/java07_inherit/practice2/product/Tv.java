package java07_inherit.practice2.product;

public class Tv extends Product {

	//멤버필드
	
	//생성자
	public Tv(String model, int price) {
		super(model, price);
	}

	//메소드
	@Override
	public void out() {
		System.out.println("TV : " + model + ", " + price);
	}

	//getter, setter

}
