import java.util.Scanner;

class Year{
	public static void main(String []args) {
		int i=0;
		while (i==0) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("������� 8�ڸ��� �Է����ּ���.");  
		int birth = (int)scanner.nextLong();
		while (birth > 99999999 || birth < 10000000) {
			System.out.print("�߸��Է��ϼ̽��ϴ�. YYYYMMDD �������� �Է����ּ���.");  
			birth = (int)scanner.nextLong();
		}  
		
		int birthday = birth%100;
		int birthmonth = (birth/100)%100;
		int birthyear = birth/10000;
		
		System.out.print("���ó�¥ 8�ڸ��� �Է����ּ���.");
		int today = scanner.nextInt();
		while (today > 99999999 || today < 10000000) {
			System.out.print("�߸��Է��ϼ̽��ϴ�. YYYYMMDD �������� �Է����ּ���.");  
			today = (int)scanner.nextLong();
		}  
		
		int day = today%100;
		int month = (today/100)%100;
		int year = today/10000;
		
		int ������ = year-birthyear-1;
		System.out.println( );
		System.out.println("����� "+birthyear+"�� "+birthmonth+"�� "+birthday+"�Ͽ� �¾���ϴ�.");
		System.out.println("�׸��� ������ "+year+"�� "+month+"�� "+day+"�� �Դϴ�.");
		System.out.println( );
		//���� ������ ������ ������ ���ݳ� ���� Ŭ��, 100+���ݳ�-����=������, �ѱ�����=������+!
		if (month != birthmonth) {
			if (month > birthmonth) {  //������ ��������
				int �ѱ����� = ������+1;
				System.out.println("����� �� "+������+"�� �Դϴ�.");
				System.out.println("�ѱ����̷δ� "+�ѱ�����+"�� �Դϴ�.");
			}
			else {                //������ ������ �ʾ�����
				int �ѱ����� = ������+2;
				System.out.println("����� �� "+������+"�� �Դϴ�.");
				System.out.println("�ѱ����̷δ� "+�ѱ�����+"�� �Դϴ�.");
			}
		}
		else if (day >= birthday){     //������ ��������
			int �ѱ����� = ������+1;
			System.out.println("����� �� "+������+"�� �Դϴ�.");
			System.out.println("�ѱ����̷δ� "+�ѱ�����+"�� �Դϴ�.");
		}
		
		else if (day < birthday) {     //������ ������ �ʾ�����
			int �ѱ����� = ������+2;
			System.out.println("����� �� "+������+"�� �Դϴ�.");
			System.out.println("�ѱ����̷δ� "+�ѱ�����+"�� �Դϴ�.");
		}
		System.out.println("�ѹ����Ϸ��� ���� 1�� �����ּ���.");
		int con = scanner.nextInt();
		if (con == 1) {
			System.out.println("�ٽ� �����մϴ�.");
		}
	}	
	}
}