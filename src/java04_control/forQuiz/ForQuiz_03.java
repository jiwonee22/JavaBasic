package java04_control.forQuiz;

public class ForQuiz_03 {

	//	- 1���� 1000������ �����߿��� 4�� �����
	//	 6���� ����� �������� 1�� ���� ���� ����϶�.
	//		> 41916

	public static void main(String[] args) {

		int sum = 0;

		for(int i=1; i<=1000; i++) {


			if((i%4 == 1) && (i%6 == 1)) { 

				sum += i;

			}

		}

		System.out.println(sum);

	}
}
