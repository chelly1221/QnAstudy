class MyMathTest2 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
		// 위 두줄은 return a+b로 줄일수 있음
	}
	long subtract(long a, long b) { return a -b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a /b;}
}