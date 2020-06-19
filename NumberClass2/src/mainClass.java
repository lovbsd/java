
public class mainClass {

	public static void main(String[] args) {
		
		int i;	// 변수 선언
		i = 1;
		i = 2;
		
		// 변수(그릇)의 종류
		// 수치형
		// 정수
		byte by;	// 1 byte == 8 bit	-> 0 ~ 255 -> 256개   1111 1111  0 -> '+'  1 -> '-'
		by = -128;	// -128 ~ 127
		System.out.println( by );
		
		short sh;	// 2 byte
		sh = 12345;
		System.out.println( sh );
		
		int in;		// 4 byte	-> 32 bit
		in = 123456789;
		System.out.println( in );		
		
		long lo;	// 8 byte
		lo = 32432465435435345L;
		System.out.println( lo );
		
		// 실수
		float f;	// 4 byte
		f = 123.4567f;
		System.out.println( f );
		
		double d;	// 8 byte
		d = 234.567891234453;
		System.out.println( d );
		
		// 문자형
		char c;		// 2 byte 	// character
					// a ~ z A ~ Z ASCII code (unicode)
		c = 'A';
		c = 'a';
		c = '+';
		c = '한';
		System.out.println( c );
		
		// c = 'ab';
		
		// 문자열(String)
		// String(class), Array(배열)
		String str;
		str = "Hello";
		System.out.println( str );
		
		str = "World";
		System.out.println( str );
		
		System.out.println( "abc" + 1 + 2 );
		System.out.println( 1 + "abc" + 2 );
		System.out.println( 1 + 2 + "abc" );
		
		// 판정형(참/거짓)		BOOL bool 	
		boolean b;	// 1 byte	(true(1)/false(0))		
		b = true; 
		System.out.println( b );
		b = false;
		System.out.println( b );
		
		// escape sequence
		// \n == 개행

		// \b == backspace
		System.out.printf("Hello\b\bWorld");
		// \t == 띄어쓰기
		
		// \' == '표현
		System.out.println("\'\'");
		
		// \" == "표현
		System.out.println("\"안녕하세요\"");
		
		// \\ = \표현
		System.out.println("\\반갑습니다\\");
	}

}








