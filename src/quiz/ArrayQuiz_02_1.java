package quiz;

public class ArrayQuiz_02_1 {
	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		int evenSum = 0;

		int oddSum = 0;

		for(int i=0; i<arr.length; i+=2) { 

			evenSum += arr[i];
		}

		for(int i=1; i<arr.length; i+=2) {

			oddSum += arr[i];
		}
		System.out.print("(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합) : ");
		System.out.println(evenSum - oddSum);
		System.out.println("-------------------------------------------");

		
	}
}
