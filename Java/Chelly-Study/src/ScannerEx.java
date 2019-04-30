import java.util.*;  //Scanner 사용하려면 추가해야하는듯 임포트면 어디서 가꼬오는건가... 어디서 무엇을?..

class ScannerEx{
	public static void main(String []args) {
		Scanner scanner = new Scanner (System.in); //이거 먼지 전혀 모르겠다.. 스캐너타입의 변수 scanner를 새로만드는걸까?  System.in이 시스템안에 만드는거라면 System.out같은것도 있나...
		System.out.print("두자리 정수를 하나 입력해주세요.>");  //printf, println 말고 그냥 print도 있네;  두자리 정수 안넣어도 나오는데 굳이 2자리 넣으라는 이유는?
		String input = scanner.nextLine();  //scanner은 위에서 지정한 새로만든 스캐너이려나 nextLine은 다음줄에 입력하는건가? 모르겠다 //input이라는 변수를 지정
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환 //Integer.parseInt가 숫자로 변환하는건가보군.  Integer.toBinaryString은 2진 문자열이고... //아 그럼 input을 숫자로 바꾼게 num변수의 값이.
		
		System.out.println("입력내용 :"+input); //인풋을 이렇게 넣으면 인풋을 출력할 수 있군sdfasd
		System.out.printf("num=%d%n", num); 
	}	
} 