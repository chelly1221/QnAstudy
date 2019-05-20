
public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];  // 배열길이가 10 (목록숫자는 0~9)인 배열 생성
		int[] counter = new int[10];  // 얘도 마찬가지  (int 배열의 기본값은 0이다)
		
		for (int i=0; i < numArr.length; i++) {   // 배열 길이만큼 반복 (10회)
			numArr[i] = (int)(Math.random() * 10);   // 반복하면서 0~9 중 하나를 배열에 랜덤으로 넣음.
			System.out.print(numArr[i]);   // 그리고 그걸 가로방향으로 붙여서 출력함
		}
		System.out.println();  // 이건 그냥 한칸띄울라고 있는 느낌인데?
		
		for (int i=0; i < numArr.length; i++) {  // 배열길이만큼 반복
			counter[numArr[i]]++;            // numArr배열 인덱스i의 값이 카운터의 인덱스번호가 되고 그 인덱스의 배열값에 1더하는걸 반복
		}
		for (int i=0; i<numArr.length; i++) { 
			System.out.println(i+"의 개수 :"+ counter[i]);  // 0부터 9까지 카운터인덱스값으로 넣어서 출력 
		}
 	}
}