package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//while���� �̿��� ������ ���
		//	-> 2~9�� ���� ���
		
		int i=2;
		while (i<10) {
			
			int j=1;
			System.out.println();
			
			while (j<10) {
				System.out.print(i + " X "+ j + " = " + (i*j) + "\t");
				
				j++;
			}
			System.out.println();

			i++;			
		}
	
	}
}
