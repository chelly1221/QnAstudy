package basic;

public class Switch_test {

	public static void main(String[] args) {
		int[] numList = new int[4];
		numList[0] = 0;
		numList[1] = 1;
		numList[2] = 2;
		numList[3] = 3;
		for (int i = 0; i < numList.length; i++) {
			switch (i) {

			case (0):
				System.out.printf("Value is %d\n", i);
				break;
			case (1):
				System.out.printf("Value is %d\n", i);
				break;
			case (2):
				System.out.printf("Value is %d\n", i);
				break;
			case (3):
				System.out.printf("Value is %d\n", i);
				break;

			}
		}
	}

}
