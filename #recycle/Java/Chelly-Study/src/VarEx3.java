
public class VarEx3 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp=0;  //temporary �ӽ÷� x�� ���� ����
		
		System.out.println("x:"+x+"y:"+y);
		
		tmp=x;
		x=y;
		y=tmp;
		
		System.out.println("x:"+x+"y:"+y);
	}
}
