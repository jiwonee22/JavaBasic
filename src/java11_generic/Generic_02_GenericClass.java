package java11_generic;

class Class02_1 {
	
	//멤버필드
	private int data;
	
	//생성자
	public int display(int data) {
		this.data = data;
		return data;
	}
	
	//getter, setter
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}

class Class02_2 {
	
	//멤버필드
	private double data;
	
	//생성자
	public double display(double data) {
		this.data = data;
		return data;
	}

	//getter, setter
	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}
	
}

class Class02<T> {

	//멤버필드
	private T data;
	
	//생성자
	public T display(T data) {
		this.data = data;
		return data;
	}

	//getter, setter
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}





public class Generic_02_GenericClass {
	public static void main(String[] args) {
		
	//타입파라미터를 결정하지 않음
	//	T -> Object (자동) 추천하지 않음
	Class02 cl_01 = new Class02();
	
	//--------------------------------------------
	
	//타입파라미터를 String으로 결정함
	//	T -> String
	Class02<String> cl_02 = new Class02<>();
	
	cl_02.setData("Apple");
	
	String fruit = cl_02.getData();
	System.out.println(fruit);
	
	cl_02.display("Banana");
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
