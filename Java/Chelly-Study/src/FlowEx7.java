import java.util.*;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2),보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("닌 "+ user +"이다.");
		System.out.println("난 "+ com +"이다.");
		
		switch (user-com) {
			case 2: case -1:
				System.out.println("니가 졌다.");
			case 1: case -2:
				System.out.println("니가 이겼다.");
			case 0:
				System.out.println("비겼다.");
				break;
		}
	}
}