package java01_variables;

public class VariablesEx_06 {

	public static void main(String[] args) {
	
		System.out.println(777); //int형 리터럴 상수 777
		
		//------------------------------------------------------------------
		
		//변수의 상수화 (이름있는 상수)
		final int MAX;
		
		MAX = 100; //한번만 대입 가능
//		MAX = 200; //에러, 다시 대입 불가
//		MAX = 300; //에러, 다시 대입 불가
		
		//관례적으로 이름있는 상수의 이름은 모두 대문자로 작성한다
		// -> 일반 변수랑 구분하기 위해
		
		//상수이름의 단어 구분은 Snake Case를 적용한다 (_ 이용)
		// e.g.) final int MAX_PEOPLE_COUNT = 30;
		
		//------------------------------------------------------------------
		
		// e.g.) 학생들의 성적을 구하는 프로그램
		//		 전체 인원이 50명 -> 49 -> 52
				 
		final int STUDENT_TOTAL_NUM = 52;

		System.out.println("학생 " + STUDENT_TOTAL_NUM + "명에 대한 평균값");
		double average = 1000 / STUDENT_TOTAL_NUM;
		
		System.out.println("평균 : " + average);
		
	}
	
}
