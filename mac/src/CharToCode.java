class CharToCode {
	public static void main(String []args) {
		char ch = 'A' ;  // char utf-8 =65
		int code = (int)ch; //convert character to integer
		
		System.out.printf("%c=%d(%#X)%n",ch,code,code);
		
		char hch = '가';   // char hch =0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}
}