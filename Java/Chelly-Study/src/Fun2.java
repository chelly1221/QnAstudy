import java.util.*;

public class Fun2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해랏");
		int x = scanner.nextInt();
		System.out.println("두번째 정수를 입력해랏");
		int y = scanner.nextInt();
		
		boolean b = x==y;
		int first = 5 - Boolean.toString(b).length();
		int second = 5 - Boolean.toString(!b).length();
		
		System.out.printf("같으면 1 다르면 0 > %d",first);
		System.out.println(" ");
		System.out.printf("같으면 0 다르면 1 > %d", second);
	}
}