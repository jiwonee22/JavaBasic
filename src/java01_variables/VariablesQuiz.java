package java01_variables;

public class VariablesQuiz {

	public static void main(String[] args) {
		
		//1. ������ �˸��� Ÿ�� ã��
		
		//�̸� - String
		//���� - int
		//���� - ��/��, char
		//Ű - double

		
		//2. ���� ����
		String name; //�̸�
		int age; //����
		char gender; //����
		double height; //Ű
		
		
		//3. ������ �� ����
		name = "Alice";
		age = 99;
		gender = '��';
		height = 222.66;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height);
		
		System.out.println("----------------------------");
		
		System.out.println("�̸� : " + name + ", ���� : " + age + ", ���� : " + gender + ", Ű : " + height);
	
		System.out.println("----------------------------");
		
		//** println - �־��� ���ڿ��� ����ϰ� ����(�ٹٲ�)
		//** print - �־��� ���ڿ��� ���(�ٹٲ� X)
		
		System.out.print("�̸� : " + name);
		System.out.print("\n���� : " + age);
		System.out.println();
		
		System.out.print("���� : " + gender);
		
		//** ���๮��(�ٹٲ޹���) - \n


	}

}
