package main;

public class mainClass {

	public static void main(String[] args) {
		/*
			제어문 
			- 조건
				if
					if
					else
					else if
					
					논리 연산자: 	&&(AND), ||(OR) !(NOT)
					범위: 		> < >= <= == !=
					 
				switch		
					case
					break
			
			- 순환			
			- 제어절
			
			형식:
				조건( 조건성립 공식(true/false) ){
					처리
				} 
				
				if( number > 0 ){
					처리
				}
				
				if( number > 0 && number <= 10 && number != 5 ){
					처리
				}
				
				if( number < 5 ){
					처리1
				}
				if( number > 10 ){
					처리1
				}
				if( number < 5 || number > 10 ){
					처리1
				}
				
				if( 조건1 ){	조건1 == true
					처리1
				}
				else{		조건1 == false
					처리2
				}
				
				조건 분기 n개만큼의 조건
				if( 조건1 ){
					처리1
				}
				else if( 조건2 ){
					처리2
				}
				else if( 조건3 ){
					처리3
				}
				else{ 조건1 = 조건2 = 조건3 = false
					마지막 처리
				}			
		*/
		
		int number = 6;
		
		if(number > 5) {
			System.out.println("number는 5보다 크다");
		}
		
		if(number >= 6) {
			System.out.println("number는 6보다 크거나 같다");
		}
		
		if(number == 6) {
			System.out.println("number는 6이다");
		}
		
		if(number != 5) {
			System.out.println("number는 5가 아니다");
		}
		
		if(number >= 0 && number < 10) {
			System.out.println("number는 0부터 9사이의 수입니다");
		}
		
		if(number < 5 || number > 10) {
			System.out.println("number는 5보다 작거나 10보다 크다");
		}
		
		if(number > 10) {
			System.out.println("number는 10보다 크다");
		}
		else {	// number <= 10
			System.out.println("number는 10보다 작거나 같다");
		}
		
		if(number > 10) System.out.println("number는 10보다 크다");		
		else			System.out.println("number는 10보다 작거나 같다");
		
		// 삼항연산자	String = (조건)?"값1":"값2";
		String str;
		str = (number > 10)?"number는 10보다 크다":"number는 10보다 작거나 같다";
		System.out.println(str);
				
		System.out.println( (number > 10)?"number는 10보다 크다":"number는 10보다 작거나 같다" );
		
		// 조건 분기
		number = 85;
		
		if(number == 100) {
			System.out.println("100점입니다");
		}
		else if(number >= 90 && number < 100) {
			System.out.println("90점이상입니다");
		}
		else if(number >= 80 && number < 90) {
			System.out.println("80점이상입니다");
		}
		else {
			System.out.println("80점 미만입니다");
		}
		
		if(number == 100) 		System.out.println("100점입니다");
		else if(number >= 90) 	System.out.println("90점이상입니다");
		else if(number >= 80) 	System.out.println("80점이상입니다");
		else					System.out.println("80점 미만입니다");
		
		number = 95;
		if(number >= 80) 	System.out.println("80점이상입니다");		
		else if(number >= 90) 	System.out.println("90점이상입니다");
		else if(number == 100) 		System.out.println("100점입니다");
		else					System.out.println("80점 미만입니다");
		
		// 조건문 안에 조건문
		number = 86;
		if(number >= 80 && number < 90) {
			if(number >= 85) {
				System.out.println("합격입니다");
			}
			else {
				System.out.println("불합격입니다");
			}			
		}
		
		if(number >= 85 && number < 90) {			
		}
		if(number >= 80 && number < 85) {			
		}
		
		boolean b;		
		b = false;
		
		if(b == false) {
			System.out.println("b == false입니다");
		}
		if( !b ) {
			System.out.println("b == false입니다");
		}
		if( b ) {
			System.out.println("b == true입니다");
		}
		
		if(true) {
			// 무조건 실행
		}
	}

}








