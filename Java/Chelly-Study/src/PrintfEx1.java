
public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c ='A';
		
		int �����ڳ��� = 10;
		long big = 100_000_000_000L; //long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; //8������ �տ� 0 ����
		int hexNum = 0x10; //16������ 0x���̰�   �������δ� 16
		int binNum = 0b10; //2������ 0b   ���� ��ȯ ¥����   10�����δ� 2
		
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%d%n",s);
		System.out.printf("c=%c, %d %n",c,(int)c);
	    System.out.printf("�����ھտ� 5���̸�=[%5d]%n",�����ڳ���); //5�� ���̸� �ڸ����� 5���� �ȴ�.  �̰� ���ڸ��� ���ʿ� �������� ������
		System.out.printf("�����ھտ� -���̸�=[%-5d]%n",�����ڳ���); // -���̸� �����ʿ� ������
		System.out.printf("�����ھտ� 0���̸�=[%05d]%n",�����ڳ���); // 0 ���̸� 0�� ���ʺ��ڸ��� ������?
		System.out.printf("big=%d%n",big);
		System.out.printf("hex=%#x%n",hex);
		System.out.printf("octNum=%o,%d%n",octNum,octNum);
		System.out.printf("hexNum=%x, %d%n",hexNum,hexNum);
		System.out.printf("Integer.toBinaryString�� �Ἥ ���� 10�� ���ڿ��� ��������=%s , %d%n",Integer.toBinaryString(binNum),binNum);
	}
}