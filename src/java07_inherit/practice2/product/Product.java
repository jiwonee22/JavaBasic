package java07_inherit.practice2.product;

public class Product {
	
	//멤버필드
	protected String model;
	protected int price;
	
	//생성자
	public Product(String model, int price) {
		this.model = model;
		this.price = price;		
	}
	
	//메소드
	public void out() {
		System.out.println("상품");
		
	}

	//getter, setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
