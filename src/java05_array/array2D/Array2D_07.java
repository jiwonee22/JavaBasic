package java05_array.array2D;

import java.util.Scanner;

public class Array2D_07 {
	public static void main(String[] args) {

		//학생 성적 관리 프로그램

		//1~3학년
		//2개반
		//4명의 학생
		//3과목		
		//점수

		int[][][][] sco = new int[3][2][4][3];

		//--------------------------------------------------------------

		//1~3학년을 따로 생성하기
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];

		//--------------------------------------------------------------

		//QUIZ.
		//	2명의 국어, 영어, 수학 점수를 처리한다
		//	학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다

		//----- 종합 출력 -----

		//2명의 국어, 영어, 수학 점수를 저장할 배열
		int[][] score = new int[2][3];

		int[] sum = new int[2];//총점 배열
		double[] avg = new double[2];//평균 배열
		
		
		//--- 2명 학생들의 3과목 점수 입력받기 ---
		Scanner sc = new Scanner(System.in);
		
		String[] subject = { "국어", "영어", "수학" };

		for(int i=0; i<score.length; i++) { //i번째 학생		0~1
			for(int j=0; j<score[i].length; j++) { //j번째 과목	0~2

				System.out.print((i+1) + "번 학생의 " + subject[j] + " 점수 : ");
				score[i][j] =  sc.nextInt();
				
			}
			System.out.println();
		}
		
		//TEST
//		for(int i=0; i<score.length; i++) { //i번째 학생		0~1
//			for(int j=0; j<score[i].length; j++) { //j번째 과목	0~2
//				
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
				
		//----------------------------------------
		
		
		
		//--- 총점 계산하기 ---
		
		for(int i=0; i<sum.length; i++) { //i번째 학생		0~1
			for(int j=0; j<score[i].length; j++) { //j번째 과목	0~2
				
				sum[i] += score[i][j];
			}	
		}
		
		//TEST
//		for(int i=0; i<sum.length; i++) { //i번째 학생	
//			System.out.print(sum[i] + " ");
//		}

		//---------------------

		
		//--- 평균 계산하기 ---
		
		for(int i=0; i<avg.length; i++) { //i번째 학생
			avg[i] = sum[i] / (double)3;
		}
		
		//TEST
//		for(int i=0; i<avg.length; i++) { //i번째 학생
//			System.out.print(avg[i] + " ");
//		}
		
		
		//---------------------
		
		//--- 최종 출력 ---
		// ex)	번호	국어	영어	수학	총점	평균
		//		1번		xxx		xxx		xxx		xxx		xxx.xx
		//		2번		xxx		xxx		xxx		xxx		xxx.xx
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length; i++) { //i번째 학생		0~1
			System.out.print((i+1) + "번"); //번호
		
			for(int j=0; j<score[i].length; j++) { //j번째 과목	0~2
				System.out.print("\t" + score[i][j]); //국영수 점수
				
			}
			
			System.out.print("\t" + sum[i]); //총점
			System.out.println("\t" + String.format("%.2f", avg[i])); //평균
		}

		//-----------------



	}

	
}






