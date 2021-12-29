package selfstudy.study;

public class Remainder {
	public static void main(String[] args) {
		
//		- 1에서 1000까지의 정수중에서 4로 나누어도
//		 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
//		41916
		
		//12로 나누었을 때 나머지가 1인 수를 구하면 됨
		//총합
		int sum = 0;
		
		for(int i=1; i<=1000; i++) {
			
			if((i % 12) == 1) {
				sum += i;
			}
			
		}
		
		System.out.println("총합 : " + sum);
		
		
		
	}
}
