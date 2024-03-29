
public class ArrayEx19 {
	public static void main(String[] args) {
		int[][]score= {   // 배열선언
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal=0 ;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("====================");
		for(int i=0; i<score.length;i++) {  //0으로 초기화 score 배열길이만큼 반복
			int sum=0; //개인별 총점
			float avg=0.0f; //개인별 평균
			
			korTotal += score[i][0];  //국어점수가 합쳐진다아아아
			engTotal += score[i][1];   // 영어점수가 합쳐진다아아아
			mathTotal += score[i][2];  // 수학점수가 합쳐진다아아아
			System.out.printf("%3d", i+1);  //인덱스+1로 걍 번호 매기는느낌.  3붙인건 앞에 두자리 띄울라고한듯
			
			for(int j=0; j<score[i].length;j++) {  //
			sum += score[i][j];  
			System.out.printf("%5d", score[i][j]); // 5자리로 배열값 출력
			}
			avg=sum/ (float)score[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("====================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal,engTotal,mathTotal);
	}
}