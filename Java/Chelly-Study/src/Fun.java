import java.util.*;

public class Fun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ض�");
		int x = scanner.nextInt();
		System.out.println("�ι�° ������ �Է��ض�");
		int y = scanner.nextInt();
		
		int first = (x==y) ? 1 : 0;
		int second = (x==y) ? 0 : 1;
		
		System.out.printf("������ 1 �ٸ��� 0 > %d", first);
		System.out.println(" ");
		System.out.printf("������ 0 �ٸ��� 1 > %d", second);
	}
}