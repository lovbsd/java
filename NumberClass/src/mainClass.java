
public class mainClass {

	public static void main(String[] args) {

		/*
		 * 
			main 프로그램 시작 ~ 끝
			main 함수에서 구동 C#, C++, ObjectiveC
		*/
		
		/*
		 	숫자(상수): 1 2 3 4 ~ 34 123 	
		  			2진수	: 0, 1							1111 1111 -> 255
		  			8진수	: 0 ~ 7		l8 -> 10	 9 -> 011
		  			10진수	: 0 ~ 9
		  			16진수	: 0 ~ 9 A B C ~ F(15) -> 		0xff	
		  		
		  	변수(공간): 그릇(크기) -> 담아 놓는다(데이터) variable
		  	 		  크기가 다 다르다, 종류도 다양
		  	 		  			  숫자, 소수, 문자, 문자열, 판정 
		  	 		 별명을 작명.
		  	 		 
		  	 		자료형 별명;  선언
		  	 		별명 = 값;   대입
		  	 		
		  	 		integer == 정수
		  	 		 
		  	 		int number; 	선언
		  	 		number = 123;	대입		  	 		
		 */
		
		int var;	// 정수  -2, 0, 12, 234 
		// integer == 자료형
		// var == 변수명
		
		var = 135;	// 대입
		// variable = value		
		var = 246;
		
		System.out.println( var );
		
		// 변수 명의 작명 규칙
		int a;	// ASCII Code	-> 97
		int A;	//				-> 65
		// 예약어 -> 누군가 정의되어 있는 언어
		// int int;
		// int 2a;	// 숫자는 뒤에 와야 한다
		int a2;
		// int 234;	// 상수는 사용불가
		int _abc;	
		// int -abc;	// 연산자는 사용 불가
		// int +abc;
		// int *abc;	// pointer
		int number_postion_char;
		int numberpostionchar;
		int numPosChar;	// 낙타기법	-> 활용이 많음
		int 마징가;		
		마징가 = 378;
		System.out.println(마징가);
		
		int icharPosEdit;
		
		icharPosEdit = 45;
		numPosChar = icharPosEdit;
		
		System.out.println(numPosChar);
		
		a = 35;
		// A = a;
		
		A = a2 = a;
		
		// 가능한 흔한 명칭은 피한다
		// object, length, number
		
		//
		
	}

}





