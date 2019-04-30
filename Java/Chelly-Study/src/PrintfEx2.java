
public class PrintfEx2 {
	public static void main(String []args) {
			String url = "tech.chelly.kr";
			
			float f1 = .10f; //0.10, 1.0e-1
			float f2 = 1e1f; //10.0,1.0e1,1.0e+1    e는 10의 제곱이래 f는 float 실수형 리터럴의 접미사.  1e1=10 1e2=100 1e-1=0.1 이해완료
			float f3 = 3.14e3f;  //e3이면 1000곱하는건가? 그럼 3140이 되나
			double d = 1.23456789;
			System.out.printf("f1=%f, %e, %g%n",f1,f1,f1); //f부동소수점,e exponent 10의 n승으로 표현 , g간단하게 표현할때
			System.out.printf("f2=%f, %e, %g%n",f2,f2,f2);  // 실수ㄹ형 값 출력에 쓰는 지시자가 이거3개인데 %f를 많이 쓴다고 함. 사실인가?
			System.out.printf("f3=%f, %e, %g%n",f3,f3,f3);
			System.out.printf("f3=%-13f, %13e, %013g%n",f3,f3,f3);  //전 단계에서 배운거 활용해본다고 13넣어봄
			System.out.printf("d=%f%n",d);    
			System.out.printf("d=%14.10f%n",d);    //14.10 전체 14자리중 소수점10자리
			System.out.printf("[12345678901234567890]%n"); //이건 예제에 왜 들어있는겨?
			System.out.printf("[%s]%n",url);
			System.out.printf("[%20s]%n",url);
			System.out.printf("[%-20s]%n", url); //왼쪽 정렬
			System.out.printf("[%.8s]%n", url); //왼쪽에서 8글자만 출력
			
	}	
}
