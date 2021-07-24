package selfstudy;

import java.util.Objects;
import java.util.Scanner;

class Card {
	
	//멤버필드
	String kind;
	int number;
	
	//생성자
	Card () {
		this("SPADE", 1);
	}

	Card (String kind, int number) {
		
		this.kind = kind;
		this.number = number;
	}
	
	//메소드
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			return kind == ((Card)obj).kind && number == ((Card)obj).number;
		} else { 
			return false;
		}
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	@Override
	public int hashCode() {
		return Objects.hash(kind, number); 
	}

	
	@Override
	public String toString() {
		return "kind : " + kind +  ", number : " + number;
		}
	
	
}


public class Ex9_4 {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
	}
	
	
}
