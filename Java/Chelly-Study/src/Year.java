import java.util.Scanner;

class Year{
	public static void main(String []args) {
		int i=0;
		while (i==0) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("생년월일 8자리를 입력해주세요.");  
		int birth = (int)scanner.nextLong();
		while (birth > 99999999 || birth < 10000000) {
			System.out.print("잘못입력하셨습니다. YYYYMMDD 형식으로 입력해주세요.");  
			birth = (int)scanner.nextLong();
		}  
		
		int birthday = birth%100;
		int birthmonth = (birth/100)%100;
		int birthyear = birth/10000;
		
		System.out.print("오늘날짜 8자리를 입력해주세요.");
		int today = (int)scanner.nextLong();
		while (today > 99999999 || today < 10000000) {
			System.out.print("잘못입력하셨습니다. YYYYMMDD 형식으로 입력해주세요.");  
			today = (int)scanner.nextLong();
		}  
		
		int day = today%100;
		int month = (today/100)%100;
		int year = today/10000;
		
		int 만나이 = year-birthyear-1;
		System.out.println( );
		System.out.println("당신은 "+birthyear+"년 "+birthmonth+"월 "+birthday+"일에 태어났습니다.");
		System.out.println("그리고 오늘은 "+year+"년 "+month+"월 "+day+"일 입니다.");
		System.out.println( );
		//내가 생일이 지나고 생년이 지금년 보다 클때, 100+지금년-생일=만나이, 한국나이=만나이+!
		if (month != birthmonth) {
			if (month > birthmonth) {  //생일이 지났을때
				int 한국나이 = 만나이+1;
				System.out.println("당신은 만 "+만나이+"세 입니다.");
				System.out.println("한국나이로는 "+한국나이+"세 입니다.");
			}
			else {                //생일이 지나지 않았을때
				int 한국나이 = 만나이+2;
				System.out.println("당신은 만 "+만나이+"세 입니다.");
				System.out.println("한국나이로는 "+한국나이+"세 입니다.");
			}
		}
		else if (day >= birthday){     //생일이 지났을때
			int 한국나이 = 만나이+1;
			System.out.println("당신은 만 "+만나이+"세 입니다.");
			System.out.println("한국나이로는 "+한국나이+"세 입니다.");
		}
		
		else if (day < birthday) {     //생일이 지나지 않았을때
			int 한국나이 = 만나이+2;
			System.out.println("당신은 만 "+만나이+"세 입니다.");
			System.out.println("한국나이로는 "+한국나이+"세 입니다.");
		}
		System.out.println("한번더하려면 숫자 1을 눌러주세요.");
		int con = scanner.nextInt();
		if (con == 1) {
			System.out.println("다시 시작합니다.");
		}
	}	
	}
}