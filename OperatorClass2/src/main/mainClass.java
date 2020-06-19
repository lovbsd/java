package main;

public class mainClass {

	public static void main(String[] args) {
		
		// 논리 연산자(true/false)
		/*
			&& 	AND	그리고
			||	OR  또는
			!	NOT	~아닌
		
			제어문과 같이 사용(if, while, do while)
			
			< > <= >= ==	비교연산자			
		*/
		int number = 0;
		
		/*
		  	AND	0 0 -> 0
		  		0 1 -> 0
		  		1 0 -> 0
		  		1 1 -> 1
		*/
		System.out.println( number > 0 && number < 10);
		/*
			OR 	0 0 -> 0
				0 1 -> 1
				1 0 -> 1
				1 1 -> 1
		*/
		System.out.println( number > 0 || number < 10);
		
		/*
			NOT	 	0 -> 1	1 -> 0
		*/	
		number = 5;
		System.out.println(number == 5);
		System.out.println(number != 5);
		
		System.out.println( !(number > 5 && number < 10) );		
		System.out.println( !(number < 5) );
		//					 number >= 5
		
		// 삼항연산자
		// 조건에 따라서 값을 대입
		/*
			value = ( 조건 ) ? '값1' : '값2' ;
		*/
		char c;		
		c = (number > 0)?'Y':'N';
		System.out.println("c = " + c);
		
		int n;
		n = (number < 5)?10:20;
		System.out.println("n = " + n);
		
		String str;		
		str = (number > 3)?"3보다 크다":"3보다 작다";
		System.out.println(str);
	}

}





