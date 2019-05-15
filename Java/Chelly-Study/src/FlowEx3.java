import java.util.*;

public class FlowEx3 {
	public static void main(String[] args) {
		System.out.print("Type in a Number");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이아닙니다.");
		}
	}
}