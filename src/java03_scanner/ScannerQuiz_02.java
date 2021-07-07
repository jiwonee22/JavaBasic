package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	//학생 정보 관리 프로그램
	//	이름, 나이, 성별, 국어, 영어, 수학
	//	6가지 정보를 저장할 수 있는 변수를 만들고
	//	총점과 평균을 포함한 결과를 출력한다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		//-----------------------------------------
		
		//이름 입력
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); //이름
//		System.out.println("[TEST] name : " + name);
		
		//나이 입력
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();	//나이
//		System.out.println("[TEST] age : " + age);

		//성별 입력
		System.out.print("성별을 입력하세요(M/F) : ");
		sc.nextLine(); //입력 버퍼 비우기
		char gender = sc.nextLine().charAt(0); //버퍼문제 발생함!
//		System.out.println("[TEST] gender : " + gender);
		
		//국어 입력
		System.out.print("국어 점수는? : ");
		int kor = sc.nextInt(); //국어
		
		//영어 입력
		System.out.print("영어 점수는? : ");
		int eng = sc.nextInt(); //영어
		
		//수학 입력
		System.out.print("수학 점수는? : ");
		int math = sc.nextInt(); //수학
//		System.out.println("[TEST] 점수들 : " + kor + ", " + eng + ", " + math);
		
		//총점 구하기
		int total = kor + eng + math;

		//평균 구하기
		double avg = total /(double)3;
		
		System.out.println("===== 출력 =====");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t"
				+ age + "\t"
				+ gender + "\t"
				+ kor + "\t"
				+ eng + "\t"
				+ math + "\t"
				+ total + "\t");
		System.out.printf("%.2f", avg);
		
		
		
		
//		
//		//1. 변수 설정
//		String name;
//		int age;
//		char gender;
//		int korean;
//		int english;
//		int mathematics;
//		int sum;
//		
//		double average;
//		
//		Scanner in = new Scanner(System.in);
//		
//		//2. 데이터 입력
//		System.out.print("Input Name : ");
//		name = in.nextLine();
//		
//		System.out.print("Input Age : ");
//		age = in.nextInt();
//	
//		in.nextLine();
//		
//		System.out.print("Input Korean : ");
//		korean = in.nextInt();
//		
//		System.out.print("Input English : ");
//		english = in.nextInt();
//
//		System.out.print("Input Mathematics : ");
//		mathematics = in.nextInt();
//		
//		//3. 문제에 주어진 계산
//	
//		sum = korean + english + mathematics;
//		average = sum / (double)3;
//		
//		//4. 결과 출력
//		
//		System.out.println("===== 출력 =====");
//		System.out.println("이름	나이	성별	국어	영어	수학	총점	평균");
//		System.out.println(name + age + korean + english + mathematics + sum + average);
//		
//		

	}

}
