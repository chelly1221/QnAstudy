import java.util.*;

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력해라!!!!!>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();  //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("The number you have typed in is zero.");
		}
		
		if(input!=0)
			System.out.println("Hey what the hell! You typed in something not zero!");
			System.out.printf("You typed in number %d.", input);
	}
}