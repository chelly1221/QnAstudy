
public class ArrayEx13 {
	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E'};   //���� �迭 hex C A F E 
		
		String[] binary = { "0000","0001", "0010", "0011"
				, "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101" , "1110", "1111"
		};  // ���ڿ� �迭 binary�� 2���� ������� �ְ�
		String result="";  // ��� �� ��ĭ  Ȥ�� ������ null�����𸣰ڳ�.
		
		for(int i=0; i<hex.length; i++) {    // hex �迭���̸�ŭ �ݺ�
			if(hex[i] >='0' && hex[i] <='9') {   //�迭�� 0���� ũ�ų� ������ && �迭�� 9���� �۰ų� ������  - ���:�迭�� 0~9�����϶�
				result +=binary[hex[i]-'0'];   // ����Ʈ�� ����Ʈ+���̳ʸ� �迭[�ε���=hex[i]�迭��-'0']
			} else {  
				result +=binary[hex[i]-'A'+10];  //���ͺ���ѵ�  'A'���� 10����
			}
		}
		System.out.println("hex:"+ new String(hex));
		System.out.println("binary:"+result);
 	}
}