package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		
		int a=5, b=6, c=10;

		boolean res1;
		
		res1 = a<b || --a>c++;
		
		//좌변이 true일때, 우변은 계산하지 않음.
		
		System.out.println("a="+a+",b="+b+",c="+c);

		boolean res2;
		
		res2 = c<b++ && c-->++a; 
		
		System.out.println("a="+a+",b="+b+",c="+c);
		
		//논리연산자의 단축연산(Shortcut)
		//	AND연산은 왼쪽의 피연산자가 false라면 오른쪽항의 연산을 하지 않는다
		// 	OR연산은 왼쪽의 피연산자가 true라면 오른쪽항의 연산을 하지 않는다

	}
}







