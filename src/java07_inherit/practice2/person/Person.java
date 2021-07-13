package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
	
	//멤버필드
	private String name;
	private int money;
	private Product prod;
	
	
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//메소드
	public void buy(Product p) {
		
		if( money < p.getPrice()) {
			System.out.println("[ERROR] 잔액이 부족합니다");
			return;
		}
		
		prod = p; //물건 구매
		
		money -= p.getPrice(); //소지금 차감
		
		System.out.println(name + "님이 " + p.getPrice() + "원을 지불하고 " + p.getModel() + " 구매함");
		System.out.println("[잔액] " + (money) + "원");
		
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
	
	
	
	
	
}
