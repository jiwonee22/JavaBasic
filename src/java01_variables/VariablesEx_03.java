package java01_variables;

//자동완성 단축키 : ctrl + space

public class VariablesEx_03 {
	
	public static void main(String[] args) {
		
		int data;
		//쓰레기값(garbage value)이 들어가있는 상태가 된다
		
		
		data = 13;
		
		System.out.println(data);
		
		//----------------------------------------
		
		int data2 = 123; //선언과 동시에 초기화
		//쓰레기값이 들어가지 않고 곧바로 초기화된다
		
		System.out.println(data2);
		
	}
	
}
