import java.util.*;

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ض�!!!!!>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();  //ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("The number you have typed in is zero.");
		}
		
		if(input!=0)
			System.out.println("Hey what the hell! You typed in something not zero!");
			System.out.printf("You typed in number %d.", input);
	}
}