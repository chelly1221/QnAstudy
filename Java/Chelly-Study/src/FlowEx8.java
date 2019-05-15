import java.util.*;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.print("주민번호 내놔라 (011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch (gender) {
			case '1': case '3':
				System.out.println("남자군.");
				break;
			case '2': case '4':
				System.out.println("여자군.");
				break;
			default:
				System.out.println("이상한 번호군");
		}
	}
}