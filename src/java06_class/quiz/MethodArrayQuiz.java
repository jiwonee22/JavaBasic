package java06_class.quiz;

import java.util.Arrays;

public class MethodArrayQuiz {

	public void mul10(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 10;
		} //for end
	}//mul10 end

	public void print(int[] arr) {
		System.out.println(Arrays.toString(arr));

	}
	
}//class end
