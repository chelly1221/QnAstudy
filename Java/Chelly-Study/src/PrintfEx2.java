
public class PrintfEx2 {
	public static void main(String []args) {
			String url = "tech.chelly.kr";
			
			float f1 = .10f; //0.10, 1.0e-1
			float f2 = 1e1f; //10.0,1.0e1,1.0e+1    e�� 10�� �����̷� f�� float �Ǽ��� ���ͷ��� ���̻�.  1e1=10 1e2=100 1e-1=0.1 ���ؿϷ�
			float f3 = 3.14e3f;  //e3�̸� 1000���ϴ°ǰ�? �׷� 3140�� �ǳ�
			double d = 1.23456789;
			System.out.printf("f1=%f, %e, %g%n",f1,f1,f1); //f�ε��Ҽ���,e exponent 10�� n������ ǥ�� , g�����ϰ� ǥ���Ҷ�
			System.out.printf("f2=%f, %e, %g%n",f2,f2,f2);  // �Ǽ����� �� ��¿� ���� �����ڰ� �̰�3���ε� %f�� ���� ���ٰ� ��. ����ΰ�?
			System.out.printf("f3=%f, %e, %g%n",f3,f3,f3);
			System.out.printf("f3=%-13f, %13e, %013g%n",f3,f3,f3);  //�� �ܰ迡�� ���� Ȱ���غ��ٰ� 13�־
			System.out.printf("d=%f%n",d);    
			System.out.printf("d=%14.10f%n",d);    //14.10 ��ü 14�ڸ��� �Ҽ���10�ڸ�
			System.out.printf("[12345678901234567890]%n"); //�̰� ������ �� ����ִ°�?
			System.out.printf("[%s]%n",url);
			System.out.printf("[%20s]%n",url);
			System.out.printf("[%-20s]%n", url); //���� ����
			System.out.printf("[%.8s]%n", url); //���ʿ��� 8���ڸ� ���
			
	}	
}
