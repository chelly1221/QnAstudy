import java.util.*;  //Scanner ����Ϸ��� �߰��ؾ��ϴµ� ����Ʈ�� ��� �������°ǰ�... ��� ������?..

class ScannerEx{
	public static void main(String []args) {
		Scanner scanner = new Scanner (System.in); //�̰� ���� ���� �𸣰ڴ�.. ��ĳ��Ÿ���� ���� scanner�� ���θ���°ɱ�?  System.in�� �ý��۾ȿ� ����°Ŷ�� System.out�����͵� �ֳ�...
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");  //printf, println ���� �׳� print�� �ֳ�;  ���ڸ� ���� �ȳ־ �����µ� ���� 2�ڸ� ������� ������?
		String input = scanner.nextLine();  //scanner�� ������ ������ ���θ��� ��ĳ���̷��� nextLine�� �����ٿ� �Է��ϴ°ǰ�? �𸣰ڴ� //input�̶�� ������ ����
		int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ //Integer.parseInt�� ���ڷ� ��ȯ�ϴ°ǰ�����.  Integer.toBinaryString�� 2�� ���ڿ��̰�... //�� �׷� input�� ���ڷ� �ٲ۰� num������ ����.
		
		System.out.println("�Է³��� :"+input); //��ǲ�� �̷��� ������ ��ǲ�� ����� �� �ֱ�sdfasd
		System.out.printf("num=%d%n", num); 
	}	
} 