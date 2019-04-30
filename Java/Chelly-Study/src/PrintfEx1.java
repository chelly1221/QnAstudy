
public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c ='A';
		
		int 지시자놀이 = 10;
		long big = 100_000_000_000L; //long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; //8진수라서 앞에 0 붙임
		int hexNum = 0x10; //16진수는 0x붙이고   십진수로는 16
		int binNum = 0b10; //2진수는 0b   진수 변환 짜증나   10진수로는 2
		
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%d%n",s);
		System.out.printf("c=%c, %d %n",c,(int)c);
	    System.out.printf("지시자앞에 5붙이면=[%5d]%n",지시자놀이); //5를 붙이면 자릿수가 5개가 된다.  이것 빈자리가 왼쪽에 공란으로 나오고
		System.out.printf("지시자앞에 -붙이면=[%-5d]%n",지시자놀이); // -붙이면 오른쪽에 나오고
		System.out.printf("지시자앞에 0붙이면=[%05d]%n",지시자놀이); // 0 붙이면 0이 왼쪽빈자리에 나오네?
		System.out.printf("big=%d%n",big);
		System.out.printf("hex=%#x%n",hex);
		System.out.printf("octNum=%o,%d%n",octNum,octNum);
		System.out.printf("hexNum=%x, %d%n",hexNum,hexNum);
		System.out.printf("Integer.toBinaryString을 써서 앞쪽 10은 문자열로 나왔을듯=%s , %d%n",Integer.toBinaryString(binNum),binNum);
	}
}