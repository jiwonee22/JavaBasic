package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class RanQuiz_01 {
	public static void main(String[] args) {
		//	 + UP&DOWN 게임
		//	  - 컴퓨터가 1~50의 랜덤을 생성한다 (= com)
		//	  
		//	  - 사용자의 입력을 받는다 (= user)
		//	 
		//	  - user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
		//	   (기준은 com)
		//	   (ex. com == 40 && user == 30 -> UP )
		//	   
		//	  - user가 com과 같으면 user 승리
		//	  
		//	  - 7번안에 맞추지 못하면 com 승리

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com = ran.nextInt(49);


		for(int i=0; i<8; i++) {
			if(i<=6) {
				System.out.print("1부터 50까지 중 숫자를 입력하세요 : ");
				int user = sc.nextInt();

				if(com > user) {
					System.out.println("=============UP=============");
				} else if(com < user) {
					System.out.println("============DOWN=============");
				} else if(com == user) {
					System.out.println("게임 종료");
					System.out.println("유저 승리!");
					break;
				}
			} else {
				System.out.println("컴퓨터 승리!");
			}
		}
	}
}