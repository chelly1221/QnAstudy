
public class OperatorEx7 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);  //정수로 변환해서 계산하기 때문에 오류가 발생한다. 4바이트를 1바이트에 넣으려고 해서
		System.out.println(c);
	}
}