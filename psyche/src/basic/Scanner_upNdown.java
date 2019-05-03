package basic;

import java.util.Random;
import java.util.Scanner;

public class Scanner_upNdown {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Random random = new Random();
		 int goal = random.nextInt(101);	// 0~100 사이의 수
		 int trial = 1;
		 int max = 100;
		 int min = 0;
		 System.out.println("Up & down");
		 System.out.printf("%d~%d 사이의 숫자를 입력하세요", min, max);		 
		 while (true){
			 int num = scanner.nextInt();
			 if (num == goal){
				 System.out.printf("정답입니다. %d번 만에 맞추셨습니다.\n", trial);
				 break;
			 }
			 else if (num > goal) {
				 System.out.println(num+"보다 낮은 숫자입니다.");
				 max = num;
				 trial++;
				 System.out.printf("%d~%d 사이의 숫자를 입력하세요", min, max);
			 }
			 else if (num < goal) {
				 System.out.println(num+"보다 높은 숫자입니다.");
				 min = num;
				 trial++;
				 System.out.printf("%d~%d 사이의 숫자를 입력하세요", min, max);
			 }
		 }
		

	}

}
