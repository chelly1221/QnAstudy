
public class ArrayEx18 {
	public static void main(String[] args) {
		int[][] score= {
				{100, 100, 100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
		};
		int sum = 0;
		
		for(int i=0;i < score[i].length; i++) {  // 1차배열길이만큼 증가반복,
			for(int j=0; j <score[i].length;j++) {  // 2차배열길이만큼 증가반복 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);  // 인덱스로 나타내쥼
			}	
		}
		for (int[] tmp: score) {  //배열이 스택이 아닌 힙영역에 저장되기 때문에 값을 아우르는 주솟값의 리스트로 저장된걸 TMP로 불러와서
			for(int i : tmp) {   //i에 불러온 tmp 인덱스별로 넣어서 돌리고  
				sum+=i;     // 계속 더함 ㅎㅎ
			}
		}
		System.out.println("sum="+sum);
	}
}