import java.util.*;

public class Fun2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ض�");
		int x = scanner.nextInt();
		System.out.println("�ι�° ������ �Է��ض�");
		int y = scanner.nextInt();
		
		boolean b = x==y;
		int first = 5 - Boolean.toString(b).length();
		int second = 5 - Boolean.toString(!b).length();
		
		System.out.printf("������ 1 �ٸ��� 0 > %d",first);
		System.out.println(" ");
		System.out.printf("������ 0 �ٸ��� 1 > %d", second);
	}
}