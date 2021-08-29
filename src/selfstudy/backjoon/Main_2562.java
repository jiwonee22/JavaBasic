package selfstudy.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[9];
		int[] arr2 = new int[9];

		for(int i=0; i<9; i++) {
			arr1[i] = sc.nextInt();
		}
		
		arr2 = arr1;
		
		Arrays.sort(arr1);
					
		for(int i=0; i<9; i++) {
			if(arr1[8] == arr2[i]) {
				System.out.println(arr1[8]);
				System.out.println(i);
			}
		}

	}
}
