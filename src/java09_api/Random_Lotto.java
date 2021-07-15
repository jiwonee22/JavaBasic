package java09_api;

import java.util.Arrays;
import java.util.Random;

public class Random_Lotto {
	public static void main(String[] args) {
		
		//랜덤 숫자(1~45) 6개 생성
		//	-> 중복되지 않은 숫자
				
		Random ran = new Random();
		
		int [] arr = new int[6];
		
		//전체 6개 랜덤 수 구하기
		for(int i=0; i<arr.length; i++) {
			
			int num = ran.nextInt(45) + 1; //1~45
			
			
			//중복되는 값인지 체크하기
			boolean isExists = false; //중복값 flag, false : 중복없음 true : 중복있음
			
			//이미 생성한 값들 중에서 존재하는지 검사
			for(int j=0; j<i; j++) {
			
				if(arr[j] == num) { //중복되는 값일 경우
					isExists = true;
					
					break; //중복검사 중단
				}
			}
			
			if(isExists) {//중복되는 값 존재
				continue;
			}
			
			
			//랜덤값 배열에 대입하기
			arr[i] = num;
			
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);//정렬
		System.out.println(Arrays.toString(arr));
		
	}
}



