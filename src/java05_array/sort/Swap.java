package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑, swap, 자리 바꾸기, 교환하기
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("[스왑 전] " + num1 + ", " + num2);
		
		//스왑코드
		int tmp = num1; //임시변수에 데이터 백업
		num1 = num2; //데이터 저장
		num2 = tmp; //복원
		
		
		System.out.println("[스왑 후] " + num1 + ", " + num2);
	}
}
