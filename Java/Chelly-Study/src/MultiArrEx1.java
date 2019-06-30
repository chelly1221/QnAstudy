import java.util.*;

public class MultiArrEx1 {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];   //�迭 ��������
		byte[][] shipBoard = {  //�迭�����迭�迭
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 },
		};
				for(int i=1;i<SIZE;i++)  //
					board[0][i] = board[i][0] = (char)(i+'0');    //+48�ؼ� i�� char�� �ٲ㵵 �ð������� ���� ���� �������Ϸ���.
				
				Scanner scanner = new Scanner(System.in);
				
				while(true) {
					System.out.printf("��ǥ�� �Է��ϼ���. (����� 00)>");
					String input = scanner.nextLine();
					
					if(input.length()==2) {   //�Է¹��� ���̰� 2���ڸ�
						x = input.charAt(0) - '0';  //���ڸ� ���ڷ� ��ȯ  charAt(0)�ϸ� �� ���ڸ��������°�  input�� 1�̸� 1-'0'
						y = input.charAt(1) - '0';
						
						if(x==0 && y==0)
							break;
 					}
					
					if(input.length()!=2 ||x<=0||x>=SIZE ||y<=0||y>=SIZE) {   //�Է¹������̰� 2���ڰ� �ƴϸ�
						System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է����ּ���.");
						continue;
					}
					board[x][y] = shipBoard[x-1][y-1]==1 ? '0' : 'X';   // ������ 0 Ʋ���� X ����
					
					for(int i=0; i<SIZE; i++)
						System.out.println(board[i]);  //
					System.out.println();   //���� �����
		}
	}
}