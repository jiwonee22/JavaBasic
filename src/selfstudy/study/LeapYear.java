package selfstudy.study;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		//연도가 4로 나누어 떨어지면 윤년
		//4로 나누어 떨어지면서 100으로도 나누어 떨어질 경우 평년
		//4로 나누어 떨어지고, 100으로도 나누어 떨어지면서 400으로도 나누어 떨어지면 윤년
		
		// 1. 구하고자 하는 연도가 윤년인지 알아보기
		System.out.print("연도를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int year = 0;
		year = sc.nextInt();
		
		if((year%4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		// 2. 구하고자하는 연도의 1월 1일은 무슨요일인지 구하기
		
		//평년이면 365일, 윤년이면 366일.
		// 구하고자 하는 연도전까지 평년이 몇번이고, 윤년이 몇번인지 구한다.
		
		// 4로 나누어 떨어지는 윤년 횟수를 더하고,
		//	100으로 나누어 떨어지는 평년은 빼고,
		//	400으로 나누어 떨어지는 윤년은 다시 더함
		int entireday = (365 * (year - 1) + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400));

		String[] day = new String[7];
		
		day[0] = "월요일"; day[1] = "화요일"; day[2] = "수요일";
		day[3] = "목요일"; day[4] = "금요일"; day[5] = "토요일"; day[6] = "일요일";
		
		int mod = entireday % 7;
		System.out.println(day[mod]);
		
		
		sc.close();
		
		
		
		
		
		
	}
}
